
// 3) Write a program to find the sum and average of three numbers where  number must be taken from command line argument.


void main(String args[]) {
    double avgOfThree = (Double.parseDouble(args[0]) + Double.parseDouble(args[1]) + Double.parseDouble(args[2]))/3;
    IO.print(avgOfThree);

}