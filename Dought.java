// void main() {
//     int balance = Integer.parseInt(IO.readln());
//     double interest = Double.parseDouble(IO.readln());
//     balance = (int)(balance + (balance*interest)/100);
//     IO.println("Final Payable Amount = "+balance);
// // }
// void main() {
//     int int1 = Integer.parseInt(IO.readln());
//     int int2 = Integer.parseInt(IO.readln());
//     double double1 = Double.parseDouble(IO.readln());
//     double double2 = Double.parseDouble(IO.readln());

//     IO.println("Sum of two integer is : " + add(int1, int2));
//     IO.println("Sum of two double is : " + add(double1, double2));

//     System.out.printf("Multiplication of two integer is : ",multiply(int1, int2));
//     double x = multiply(double1, double2);
//     System.out.printf("Multiplication of two double is : %.2f",x);

// }
// public int add(int int1, int int2) {
//     return int1+ int2;
// }
// public double add(double double1, double double2) {
//     return double1+ double2;
// }

// public int multiply(int int1, int int2){
//     return int1* int2;
// }
// public double multiply(double double1, double double2){
//     return double1* double2;
// }


void main() {
int side = Integer.parseInt(IO.readln());
int length = Integer.parseInt(IO.readln());
int width = Integer.parseInt(IO.readln());
double radius = Double.parseDouble(IO.readln());

IO.println("Area of the Square : "+calculateArea(side));
IO.println("Area of the Reactangle : "+calculateArea(length,width));
IO.println("Area of the Circle : "+calculateArea(radius));
}
public int calculateArea(int side) {
    return side * side;
}
public int calculateArea(int length , int width) {
    return length * width;
}
public double calculateArea (double radius) {
    return radius * 3.14;
}