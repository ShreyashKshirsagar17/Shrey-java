package MatrixRotation;

import java.util.*;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 10, 50};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate Elements: " + duplicates);
    }
}