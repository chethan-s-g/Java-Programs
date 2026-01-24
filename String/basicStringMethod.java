package String;

public class basicStringMethod {
    public static void main(String args[]) {
        String word = "Chethan S G";
        basicStringMethod obj = new basicStringMethod();
        obj.getlength(word);
        obj.contact(word);

    }

    // using in-built method in string to get length
    public void getlength(String str) {
        int len = str.length();
        System.out.println(len);
    }
    
    // using in-built method in string concat
    public void contact(String str) {
        System.out.println(str+str);
    }
    
}
