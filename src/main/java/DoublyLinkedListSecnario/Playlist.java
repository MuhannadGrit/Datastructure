package DoublyLinkedListSecnario;

public class Playlist {
    private DoublyNode head;
    private DoublyNode tail;

    //Method to add song to the playlistS
    // Add a song to the playlist
    public void addSong(String song) {
        DoublyNode newNode = new DoublyNode(song);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Play songs forward
    public void playForward() {
        DoublyNode current = head;
        while (current != null) {
            System.out.println("Playing: " + current.song);
            current = current.next;
        }
    }

    // Play songs backward
    public void playBackward() {
        DoublyNode current = tail;
        while (current != null) {
            System.out.println("Playing: " + current.song);
            current = current.prev;
        }
    }

    public void removeSong(String song) {
        if (head == null) {
            System.out.println("Playlist is empty, cannot remove song.");
            return;
        }
        DoublyNode current = head;
        while (current != null && !current.song.equals(song)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Song not found in the playlist.");
            return;
        }
        // I am checking if Only one node in the list
        if (current == head && current == tail) {
            head = tail = null;
            // Remove the head node
        } else if (current == head) {
            head = head.next;
            head.prev = null;
            // Remove the tail node
        } else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            // Remove a middle node
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        System.out.println("Removed song: " + song);
    }

}
