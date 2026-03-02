



public class Multiplication {
    public static void main(String[] args) {

        int rsize1 = Integer.parseInt(IO.readln("Row of Array1: "));
        int csize1 = Integer.parseInt(IO.readln("Column of Array1: "));
        int rsize2 = Integer.parseInt(IO.readln("Row of Array2: "));
        int csize2 = Integer.parseInt(IO.readln("Column of Array2: "));

        int arr1[][] = new int[rsize1][csize1];
        int arr2[][] = new int[rsize2][csize2];
        for ( int i= 0; i< rsize1; ++i ){
            for ( int j = 0; j < csize1; ++j){
                arr1[i][j] = Integer.parseInt(IO.readln("Enter the value :"));
            }
        }

        for ( int i= 0; i< rsize2; ++i ){
            for ( int j = 0; j < csize2; ++j){
                arr2[i][j] = Integer.parseInt(IO.readln("Enter the value :"));
            }
        }
        // newly formed array
        int newArray[][] = new int[rsize1][csize2];
        for (int i=0 ; i <rsize1 ; ++ i ){
            for ( int j = 0; j < csize2 ; ++j){
                newArray[i][j] = 0;
                for (int k = 0; k < rsize2 ; ++ k){
                    newArray[i][j] = newArray[i][j] + arr1[i][k] * arr2[k][j];
                }
            }
        }
        for ( int i= 0; i< rsize1; ++i ){
            for ( int j = 0; j < csize2; ++j){
                IO.print(newArray[i][j] + "[" + i + "]" + "[" + j + "]" + " " );
            }
            IO.println();
        }
    }
}
