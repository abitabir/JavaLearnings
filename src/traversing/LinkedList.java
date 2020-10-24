package traversing;

//https://www.youtube.com/watch?v=0ODSrJcMT54 ooo I get it now Alhamdulillah XD I shoulda researched when freaking hum. doing Java practicals, uhuhn.

public class LinkedList {

    private ListNode last;
    private int lengthOfList;

    private class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public LinkedList() {
        last = null;
        lengthOfList = 0;
    }

    public int length() {
        return lengthOfList;
    }

    public boolean isEmpty() {
        return lengthOfList == 0;
    }

    public void createCircularLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(8);
        ListNode fifth = new ListNode(16);
        ListNode sixth = new ListNode(32);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = first;

        last = sixth;
    }

    public static void main(String[] args) {

        //CircularSinglyLinkedList csll = new CircularSinglyLinkedList();

    }

}
