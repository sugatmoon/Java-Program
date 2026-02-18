
public class SortArrayAsc {
 
    public static void main(String[] args) {
        
        int n = Integer.parseInt(IO.readln("Number of Integer You Want to Sort: "));
        int temp;
        int [ ] toSortArray = new int[n];

        for ( int i = 0 ; i < n ; ++i){
            toSortArray[i] = Integer.parseInt(IO.readln("Enter the Integer Number : "));
        }

        for ( int i = 0; i < n ; ++i){

            for ( int j = i +1; j < n; ++j){

                if ( toSortArray[i] > toSortArray[j]){

                    temp = toSortArray[i];
                    toSortArray[i] = toSortArray[j];
                    toSortArray[j] = temp;

                }

            }
        }
        for ( int x : toSortArray){
            System.out.print(x + " ");
        }


    }
}
