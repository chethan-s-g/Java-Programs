package Integer;

public class ConvertInt {
    public static void main(String[] args) {
        // returns no of bit used
        System.out.println(Integer.bitCount(17));

        // converts to binary
        System.out.println(Integer.toHexString(17));
        System.out.println(Integer.toBinaryString(17));
        System.out.println(Integer.toOctalString(17));

        // checks even odd based on binary number
        System.out.println(Integer.toBinaryString(17));
        System.out.println(((17 & 17) == 0) ? "Even" : "odd");
    }
}
