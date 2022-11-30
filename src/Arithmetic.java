public class Arithmetic {

    public static void division(int a, int b) throws ArithmeticException {
        System.out.println(a/b);
        if (a == 0 && b == 0) throw new ArithmeticException();

    }
}


