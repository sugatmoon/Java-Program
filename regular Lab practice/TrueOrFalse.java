
// WAP to read your boolean value from keyword with user input message ("Enter true OR false :").
// Based on the input give the follwing message.


void main() {
   boolean bal = Boolean.parseBoolean(IO.readln("Enter 'true OR false'")) ;
   IO.print("You entered "+bal);
}