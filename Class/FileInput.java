import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\Risha\\OneDrive\\Documents\\Desktop\\Test.txt");
            byte b[] = new byte[fis.available()];
            fis.read(b);
            String str = new String(b);
            System.out.println(str);
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
