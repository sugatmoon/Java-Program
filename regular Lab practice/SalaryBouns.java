// WAP to read your salary from keyword with user input message ("Enter your Salary :").
// Display your salary in the console.
// Print a message based on the Salary :
//  * If Salary is greater than 50000, Your bonus amount is 5000 else 3000.
//    Print the bonus amount and total salary.

void main() {
    int salary = Integer.parseInt(IO.readln("Enter Your Salary:"));
    if ( salary > 50000 )
        IO.println("Your Salary     :"+ salary);
        IO.println("Your Bonus     :"+ 5000);
        IO.println("Your Total Salary:   " + (salary+5000));
    if ( salary < 50000){
        IO.println("Your Salary     :"+ salary);
        IO.println("Your Bonus     :"+ 3000);
        IO.println("Your Total Salary:   " + (salary+3000));
    }

}