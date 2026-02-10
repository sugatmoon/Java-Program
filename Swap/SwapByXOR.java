public class SwapByXOR {
    public static void main(String[] args) {
        int i = 8;
        int j = 2;

        i = i ^ j;
        j = i ^ j;
        i = i ^ j;



        
        System.out.println(i);
        System.out.println(j);




    }
}
