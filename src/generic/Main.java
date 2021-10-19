package generic;

public class Main {
    public static void main(String[] args)
    {
        SList<Integer> list1 = new SList<>();
        System.out.println("Integer LinkedList created as list1 :");
        list1.add(100);
        list1.add(200);
        list1.add(300);
        System.out.println("list1 after adding 100,200 and 300 :");
        System.out.println(list1);
        list1.remove(200);
        System.out.println("list1 after removing 200 :");
        //System.out.println(list1);
        list1.printList();
        System.out.println();

        SList<String> list2 = new SList<>();
        System.out.println("String LinkedList created as list2");
        list2.add("hello");
        list2.add("world");
        list2.add("welcome");
        System.out.println("list2 after adding hello ,world and welcome:");
        System.out.println(list2);
        list2.remove("welcome");
        list2.printList();
        System.out.println();

        SList<Float> list3 = new SList<>();
        System.out.println("Float LinkedList created as list3");
        list3.add(20.25f);
        list3.add(50.42f);
        list3.add(30.99f);
        System.out.println("list3 after adding 20.25, 50.42 and 30.99 :");
        list3.printList();
        //System.out.println(list3);
    }
}