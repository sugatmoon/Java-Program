public class SortCharArrayAsc {
        public static void main(String[] args) {
            
        
        String word = IO.readln("Enter the word: ");

       
        char temp,toSortArray[] = word.toCharArray();

        int n = word.length();

        for ( int i = 0; i < n ; ++i){

            for ( int j = i +1; j < n; ++j){

                if ( toSortArray[i] > toSortArray[j]){

                    temp = toSortArray[i];
                    toSortArray[i] = toSortArray[j];
                    toSortArray[j] = temp;

                }

            }
        }
        for ( char x : toSortArray){
            System.out.print(x + " ");
        }

        }        
}
