package datatypes.primitive.numeric.integral.character;

// 16 Bit
// 0 -2^16 -1 = 65.535
public class TypeChar {
    public static void main(String[] args) {
        char c1 = 'a';
        System.out.println(c1);
        System.out.println((int) c1);

        c1++;
        System.out.println(c1);

        char elif = '۱';
        System.out.println(elif);

        // TL sign
        System.out.println((char) 8378);

        // Hexadecimal format
        System.out.println('\u00e7');
    }
}