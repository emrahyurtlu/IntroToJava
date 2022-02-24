package datatypes.primitive.numeric.integral.integer;

// Public sınıf kendi ismini taşıyan dosyada bulunmak zorundadır.
public class TypeInt {
    public static void main(String[] args) {

        System.out.println("Integer Max Value: " + Integer.MAX_VALUE);

        System.out.println("Integer Min Value: " + Integer.MIN_VALUE);

        int integerMax = 2_147_483_647;
        System.out.println("Integer Max Value: " + integerMax);
        // Output: Integer Max Value: 2147483647

        integerMax++;
        System.out.println("Integer Max+1 Value: " + integerMax);
        // Output: Integer Max+1 Value: -2147483648

        int less = Integer.compare(25, 45);
        System.out.println("25 is less than 45 = " + less);

        int equal = Integer.compare(25, 25);
        System.out.println("25 is equal to 25 = " + equal);

        int great = Integer.compare(45, 25);
        System.out.println("45 is greater than 25 = " + great);

        var max = Math.max(3, 5);
        System.out.println("Maximum number in {3, 5} is " + max);

        var min = Math.min(3, 5);
        System.out.println("Minimum number in {3, 5} is " + min);

        int number = 10;
        System.out.println("Byte value of number = " + (byte) number);
        System.out.println("Integer value of number = " + number);
        System.out.println("double value of number = " + (double) number);
        System.out.println("Long value of number = " + (long) number);
        System.out.println("Float value of number = " + (float) number);
    }
}