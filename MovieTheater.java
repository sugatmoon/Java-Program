// WAP to read your age from keyword with user input message ("Enter your Age :").
// Display your age in the console.
// Print a message based on the Age :
//  * If age is greater than 17, You are allowed in the theatre for a Movie, else you
//    are a minor, wait for some time.



void main() {

    int age = Integer.parseInt(IO.readln("Enter Your Age :"));

    if ( age > 17)
        IO.print("You are allowed in the theatre for a Movie");
    else
        IO.print("you are a minor, wait for some time.");
}