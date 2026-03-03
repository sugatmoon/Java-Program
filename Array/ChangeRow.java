public class ChangeRow {
    public static void main(String[] args) {
        int rsize1 = Integer.parseInt(IO.readln("Enter the size of Row: ") );
        int csize1 = Integer.parseInt(IO.readln("Enter the size of Column: "));
        int[][] arr =  new int[rsize1][csize1];

        for ( int i= 0; i< rsize1; ++i ){
            for ( int j = 0; j < csize1; ++j){
                arr[i][j] = Integer.parseInt(IO.readln("Enter the value :"));
            }
        }
        for ( int i= 0; i< rsize1; ++i ){
            for ( int j = 0; j < csize1; ++j){
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }


        int m = Integer.parseInt(IO.readln("Change row: "));
        int t, n = Integer.parseInt(IO.readln("Change row with: "));

        
            for ( int j = 0; j < csize1; ++j){
                t = arr[n-1][j];
                arr[n-1][j] = arr[m-1][j];
                arr[m-1][j] = t;
            }
        

        System.out.println("After Change the rows");
        for ( int i= 0; i< rsize1; ++i ){
            for ( int j = 0; j < csize1; ++j){
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }
    }
    
}
