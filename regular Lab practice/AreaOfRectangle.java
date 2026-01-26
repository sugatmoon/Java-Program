
// 2) Write a program to find out the area of Rectangle where length and  breadth 
//                       of the Rectangle must be taken from user from command line argument..
void main(String args[]) {
    double areaOfRectangle = Double.parseDouble(args[0]) * Double.parseDouble(args[1]);
    IO.print(areaOfRectangle);
}
