// void main() {
//     int temp = Integer.parseInt(IO.readln());
//     int num = temp;
//     boolean isDuck = false;
//     while(num != 0){
//         temp = num % 10;
//         if (temp < 0)
//             break;
//         if (temp == 0)
//             isDuck = true;
//         num = num / 10;
//     }
//     IO.println(isDuck);
// }


// void main() {
//     String str_num = IO.readln();
// //    int num = 
//     String rev_str_num = "";
//      for( int i= str_num.length() -1; i != -1; --i){
//         rev_str_num = rev_str_num + str_num.charAt(i);
//      }
//      if(rev_str_num.equals(str_num))
//         IO.println(str_num + " is a Palindrome number");
//     else
//         IO.println(str_num + " is NOT a Palindrome number");
    
// }



// void main(){
//     int x = Integer.parseInt(IO.readln());
//     int y = Integer.parseInt(IO.readln());
//     if (x != 0 && x > 1){
//     while(x != y){
//             for (int i = 2; i <= x; i++){
//                 if (x % i == 0){
//                     continue;
//                 }
//                 if (i == x/2){
//                     IO.println(x);
//                 }
//             } 
//             x++;
//         }
//     }
// }
// void checkPrime(){
//     if ()
// }

// import java.util.ArrayList;

// void main() {
//     ArrayList<Object>  primes = new ArrayList<Object>();
//     primes.add("lsfkdjf");
//     primes.add("uu");
//     primes.add(5);
//     primes.add('h');
//     Object[] objPrimes = primes.toArray();
//     System.out.println(objPrimes[1]);
//     IO.println(primes);
//     IO.println(primes.lastIndexOf('h'));
//     IO.println(primes.indexOf('u'));

// }


// void main() {
//     int num = Integer.parseInt(IO.readln());
//     int temp = 0;
//     int num_copy = num;
//     int intermidate;
//     while (num != 0){
//         intermidate = num % 10;  
//         temp = temp + factorial(intermidate);
//         num = num / 10;
//     }
//     if (num_copy == temp){
//         IO.println("Strong Number");  
//     } 
// }
// public int factorial(int num){
//     if (num == 1){
//         return 1;
//     }else
//         num = num * factorial(num-1);
//     return num;
// }



// int temp;
// int sum_temp = 0;
// int proct_temp = 0;
// void main() {
//     int num = Integer.parseInt(IO.readln());
//     if (isSum(num) == isProduct(num)){
//         IO.println(num + "is a Spy Number.");
//     }
// }

// public boolean isSum(int num) {
//     if ( num == sumOFNum(num))
//         return true;
//     else
//         return false;
// }
// public boolean isProduct(int num) {
//     if ( num == proctOfNum(num))
//         return true;
//     else
//         return false;

// }
// public int sumOFNum (int num){
//     if (num == 1){
//         return 1;
//     }
//     else
//         return sum_temp = sum_temp + sumOFNum(num % 10);
// }
// public int proctOfNum (int num ){
//     if (num == 1){
//         return 1;
//     }
//     else 
//         return proct_temp = proct_temp + proctOfNum(num % 10);
// }

// int temp ;
// void main() {
//     int num  = Integer.parseInt(IO.readln());
//     int x = sumOf(num);
//     int y = productOf(num);
//     if(num == 0){
//         IO.println(num + " is a Spy Number.");
//         IO.println("(sum=" + x+ ", product="+y+").");
//     }
//     else if (x == y){
//         IO.println(num + " is a Spy Number.");
//         IO.println("(sum=" + x+ ", product="+y+").");
//     }
//     else{
//         IO.println(num + " is NOT a Spy Number.");
//         IO.println("(sum=" + x+ ", product="+y+").");
//     }
// }
// public int productOf(int num){
//     int productOfNum = 1;
//     while (num != 0){
//         temp = num %10;
//         productOfNum  = productOfNum * temp;
//         num = num / 10;
//     }
//     return productOfNum;
// }
// public int sumOf(int num){
//     int sumOfNum = 0;
//     while (num != 0){
//         temp = num % 10;
//         sumOfNum  = sumOfNum + temp;
//         num = num / 10;
//     }
//     return sumOfNum;
// }


// void main() {
// int range1 = Integer.parseInt(IO.readln());
// int range2 = Integer.parseInt(IO.readln());

//     while(range1 != range2){
//         if(isPrime(range1)){
//             IO.print(" "+range1);
//         }
//         ++range1;
//     }
// }
// public boolean isPrime(int num){
//     for (int i = 2; i <= num/2; ++i){
//         if (num%i ==0){
//             return false;
//         }
//     }return true;
// }
void main() {
    Thread.currentThread().setName("sjkjfldkf");
    IO.println(Thread.currentThread().getName());
    IO.println(Thread.currentThread().getPriority());
}
