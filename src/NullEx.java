import java.util.Locale;

public class NullEx {

    public static void print(String s) throws NullPointerException {
        String m = s.toLowerCase();
        if (s==null) throw new NullPointerException();
        System.out.println("EHHH!");
    }
}

class NullExcept extends Exception {
    private static String msg = "NullExcept : s is null";

    public NullExcept() {
        super(msg);
    }
}