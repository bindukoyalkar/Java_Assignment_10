package generic;

public class SList<T> {
    SNode<T> head;
    SList() { this.head = null; }
    void add(T data)
    {
        SNode<T> newNode = new SNode<>(data);
        if (this.head == null) {
            head = newNode;
        }
        else {
            SNode<T> list = head;
            while (list.next != null) {
                list = list.next;
            }
            list.next = newNode;
        }
    }
    void remove(T key)
    { SNode currNode = head, prev = null;
        if (currNode != null && String.valueOf(currNode.data).equals(String.valueOf(key))) {
            currNode = currNode.next;
        }
        while (currNode != null && !String.valueOf(currNode.data).equals(String.valueOf(key))) {
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode != null) {
            prev.next = currNode.next;
        }
        if (currNode == null) {
            System.out.println(key + " not found");
        }
    }
    public String toString()
    {
        String S = "";
        SNode<T> list = head;
        if (list == null)
            return S + "";
        while (list.next != null) {
            S += String.valueOf(list.data) + " -> ";
            list = list.next;
        }
        S += String.valueOf(list.data);
        return S;
    }
    public void printList()
    {
        SNode currNode = head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("null");
        System.out.println();
    }
}

