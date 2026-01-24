package Array;

import java.util.*;
import java.util.Map;

public class countFrequency {

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 6, 5, 2, 8 };
        countFrequency obj = new countFrequency();
        obj.count(arr);
        obj.countFreq(arr);
    }

    // using hashmap
    void count(int ar[]) {
        Map<Integer, Integer> hp = new HashMap<>();
        for (int x : ar) {
            hp.put(x, hp.getOrDefault(x, 0) + 1);
        }
        System.out.println(hp);
    }

    // using hashmap using contains check
    void countFreq(int ar[]) {
        Map<Integer, Integer> hp = new HashMap<>();
        for (int x : ar) {
            if (hp.containsKey(x)) {
                hp.put(x, hp.get(x) + 1);
            } else {
                hp.put(x, 1);
            }
        }
        System.out.println(hp);
    }

}