package Java8;

public class Lambda {
    public static void main(String[] args) {
        lambda obj = new lambda();
        obj.show();

        i2 objs = () -> System.out.println("calling throught lambda expression ");
        objs.show();
    }
    }    
    
@FunctionalInterface
interface i2 {
    void show();
}

class lambda implements i2 {
    public void show() {
        System.out.println("Value of a: ");
    }
}
