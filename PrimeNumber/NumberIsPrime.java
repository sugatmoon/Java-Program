package PrimeNumber;

public class NumberIsPrime {

    public static void main(String[] args) {
        int num = Integer.parseInt(IO.readln());

        if ( num < 1){
            System.out.println(num + " is not a prime number");
            System.exit(0);
        }
        else if ( num == 2 || num == 3 ){
            System.out.println(num + " is a prime number");
            System.exit(0);
            
        }
        else {
            
            for ( int i = 4; i < num /2; ++i ){
                
                if ( num % i == 0){
                    System.out.println(num + " is not a prime number");
                    System.exit(0);
                    
                }
            }
                    System.out.println(num + " is a prime number");
                    System.exit(0);
        }

    }





    
}
