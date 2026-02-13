

class InnerMethodCall {


    void swapMethod(int num1 , int num2){

        num2 = num1;
        num1 = num2;

    }
    
}
 
public class MethodCall {
    public static void main(String[] args) {
        InnerMethodCall a = new InnerMethodCall();
        a.swapMethod(12, 34);
    }
}
