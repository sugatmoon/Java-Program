package IO;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) throws FileNotFoundException
     {       
        try(FileInputStream fread =  new FileInputStream( "C:\\Users\\USER\\Desktop\\Java Program\\IO\\Readme.txt")){
        int i;
        while ((i = fread.read()) != -1){
                System.out.print((char)i);
            }
        }catch(IOException exception){
            System.out.println(exception.getMessage());
        }

    }
}
