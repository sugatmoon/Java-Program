public class SumOfOppDiagonal {
    public static void main(String[] args) {
        int rsize1 = Integer.parseInt(IO.readln("Row of Array1: "));
        int csize1 = Integer.parseInt(IO.readln("Column of Array1: "));

        int arr1[][] = new int[rsize1][csize1];

        for ( int i= 0; i< rsize1; ++i ){
            for ( int j = 0; j < csize1; ++j){
                arr1[i][j] = Integer.parseInt(IO.readln("Enter the value :"));
            }
        }
        for ( int i= 0; i< rsize1; ++i ){
            for ( int j = 0; j < csize1; ++j){
                System.out.print(arr1[i][j] + " ");
            }System.out.println();
        }

        int sumOfDig = 0;
        int x = 0;
        int y = csize1-1;
        while (y >= 0 ) {
            sumOfDig = sumOfDig + arr1[x][y];
            ++x;
            --y;
        }

        System.out.println("Sum of Opposite Diagonal-> " + sumOfDig);
    }
}
