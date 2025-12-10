
// Write a Java program to verify whether a number is prime or not where number must be taken from command line argument.

void main(String args[]){
    int num = Integer.parseInt(args[0]);

    if (num < 0 ) {

        if ( num == 0) {
            IO.print("You have type Zero (0), This is not a prime number.");
        } 
        else {
            IO.print("This is Nagative Number.");
        }
        
    } else
        if(num%2 != 0) {
            System.out.printf("%d is prime number", num);
        }
        else
            IO.print("This is Not a prime Number");
    
}