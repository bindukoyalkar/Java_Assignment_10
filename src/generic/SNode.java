package generic;

public class SNode<T> {
    T data;
    SNode<T> next;
    SNode(T data)
    {   this.data = data;
        this.next = null;
    }
}