public class Main {
    public static void main(String[] args) {

        try {
            Arithmetic.division(42,0);

        } catch (ArithmeticException b) {
            System.out.println("you can't divide by 0!");
        }


        try {
            NullEx.print(null);
        } catch (NullPointerException n) {
            System.out.println("parameter s in null!");
        }

        int[] m = new int[2];
        m[8] = 5;

        try {
            Array.showArray(m);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
