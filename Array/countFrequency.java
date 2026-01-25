package Array;

import java.util.*;
import java.util.Map;

public class countFrequency {

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 6, 5, 2, 8 };
        countFrequency obj = new countFrequency();
        obj.count(arr);
        obj.countFreq(arr);
        obj.countFreqByAxilaryArray(arr);
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

    // using two array
    void countFreqByAxilaryArray(int ar[]) {
        boolean arr[] = new boolean[ar.length];
        for (int i = 0; i < ar.length; i++) {
            int count = 0;
            boolean c = arr[i];
            if (c == false) {
                for (int j = 0; j < ar.length; j++) {
                    int a = ar[i];
                    int b = ar[j];
                    if (a == b) {
                        count++;
                        arr[j] = true;
                        arr[i] = true;
                    } 
                }
                System.out.print(ar[i] + ":" + count +","+" ");
            }
        }

    }
}