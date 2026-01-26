// Write a Java program to find Largest of Three Numbers.


void main() {
    int num1 = Integer.parseInt(IO.readln("Number 1: "));
    int num2 = Integer.parseInt(IO.readln("Number 2: "));
    int num3 = Integer.parseInt(IO.readln("Number 3: "));
    // int num1 =  154;
    // int num2 = 167;
    // int num3 = 12;
    

    if ( num1 > num2  ){

        if (num1 > num3)
            IO.print("Number " + num1 + " is greater.");
    }
    else if ( num2 > num1){

        if (num2 > num3)
        IO.print("Number " + num2 + " is greater.");
    }
    else 
        IO.print("Number " + num3 + " is greater.");
}