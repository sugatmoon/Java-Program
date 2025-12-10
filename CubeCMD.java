
// 1) Write a program to find out the cube of a number where number must be taken from command line argument.


void main(String args[]) {

    int cubeOfNumber = Integer.parseInt(args[0]);

    IO.print(cubeOfNumber*cubeOfNumber*cubeOfNumber);

}