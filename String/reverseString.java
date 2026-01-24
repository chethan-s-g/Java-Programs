package String;

public class reverseString {
    public static void main(String args[]) {
        reverseString obj = new reverseString();
        obj.reverse("Chethan S G");
        obj.reverseByStringBuffer("Chethan S G");
        obj.reverseByStringBuilder("Chethan S G");
        obj.reverseByStream("Chethan S G");

    }

    // approach one - iterating in reverse order
    void reverse(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    // approach two - Strig buffer in-built reverse()
    void reverseByStringBuffer(String str) {
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }

    // approach three - Strig builder in-built reverse()
    void reverseByStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }

    // approach four - streams
    void reverseByStream(String str) {
        // Reverse Using a Custom Collector
        String reversed = str.chars()
                .mapToObj(c -> (char) c)
                .collect(StringBuilder::new,
                        (sb, c) -> sb.insert(0, c),
                        (sb1, sb2) -> sb2.insert(0, sb1))
                .toString();

        System.out.println(reversed);
    }
}
