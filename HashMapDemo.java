package MatrixRotation;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Shreyash");
        map.put(2, "Rahul");
        map.put(3, "Amit");

        System.out.println("Student Details:");

        for(Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
