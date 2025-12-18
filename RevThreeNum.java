void main() {

    int three_digit  = Integer.parseInt(IO.readln("Enter three digit number: "));

    int num1 = three_digit %10;

    three_digit /= 10;
    int inst = three_digit % 10;
    num1 = num1 * 10 + inst; 
    three_digit /= 10;
    num1 = num1 * 10 + three_digit;
    IO.println(num1);
    
    



}