import java.util.Arrays;

public class WaveNumbers {
    public static void main(String[] args) {
           
        
            int  n = Integer.parseInt(IO.readln("Number of Integer You Want in a wave: "));
    
            int [ ] toSortArray = new int[n];

        for ( int i = 0 ; i < n ; ++i){
            toSortArray[i] = Integer.parseInt(IO.readln("Enter the Integer Number : "));
        }

        Arrays.sort(toSortArray);
        int p = 0;
        --n;
        while (p < n) {
            System.out.print(toSortArray[p] + " " + toSortArray[n] + " ");
            ++ p;
            --n;
            if ( n  ==  p){
                System.out.println(toSortArray[p]);
                break;
            }            
        }
    }
}
