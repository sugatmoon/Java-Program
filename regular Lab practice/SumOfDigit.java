
// 4) Write a program to accept a two digit number from command line argument and find the sum of digit.
void main(String args[]) {

    int twoDigit = Integer.parseInt(args[0]);
    int digi1 = twoDigit%10;
    int digi2 = twoDigit/ 10;

    System.out.println(digi1+digi2);
    
}