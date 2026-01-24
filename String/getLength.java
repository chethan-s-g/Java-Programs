package String;

public class getLength {
    public static void main(String args[]) {
        String word = "Chethan S G";
        getLength obj = new getLength();
        obj.getlength(word);

    }

    // using in-built method in string
    public void getlength(String str) {
        int len = str.length();
        System.out.println(len);
    }

}
