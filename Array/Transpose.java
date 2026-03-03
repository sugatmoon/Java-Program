public class Transpose {
    public static void main(String[] args) {
        int rsize = Integer.parseInt(IO.readln("Size of row matrix"));
        int csize = Integer.parseInt(IO.readln("Size of column matrix"));

        int arr[][] = new int[rsize][csize];
        for ( int i= 0; i< rsize; ++i ){
            for ( int j = 0; j < csize; ++j){
                arr[i][j] = Integer.parseInt(IO.readln("Enter the value :"));
            }
        }
    w
        for ( int i= 0 ; i < rsize; ++i){
            for ( int j= 0 ; j < csize; ++j){
        
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }



    }
}
