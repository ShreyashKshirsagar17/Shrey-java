package MatrixRotation;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");

        System.out.println(list);

        list.remove("Blue");

        System.out.println("After Removal:");
        System.out.println(list);
    }
}
