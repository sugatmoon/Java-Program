
// 6) Write a program to calculate the tax for a taxable income of Rs. 9,90,000, if the tax rate is fixed at 4.9%.

void main(String args[]) {
    int salary = Integer.parseInt(args[0]);
    double tax = (4.9 * (double)salary)/100;
    IO.print("You Tax is" + tax);
    
}