/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotifymain;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Playlist {
    private String jméno;
    private List<Song> songy;

    public Playlist(String jméno) {
        this.jméno = jméno;
        this.songy = new ArrayList<>();
    }

    public void vypišSongy() {
        for (Song song : songy) {
            System.out.println(song);
        }
    }

    public void vypišSongy(String žánr) {
        for (Song song : songy) {
            if (song.getŽánr().equalsIgnoreCase(žánr)) {
                System.out.println(song);
            }
        }
    }

    public void přidejSong(Song song) {
        songy.add(song);
    }

    public void náhodněZamíchejSongy() {
        Collections.shuffle(songy, new Random());
    }

    public int délkaPlaylistu() {
        int délka = 0;
        for (Song song : songy) {
            délka += song.časSekundy();
        }
        return délka;
    }

    public Song najdiNejdelšíSkladbu() {
        Song nejdelší = null;
        int maxDélka = 0;
        for (Song song : songy) {
            if (song.časSekundy() > maxDélka) {
                maxDélka = song.časSekundy();
                nejdelší = song;
            }
        }
        return nejdelší;
    }

    public void uložPlaylistDoSouboru(String soubor) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(soubor))) {
            writer.println(jméno);
            for (Song song : songy) {
                writer.println(song.getInterpret() + ";" + song.getNázev() + ";" + song.getDélka() + ";" + song.getŽánr());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void načístPlaylistZeSouboru(String soubor) {
        songy.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(soubor))) {
            jméno = reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");
                if (data.length == 4) {
                    String interpret = data[0];
                    String název = data[1];
                    String[] časData = data[2].split(":");
                    int minuty = Integer.parseInt(časData[0]);
                    int sekundy = Integer.parseInt(časData[1]);
                    Cas délka = new Cas(minuty, sekundy);
                    String žánr = data[3];
                    Song song = new Song(interpret, název, délka, žánr);
                    songy.add(song);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}