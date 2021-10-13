public class SList {
    SNode head;
     static class SNode {
        int data;
        SNode next;
        SNode(int data) {
            this.data = data;
            next = null;
        }
    }
    public static SList insert(SList list, int data) {
        SNode newNode = new SNode(data);
        newNode.next = null;
        if (list.head == null)
            list.head = newNode;
        else {
            SNode last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }
    public static void printList(SList list)
    {
        SNode currNode = list.head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }
    public static SList deleteByKey(SList list, int key)
    {
        SNode currNode = list.head, prev = null;
        if (currNode != null && currNode.data == key) {
            list.head = currNode.next;
            System.out.println(key + " found and deleted");
            return list;
        }
        while (currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode != null) {
            prev.next = currNode.next;
            System.out.println(key + " found and deleted");
        }
        if (currNode == null) {
            System.out.println(key + " not found");
        }
        return list;
    }
    public static void main(String[] args)
    {
        SList list = new SList();
        list=insert(list, 1);
        list=insert(list, 2);
        list=insert(list, 3);
        list=insert(list, 4);
        list=insert(list, 5);
        list=insert(list, 6);
        list=insert(list, 7);
        list=insert(list, 8);
        printList(list);
        list=deleteByKey(list, 1);
        printList(list);
        list=deleteByKey(list, 4);
        printList(list);
        list=deleteByKey(list, 10);
        printList(list);
    }
}

