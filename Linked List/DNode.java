public class DNode {
    int data;
    Node prev;
    Node next;
    DNode(int x)
    {
        this.data=x;
        this.next=null;
        this.prev=null;
    }
}