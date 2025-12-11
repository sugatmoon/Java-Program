// WAP to read your gender from keyword with user input message ("Enter your Gender[M/F] :").
// Based on the gender give the follwing message.


void main() {
    String gender = IO.readln("Enter Your Gender[M/F]");
    char gen = gender.charAt(0);
    if (gen == 'M'){
        IO.print("Your Gender is :" + gen + "Welcome to Sir");
    }else
        IO.print("Your Gender is :"+ gen + "Welcome to Madam");
}