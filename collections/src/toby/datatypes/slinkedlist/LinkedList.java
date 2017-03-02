package toby.datatypes.slinkedlist;

public class LinkedList<E> {
    
    private int size;
    private Node<E> head;
    private Node<E> tail;
    

    public Node<E> getHead() {
        return head;
    }
    
    public int size()
    {
        return size;
    }
    
    public Node<E> appendTail(E  data)
    {
        Node <E> n = new Node<E>(data);
        
        if (size == 0) {
            head = n;
            tail = n;
        }
        else
        {
            tail.setNext(n);
            tail = n;
        }
        size++;
        return n;
    }
    
    public String toString()
    {
        StringBuilder sb = new StringBuilder("[");
        
        Node<E> n = head;
        while (n != null) {
            sb.append("'").append(n.toString()).append("'");
            n = n.getNext();
            if (n != null)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
        
    }
    
}
