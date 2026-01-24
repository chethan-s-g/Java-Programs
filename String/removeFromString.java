package String;

public class removeFromString {
    public static void main(String args[]) {
        removeFromString obj = new removeFromString();
        obj.removeInt("c1h2e3t4h5a6n7");
        obj.removeAllInt("c1h2e3t4h5a6n7");
        obj.removeAllString("c1h2e3t4h5a6n7");
        obj.removeAllChar("chethan","h");
    }

    // remove integers from string
    void removeInt(String str) {
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                temp = temp + str.charAt(i);
            }
        }
        System.out.println(temp);
    }

    // remove integers using in built method
    void removeAllInt(String str) {
        String temp = str.replaceAll("\\d", "");
        System.out.println(temp);
    }

    // remove string using in built method
    void removeAllString(String str) {
        String temp = str.replaceAll("\\D", "");
        System.out.println(temp);
    }

    // remove all char using in built method
    void removeAllChar(String str,String c) {
        String chara = c;
        String temp = str.replaceAll(chara, "");
        System.out.println(temp);
    }
}
