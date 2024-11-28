package DoublyLinkedListSecnario;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        playListWithCustomLinkedList();
        System.out.println("--------------------------- --------------------------- --------------------------- ");
        playListWithLinkedList();
    }


    public static void playListWithLinkedList(){
        LinkedList<String> playlist = new LinkedList<>();

        // Add songs to the playlist
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");

        // Playing songs forward
        System.out.println("Playing forward:");
        playForward(playlist);

        // Playing songs backward
        System.out.println("\nPlaying backward:");
        playBackward(playlist);
    }

    public static void playForward(LinkedList<String> playlist) {
        ListIterator<String> iterator = playlist.listIterator();
        while (iterator.hasNext()) {
            System.out.println("Playing: " + iterator.next());
        }
    }

    // Play songs backward
    public static void playBackward(LinkedList<String> playlist) {
        ListIterator<String> iterator = playlist.listIterator(playlist.size());
        while (iterator.hasPrevious()) {
            System.out.println("Playing: " + iterator.previous());
        }
    }

    public static void playListWithCustomLinkedList(){
        Playlist playlist = new Playlist();
        playlist.addSong("Song 1");
        playlist.addSong("Song 2");
        playlist.addSong("Song 3");
        playlist.addSong("Song 4");

        System.out.println("Playlist forward:");
        playlist.playForward();

        System.out.println("\nRemoving 'Song 2':");
        playlist.removeSong("Song 2");

        System.out.println("\nPlaylist forward:");
        playlist.playForward();

        System.out.println("\nPlaylist backward:");
        playlist.playBackward();

        System.out.println("\nRemoving 'Song 4':");
        playlist.removeSong("Song 4");

        System.out.println("\nPlaylist forward:");
        playlist.playForward();

        System.out.println("\nRemoving 'Song 1':");
        playlist.removeSong("Song 1");

        System.out.println("\nPlaylist forward:");
        playlist.playForward();
    }
}