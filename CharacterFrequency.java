package work1;

import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {

        String str = "programming";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Character Frequency:");

        for (char key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}