class EmployeeSystem{
    int choice = Integer.parseInt(IO.readln());
    int employeeId = Integer.parseInt(IO.readln());
    String employeeName = IO.readln();
    double employeeSalary = Double.parseDouble(IO.readln());
    static void checkSwitch(){
        if(choice>2){
            IO.println("Invalid Choice");
            System.exit(0);
        }
    }
   static void checkField(){
        if(employeeId<0){
            IO.println("Invalid Employee Id");
            System.exit(0);
        }
        if(employeeSalary<0){
            IO.println("Salary can't 0 or negative");
        }
    }
   public static void main(String args[]){

        // if (choice>2){
        //     IO.println("Invalid Choice");
        //     System.exit(0);
        // }
        checkSwitch();
        // double providentFund = Double.parseDouble(IO.readln());

        // if(employeeId<0){
        //     IO.println("Invalid Employee Id");
        //     System.exit(0);
        // }
        // if(employeeSalary<0){
        //     IO.println("Salary can't be 0 or negative");
        //     System.exit(0);
        // }
        checkField();
        switch(choice){
           case 1: PermanentEmployee pe=new PermanentEmployee(employeeId , employeeName, employeeSalary);
                        IO.println(pe);

                       IO.println(pe.netSalary());
                        break;
                
           case 2:    int contractDuration = Integer.parseInt(IO.readln());
                     ContractEmployee ce=new ContractEmployee(employeeId, employeeName, employeeSalary,contractDuration);
                        IO.println(ce);
                        break;

            default: IO.println("Invalid Choice");
        }
    }
}
class Employee{
  protected int employeeId;
  protected String employeeName;
 protected double employeeSalary;
  Employee(int employeeId , String employeeName,double employeeSalary){
    this.employeeId = employeeId;
    this.employeeName = employeeName;
    this.employeeSalary = employeeSalary;
  }  
}
class PermanentEmployee extends Employee{
    protected double providentFund;

    public PermanentEmployee(int employeeId,String employeeName,double employeeSalary){
        super(employeeId,employeeName,employeeSalary);
        this.providentFund=employeeSalary*0.12;
    }
    public String netSalary(){
        return "Net Salary is :"+""+(employeeSalary+ providentFund);
    }
    public String toString(){
        return "PermanentEmployee [empoyeeId="+ employeeId +", employeeName="+employeeName+", employeeSalary="+employeeSalary+", providentfund="+providentFund+"]";
    }


}
class ContractEmployee extends Employee{
    protected int contractDuration;

    public ContractEmployee(int employeeId,String employeeName,double employeeSalary ,int contractDuration){
        super(employeeId,employeeName,employeeSalary);
        this.contractDuration=contractDuration;
    }
    public String toString(){
        return "ContractEmployee [empoyeeId="+ this.employeeId+", employeeName="+this.employeeName+", employeeSalary="+employeeSalary+", contractDuration="+contractDuration + " years]";
    }
}