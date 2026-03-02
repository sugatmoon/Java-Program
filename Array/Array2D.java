
public class Array2D {
    public static void main(String[] args) {
    


        int sizeOfColoum = Integer.parseInt(IO.readln("Enter the size of Colume: "));
        int sizeOfRow = Integer.parseInt(IO.readln("Enter the size of row: "));


        int arr2d[][] = new int[sizeOfRow][sizeOfColoum];

        //adding data in the 2d array
        for ( int i= 0; i< sizeOfRow; ++i ){
            for ( int j = 0; j < sizeOfColoum; ++j){
                arr2d[i][j] = Integer.parseInt(IO.readln("Enter the value :"));
            }
        }

        // for reading the data throug2d array
        for ( int i= 0; i< sizeOfRow; ++i ){
            for ( int j = 0; j < sizeOfColoum; ++j){
                IO.print(arr2d[i][j] + "[" + i + "]" + "[" + j + "]" + " " );
            }
            IO.println();
        }
        
    }
}
