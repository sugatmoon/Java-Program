import java.util.Arrays;

public class SortArrayByArrays {
 public static void main(String[] args) {


            int n = Integer.parseInt(IO.readln("Number of Integer You Want to Sort: "));

            int [ ] toSortArray = new int[n];

        for ( int i = 0 ; i < n ; ++i){
            toSortArray[i] = Integer.parseInt(IO.readln("Enter the Integer Number : "));
        }

        for ( int x : toSortArray){
            System.out.print(x + " ");
        }
        IO.println();

        // Utility Class Arrays
        Arrays.sort(toSortArray);
            
        
        for ( int x : toSortArray){
            System.out.print(x + " ");
        }

  
    }
}