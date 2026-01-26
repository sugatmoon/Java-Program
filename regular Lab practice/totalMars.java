void main() {
String name = IO.readln();
double totalMarks= 0;
double[] marks = new double[10];
int subject = Integer.parseInt(IO.readln());
for (int i = 0; i < subject; i++ ){
    marks[i] = Double.parseDouble(IO.readln());
}
   calculateResult(name,totalMarks,subject,marks);
}
public void calculateResult(String studenName, double totalMarks,int subject, double ...marks) 
{
    for (double mark : marks) {
        totalMarks = totalMarks+ mark;
    }
    IO.println("Student Name : "+studenName);
    IO.println("Total Marks  : "+ totalMarks);
    IO.println("Avrage Marks : "+ (totalMarks/subject));
}