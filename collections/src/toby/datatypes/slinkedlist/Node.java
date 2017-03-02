package toby.datatypes.slinkedlist;

public class Node<E> {

    private E data;
    private Node<E> next;

    public Node(E data) {
        this.data = data;
    }
    
    public E getData()
    {
        return data;
    }
    
    public void setNext(Node<E> n) {
        this.next = n;
    }
    
    public Node<E> getNext() {
        return next;
    }
    
    public String toString() {
        return data.toString();
    }
}
