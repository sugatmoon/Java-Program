package Geometric;

public  class Geometric{
void main() {

    int side = Integer.parseInt(IO.readln("Enter the side = "));
    int length = Integer.parseInt(IO.readln("Enter the length = "));
    int width = Integer.parseInt(IO.readln("Enter the width = "));

    double radius = Double.parseDouble(IO.readln("Enter the Radius ="));



     IO.println("Area of Square: " + Logic.calculateArea(side));
     IO.println("Area of Rectangle: " + Logic.calculateArea(length, width));
     IO.println("Area of Circle: " + Logic.calculateArea(radius));
}
}

