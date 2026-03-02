package Protected;

class InnerCheckProtected_2 {

   protected int x = 143;
   protected String name = "Sugat Moon";
   protected double PI = 3.145;
   protected boolean isRight = true;

   @Override
   public Object clone() throws CloneNotSupportedException{
    return super.clone();
   }

   protected void m(){}
   
   
}

class InnerCheckProtected_1 extends InnerCheckProtected_2 {
    
void i(){
    System.out.println();
}

    
}
class InnerCheckProtected extends InnerCheckProtected_1{

    
}



public class CheckProtected {
    public static void main(String[] args) {
        InnerCheckProtected i = new InnerCheckProtected();
        System.out.println(i.PI);
        System.out.println(i.isRight);
        System.out.println(i.name);
        System.out.println(i.x);
        i.m();
        
        InnerCheckProtected_2 p = new InnerCheckProtected_2();
        System.out.println();
        
    
    }
    
}
