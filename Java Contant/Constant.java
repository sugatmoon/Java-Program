public class Constant {
    static {
        IO.println("Constant Static Block");
    }

    public static final int VALUE = me();
    static int me(){
        return 88;
    }
}
