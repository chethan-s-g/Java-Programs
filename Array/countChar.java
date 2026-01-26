package Array;

import java.util.*;

public class countChar {
    public static void main(String[] args) {
        String word = "Chethan";
        countChar obj = new countChar();
        obj.countCharByMap(word);
    }

    // count char in string using map
    void countCharByMap(String str) {
        char[] ar = str.toCharArray();
        HashMap<Character, Integer> hp = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            char c = ar[i];
            if (c != 32) {
                hp.put(c, hp.getOrDefault(c, 0) + 1);
            }
        }
        System.out.println(hp);
    }

}
