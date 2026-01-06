// void main() {
//     int balance = Integer.parseInt(IO.readln());
//     double interest = Double.parseDouble(IO.readln());
//     balance = (int)(balance + (balance*interest)/100);
//     IO.println("Final Payable Amount = "+balance);
// // }
// void main() {
//     int int1 = Integer.parseInt(IO.readln());
//     int int2 = Integer.parseInt(IO.readln());
//     double double1 = Double.parseDouble(IO.readln());
//     double double2 = Double.parseDouble(IO.readln());

//     IO.println("Sum of two integer is : " + add(int1, int2));
//     IO.println("Sum of two double is : " + add(double1, double2));

//     System.out.printf("Multiplication of two integer is : ",multiply(int1, int2));
//     double x = multiply(double1, double2);
//     System.out.printf("Multiplication of two double is : %.2f",x);

// }
// public int add(int int1, int int2) {
//     return int1+ int2;
// }
// public double add(double double1, double double2) {
//     return double1+ double2;
// }

// public int multiply(int int1, int int2){
//     return int1* int2;
// }
// public double multiply(double double1, double double2){
//     return double1* double2;
// }


// void main() {
// int side = Integer.parseInt(IO.readln());
// int length = Integer.parseInt(IO.readln());
// int width = Integer.parseInt(IO.readln());
// double radius = Double.parseDouble(IO.readln());

// IO.println("Area of the Square : "+calculateArea(side));
// IO.println("Area of the Reactangle : "+calculateArea(length,width));
// IO.println("Area of the Circle : "+calculateArea(radius));
// }
// public int calculateArea(int side) {
//     return side * side;
// }
// public int calculateArea(int length , int width) {
//     return length * width;
// }
// public double calculateArea (double radius) {
//     return radius * 3.14;
// }


// void main() {

// String name = IO.readln();
// double marks[] = new double[10];
// int noOfSub = Integer.parseInt(IO.readln());

// for (int i = 0; i < noOfSub; i++){
//     marks[i] = Integer.parseInt(IO.readln());
// }
//  caluculateResult(name,noOfSub,marks);   
// }
// public void caluculateResult( String name,int noOfSub, double ...marks) {
//     double totalMarks =0;
// for (double mark : marks){
//     totalMarks = totalMarks + mark;
// }
// IO.println("Student Name : "+ name);
// IO.println("Total Marks  : "+ totalMarks);
// IO.println("Average Marks: " + totalMarks / noOfSub);
// }




// void main() {

//     String name = IO.readln();
//     int noOfItem = Integer.parseInt(IO.readln());
//     double prices[] = new double[10];
    
//     for (int i = 0 ; i < noOfItem;i++) {
//         prices[i] = Double.parseDouble(IO.readln());
//     }

//     processPayment(name ,prices);
// }
// public void processPayment(String name,double ...prices){
//     double totalBill = 0;
//     for (double price : prices){
//         totalBill = totalBill + price;
//     }
//     IO.println("Customer Name :"+ name);
//     IO.println("Total Bill    :"+ totalBill);
// }


    // void show(int a) { IO.println("int"); }
    // void show(double a) { IO.println("double"); }

    // void main() {
    //     Test t = new Test();
    //     t.show(10);
    // }

//     class Test{
// static void fun(int... x) {
//     IO.println(x.length);
// }

//  void main() {
//     fun();
// }
// }

//    void main() {
// int[] a = {2, 4, 6};
// for(int i = 0; i < a.length; i++) {
//     a[i] += 1;
// }
// for(int x : a) {
//     IO.print(x + " ");
// }
// }

// void main() {
// int[] arr = {1, 2, 3};
// for(int x : arr) {
//     x = x * 2;
// }
// IO.print(arr[1]);
// }


// class Main {
// //   void print(int... a) { }
// // void print(int[] a) { }
//    void main() {    
//     test(5);
//    }
//    void test(final int x) {
//     x = 10;
// }
// }


//    void main() {
// for(int i = 0; i < 5; i++, i++) {
//     IO.print(i + " ");
// }
// }


// class Test{
// void display(Object o) {
//     IO.println("Object");
// }
// void display(String s) {
//     IO.println("String");
// }

// void main() {
//     Test t = new Test();
//     t.display(null);
// }
// }


//     void main() {
// int count = 0;
// for(int i = 1; i <= 2; i++) {
//     for(int j = 1; j <= 2; j++) {
//         count++;
//     }
// }
// IO.print(count);
// }


//     void main() {
// int i = 1;
// do {
//     IO.print(i + " ");
// } while(i-- > 1);

// }

// void main() 
// { int i = 1;
//      while(i <= 3); 
//      { IO.print(i); i++; 

//      } 
//     } 


// class Test 
// { 
//     void show(int a)
//      { 
//         IO.println("int");
//       } 
//       void show(double a) 
//       { 
//         IO.println("double"); 
//       } 
//       void main() { Test t = new Test();
//          t.show(10); 
//         } 
// }


// class F20 {
//     void main() {
//         for (int i = 1; i <= 3; i++) {
//             for (int j = 1; j <= 3; j++) {
//                 if (j == i)
//                     break;
//                 System.out.print(j);
//             }
//         }
//     }
// }


  //  void main() {
  //       for (int i = 1; i <= 2; i++) {
  //           for (int j = 1; j <= i; j++) {
  //               System.out.print(i);
  //           }
  //       }
  //   }



  //  void main() {
  //       int i;
  //       for (i = 0; i < 3; i++);
  //       System.out.print(i);
  //   }


//   class F2 {
//    void main() { 
//         for (int i = 0; i < 3; i++);
//         {
//             System.out.print("Java");
//         }
//     }
// }

// class F19 {
//     void main() {
//         for (final int i = 0; i < 3; i++) {
//             System.out.print(i);
//         }
//     }
// }

// class F3 {
//     void main()  {
//         for (int i = 0; i < 5; i++) {
//             System.out.print(i);
//             i++;
//         }
//     }
// }


  //  void main() {
  //       boolean b = false;
  //       for (; b; ) {
  //           System.out.print("Java");
  //       }
  //   }


//   class F5 {
//     void main() {
//         for (int i = 0; i < 3; i++) {}
//         System.out.print(i);
//     }
// }


// class F7 {
//     void main() {
//         for (int i = 1; i++ <= 3; ) {
//             System.out.print(i);
//         }
//     }
// }

// class F12 {
//    void main() {
//         int i = 0;
//         for (; ; ) {
//             if (i++ == 2)
//                 break;
//             System.out.print(i);
//         }
//     }
// }


// class F1 {
//      void main() {
//         int i = 0;
//         for (; i < 3; i++) {
//             System.out.print(i);
//         }
//     }
// }



// class F14 {
//     void main() {
       
//         for (int i = 1; i <= 3; i++) {
//             for (int j = 1; j <= 3; j++) {
//                 if (i == j)
//                     break;
//                 System.out.print(j);
//             }
//         }
//     }
// }



class Test {
    void main() {
        boolean skip = false;

        for (int i = 1; i <= 3; i++) {
            skip = false;   
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    skip = true;
                    break; 
                }
                System.out.print(j);
            }

            if (skip)
                continue;  
        }
    }
}