import java.util.Arrays;

public class ColumenAdd3D {
    public static void main(String[] args) {
        int size = Integer.parseInt(IO.readln("Size: "));

        int arr[][] = new int[size][size];
        
        for ( int i = 0;i < size; ++ i){
           for ( int j = 0;j < size; ++ j){
            
                arr[i][j] = Integer.parseInt(IO.readln("Enter the Value: "));
        } 
        }

        for ( int i = 0;i < size; ++ i){

            int sumOfColumn = 0;
           for ( int j = 0;j < size; ++ j){
                sumOfColumn = sumOfColumn + arr[j][i];
            }
            System.out.println("Sum of Column -> " + sumOfColumn);          
}
}
}
