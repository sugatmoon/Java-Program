package Java8;

public class Interface {

    public static void main(String[] args) {
        Test t = new Test();
        t.run();
        t.show();
        t.display();

        
    }
}
interface i {
    void run();


    default void show() {
        System.out.println("This is default method in interface");
    }
    static void display() {
        System.out.println("This is static method in interface");
    }
}
class Test implements i {
    public void show() {
        System.out.println("This is overridden default method");
    }
    public void display() {
        System.out.println("This is instance method in class");
    }
    public void run() {
        System.out.println("This is run method implementation");
    }
}
