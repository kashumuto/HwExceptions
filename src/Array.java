import java.util.Arrays;

public class Array {
    public static void showArray(int[] array) throws ArrayIndexOutOfBoundsException {
        for (int i=0;i<array.length; i++) {
            System.out.println(array[i]);
            if (array[i]<3) throw new ArrayIndexOutOfBoundsException();
            System.out.println(Arrays.toString(array));
        }
    }
}

class OutOfIndex extends Exception {
    private static String msg = "OutOfIndex : array is out of index!";

    public OutOfIndex() {
        super(msg);
    }
}