public class ArrayProgram {
    public static void main(String[] args) {
        int [] Arr1 = { 5,7,89,5,4,9};
        int [] Arr2 = { 5,7,Arr1.length,89,5,4,9};
        System.out.println(Arr1);

        InnerArrayProgram[] arr = new InnerArrayProgram[5];

        InnerArrayProgram a = new InnerArrayProgram();

    }
}


class InnerArrayProgram {

    int x;
    int y;

}
