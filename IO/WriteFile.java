package IO;

import java.io.FileOutputStream;
import java.io.IOException;



public class WriteFile {
    public static void main(String[] args) {
        try(FileOutputStream fOut = new FileOutputStream("C:\\Users\\USER\\Desktop\\Java Program\\IO\\Writeme.txt", true)){
            String input = "This is my wite throught io FileOutputStream class";
        byte data[] = input.getBytes();
        fOut.write(data );
        }catch(IOException e){
            System.out.println(e.getMessage());

        }
    }
}
