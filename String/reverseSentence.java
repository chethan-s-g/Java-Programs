package String;

public class reverseSentence {
    public static void main(String args[]) {
        String sentence = "Welcome to java programming";
        reverseSentence obj = new reverseSentence();
        obj.reverseWord(sentence); // emocleW ot avaj gnimmargorp
        obj.reverseWordAtEvenPalce(sentence); // emocleW to avaj programming
        obj.reverseWordAtOddPalce(sentence); // Welcome ot java gnimmargorp
    }

    // reverse words in sentence at same position
    void reverseWord(String str) {
        String arr[] = str.split(" ");
        for (String s : arr) {
            for (int i = s.length() - 1; i >= 0; i--) {
                System.out.print(s.charAt(i));
            }
            System.out.print(" ");
        }
        System.out.println();
    }

    // reverse words in sentence at even position
    void reverseWordAtEvenPalce(String str) {
        String arr[] = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            boolean b = i % 2 == 0 ? true : false;
            if (b) {
                for (int j = arr[i].length() - 1; j >= 0; j--) {
                    System.out.print(arr[i].charAt(j));
                }
            } else {
                System.out.print(arr[i]);
            }
            System.out.print(" ");
        }
        System.out.println();
    }

    // reverse words in sentence at odd position
    void reverseWordAtOddPalce(String str) {
        String arr[] = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            boolean b = i % 2 == 0 ? false : true;
            if (b) {
                for (int j = arr[i].length() - 1; j >= 0; j--) {
                    System.out.print(arr[i].charAt(j));
                }
            } else {
                System.out.print(arr[i]);
            }
            System.out.print(" ");
        }
    }
}
