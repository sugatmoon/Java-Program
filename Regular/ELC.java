class ELC {
    void main() {

        int choice = Integer.parseInt(IO.readln());
        int studentId = Integer.parseInt(IO.readln());
        String name = IO.readln();
        double examFee = Double.parseDouble(IO.readln());
        double regularFee = Double.parseDouble(IO.readln());
        double amountPaid = Double.parseDouble(IO.readln());

        if ( choice < 1 || choice > 2 ){
            IO.println("Invalid Choice!");
            System.exit(12);
        }

        if ( choice == 1){
            DayScholar dayScholar = new DayScholar(studentId, name, examFee, regularFee,amountPaid);
            IO.println(dayScholar);
        }
        else{
            Hosteller hosteller = new Hosteller(studentId, name, examFee, regularFee , amountPaid);
            IO.println(hosteller);
        }




    }
}


class Student{
    protected int studentId;
    protected String name;
    protected double examFee;
    protected double amountPaid;

    Student(int studentId, String name, double  examFee, double amountPaid){
        if (examFee < 0){
            System.err.print("Exam Fee should be Positive.");
            System.exit(10);
        }
        else if (amountPaid < 0){
            IO.println("amount should be Positive.");
            System.exit(2);
        }
        else if (studentId < 0){
            IO.println("Id Should be positive.");
            System.exit(2);
        }else
            IO.println();

        this.studentId = studentId;
        this.name = name;
        this.examFee = examFee;
        this.amountPaid = amountPaid;
    }
    @Override
    public String toString() {
        return "name =" + this.name + ",studentId=" + this.studentId + ",examFee=" + this.examFee + "]";
    }

    
}

class DayScholar extends Student{
    double transportFee;
    DayScholar(int studentId, String name, double examFee, double transportFee,double amountPaid){
        super(studentId, name, examFee,amountPaid);
        this.transportFee = transportFee;
    }
    @Override
    public String toString() {
        return "DayScholar[transportFee=" + this.transportFee + super.toString() + this.isClear();
    }
    
    private String isClear() {
        if ( (super.examFee + this.transportFee) == super.amountPaid){
            IO.println("");
            return "All Fees are clear";
        }
        else
            return "Remaining amount to pay is: " + (super.amountPaid - (super.examFee - this.transportFee));
    }
    
}
class Hosteller extends Student{
    double hostelFee;
    Hosteller(int studentId, String name, double examFee, double hostelFee, double amountPaid){
        super(studentId, name, examFee,amountPaid);
        this.hostelFee = hostelFee;
    }
    @Override
    public String toString(){
        return "Hosteller[hostelFee= "+ this.hostelFee +super.toString() + this.isClear();
    }
    private String isClear() {
        if ( (super.examFee + this.hostelFee) == super.amountPaid){
            IO.println();
            return "All Fees are clear";
        }
        else
            return "Remaining amount to pay is: " + (super.amountPaid - (super.examFee - this.hostelFee));
    }
}