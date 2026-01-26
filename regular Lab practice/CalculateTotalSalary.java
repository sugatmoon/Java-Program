// Write a program to input the basic salary of a person. He gets 15% of the 
// basic as HRA, 15% of the basic as Conveyance allowance and 10% of the basic as 
// Entertainment allowance. The total salary is calculated by adding Basic + HRA + Conveyance 
// + Entertainment Allowance. Calculate and print the total salary of person.

void main() {
    int basic_salary = Integer.parseInt(IO.readln("Inter Your Basic Salary: "));

    int hra_allowance = (basic_salary*15)/100;
    
    int entartainment_allow = (basic_salary*10)/100;

    System.out.printf("Basic Salary: " + basic_salary +"\nHRA :" + hra_allowance+ "\nConveyance allowance"
         + hra_allowance + "\nEntertainment allowance:" + entartainment_allow
        + "Tatal Salary :" + (basic_salary + hra_allowance + hra_allowance + entartainment_allow)
    );
}