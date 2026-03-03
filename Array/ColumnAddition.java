

public class ColumnAddition {
    public static void main(String[] args) {
        int rsize1 = Integer.parseInt(IO.readln("Row of Array1: "));
        int csize1 = Integer.parseInt(IO.readln("Column of Array1: "));

        int arr1[][] = new int[rsize1][csize1];

        for ( int i= 0; i< rsize1; ++i ){
            for ( int j = 0; j < csize1; ++j){
                arr1[i][j] = Integer.parseInt(IO.readln("Enter the value :"));
            }
        }
        int sumOfColumn = 0;
        for(int i =0; i< csize1; ++i){
            sumOfColumn = 0;
            for(int j =0; j< rsize1; ++j){
            sumOfColumn = arr1[j][i] + sumOfColumn;
        }
        System.out.println("Column " + i + " -> " + sumOfColumn);
        }

    }
}
