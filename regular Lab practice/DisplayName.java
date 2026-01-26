
// WAP to read your name from keyword with user input message ("Enter your Name :").
// Display your name in upper-case letter.
// Display the length of your name including space.

void main() {


    String name = IO.readln("Enter Your Name :");
    IO.println(name.toUpperCase());
    IO.println(name.length());
}