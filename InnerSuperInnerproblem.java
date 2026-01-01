class InnerSuperInnerproblem{
    public static void main(String[] args){
        SuperInnerproblem sup = new Innerproblem();
        sup.meth1();
        sup.meth2();
        
    }
}
class SuperInnerproblem {

        void meth1() {
            IO.println("meth1 of SuperInnger problem");
        }
    
        void meth2() {
            IO.println("meth1 of SuperInngerproblem");
        }
}

class Innerproblem extends SuperInnerproblem {
    
        void meth1() {
            IO.println("meth1 of Innerproblem");
        }
    
        // void meth2() {
        //     IO.println("meth2 of Inngerproblem");
        // }
    
}
