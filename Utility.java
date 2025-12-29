void main() {
    printData((byte)24);
    printData(26.5f);
    printData(86.7);
    printData('S');
    printData("Sugat");
    printData(true);
    printData(28100L);
    printData((short)2500);
    printData(4);
}
public void printData(byte age) {
    IO.println("Your age: " + age);
}
public void printData(float height) {
    IO.println("Your height: " + height);
}
public void printData(double weight) {
    IO.println("Your Weight: " + weight);
}
public void printData(char letter) {
    IO.println("Starting Letter of Your Name: " + letter);
}
public void printData(boolean isCatch) {
    IO.println("Have you catch the ball? : " + isCatch);
}
public void printData(String name) {
    IO.println("Your age: " + name);
}
public void printData(long salary) {
    IO.println("Your Salary is: " + salary);
}
public void printData(short priceOfCloths) {
    IO.println("Total Price of Cloths: " + priceOfCloths);
}
public void printData(int noOfClasses) {
    IO.println("No of Classes: " + noOfClasses);
}