import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Risha\\OneDrive\\Documents\\Desktop\\Test.txt");
            //Pass the address where we want the file to be created
            String s = "My Name is rishav Kumar";

            fos.write(s.getBytes());

        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
