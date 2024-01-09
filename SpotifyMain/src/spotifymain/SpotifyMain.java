/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spotifymain;

/**
 *
 * @author shabossova
 */
public class SpotifyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Cas čas1 = new Cas(3, 45);
         Cas čas2 = new Cas(2, 30);

        // Создание объектов класса Song
        Song song1 = new Song("Исполнитель 1", "Песня 1", čas1, "Рок");
        Song song2 = new Song("Исполнитель 2", "Песня 2", čas2, "Поп");

        // Создание объекта класса Playlist
        Playlist playlist = new Playlist("Мой плейлист");

        // Добавление песен в плейлист
        playlist.přidejSong(song1);
        playlist.přidejSong(song2);

        // Вывод информации о песнях в плейлисте
        System.out.println("Песни в плейлисте:");
        playlist.vypišSongy();

        // Вывод информации о песнях определенного жанра
        System.out.println("\nПесни жанра Рок:");
        playlist.vypišSongy("Рок");

        // Запись плейлиста в файл
        playlist.uložPlaylistDoSouboru("mojí_plejlist.csv");

        // Очистка плейлиста и загрузка из файла
        playlist = new Playlist("Новый плейлист");
        playlist.načístPlaylistZeSouboru("mojí_plejlist.csv");

        // Вывод песен из загруженного плейлиста
        System.out.println("\nПесни из загруженного плейлиста:");
        playlist.vypišSongy();
    }
}
    
    

