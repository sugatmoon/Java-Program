import java.util.Scanner;

public class Multiplication_table_of_nth_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        for(int i= 1;i<=10;i++)
        {
           System.out.printf("%d*%d=",num,i);
            System.out.println(num*i);
        }
    }
}
