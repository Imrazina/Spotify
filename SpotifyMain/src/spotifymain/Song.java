/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotifymain;

/**
 *
 * @author shabossova
 */
public class Song {
    
    private String interpret;
    private String název;
    private Cas délka;
    private String žánr;

    public Song(String interpret, String název, Cas délka, String žánr) {
        this.interpret = interpret;
        this.název = název;
        this.délka = délka;
        this.žánr = žánr;
    }

    public String getInterpret() {
        return interpret;
    }

    public String getNázev() {
        return název;
    }

    public Cas getDélka() {
        return délka;
    }

    public String getŽánr() {
        return žánr;
    }

    public int časSekundy() {
        return délka.prevedNaSekundy();
    }

    @Override
    public String toString() {
        return "Interpret: " + interpret + ", Název: " + název + ", Délka: " + délka + ", Žánr: " + žánr;
    }
    
}
