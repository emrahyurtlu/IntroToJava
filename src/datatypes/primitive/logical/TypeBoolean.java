package datatypes.primitive.logical;

public class TypeBoolean {
    public static void main(String[] args) {
        System.out.println(true);
        System.out.println(false);
        System.out.println(Boolean.logicalAnd(true, true));
        System.out.println(Boolean.logicalAnd(true, false));
        System.out.println(Boolean.logicalOr(true, false));
        System.out.println(Boolean.logicalOr(false, false));
        System.out.println(Boolean.logicalXor(false, false));
        System.out.println(Boolean.logicalXor(false, true));
        System.out.println(Boolean.logicalXor(true, false));
        System.out.println(Boolean.logicalXor(true, true));
    }
}
