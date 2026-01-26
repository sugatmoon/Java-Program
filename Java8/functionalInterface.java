package Java8;

public class functionalInterface {
    public static void main(String[] args) {
        @FunctionalInterface
        interface i1 {
            void read();
            // void ready();
            default void run(){
            }
            static void done() {

            }
        }
    }
    
}
