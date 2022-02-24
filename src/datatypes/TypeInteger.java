package datatypes;

// Public sınıf kendi ismini taşıyan dosyada bulunmak zorundadır.
public class TypeInteger {
    public static void main(String[] args) {

        int integerMax = 2_147_483_647;
        System.out.println("Integer Max Value: " + integerMax);
        // Output: Integer Max Value: 2147483647

        integerMax++;
        System.out.println("Integer Max+1 Value: " + integerMax);
        // Output: Integer Max+1 Value: -2147483648
    }
}