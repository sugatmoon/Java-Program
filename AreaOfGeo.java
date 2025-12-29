// Assignment  01:
// Write a Java program that defines method overloading to calculate the area of geometric shapes. 
// Implement the following methods:
// Coding Requirements :
// Methods [Access Modifier is public]
// calculateArea(int side): Returns the area of a square (side * side).
// calculateArea(int length, int width): Returns the area of a rectangle (length * width).
// calculateArea(double radius): Returns the area of a circle (PI * radius * radius).
// Take main method to work with above requirement. 



void main() {
    IO.println("Area of Squre :"+calculateArea(25));   
    IO.println("Area of Circle: "+calculateArea(12.5));   
    IO.println("Area Reactangle: "+calculateArea(26,34));   
}
int side;
int length;
int width;
double PI = 3.14;
public int calculateArea(int side){
    return (side * side);
}
public int calculateArea(int length, int width){
        return (length * width);
} 
public double calculateArea(double radius){
        return (PI * radius * radius);
} 