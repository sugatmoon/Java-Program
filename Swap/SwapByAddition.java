class SwapByAddition {
    public static void main(String[] args) {
        int i = 8;
        int j = 3;
        

        System.out.println("Before swapping i: " + i);
        System.out.println("Before swapping j: " + j);
        
        // i = 3 :  j = 8
        
        
        i = i + j; //addtion  i = 11
        
        j = i - j; // j = 8
        
        i = i - j;
        
        System.out.println("After swapping i: " + i);
        System.out.println("After swapping j: " + j);








    }
    
}