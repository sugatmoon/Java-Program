// Assignment 02 :
// Create  two methods having the same name but different sequence of the integer and the character parameters.
// For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n).
// Expected Output:
// int=66 char=A
// int=67 char=D
void main() {
    formChange(2,'i');
    formChange('k',3);
}
public void formChange(int n ,char c){
    IO.println("Number: " + n);
    IO.println("Char: " + c);
}
public void formChange(char c,int n){
    IO.println("Char: " + c);
    IO.println("Number: " + n);
}