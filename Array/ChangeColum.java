public class ChangeColum {
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


        int m = Integer.parseInt(IO.readln("Change Columns: "));
        int t, n = Integer.parseInt(IO.readln("Change Columns with: "));

        
            for ( int j = 0; j < csize1; ++j){
                t = arr[j][n-1];
                arr[j][n-1] = arr[j][m-1];
                arr[j][m-1]= t;
            }
        

        System.out.println("After Change the Colums");
        for ( int i= 0; i< rsize1; ++i ){
            for ( int j = 0; j < csize1; ++j){
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }
    }
    
}
