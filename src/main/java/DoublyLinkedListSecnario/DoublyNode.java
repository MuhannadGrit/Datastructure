package DoublyLinkedListSecnario;

class DoublyNode {
    String song;
    DoublyNode next;
    DoublyNode prev;

    DoublyNode(String song) {
        this.song = song;
        this.next = null;
        this.prev = null;
    }
}