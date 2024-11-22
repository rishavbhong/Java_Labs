import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File {
    public static void main(String[] args) {
        DataInputStream dis = new DataInputStream(System.in);
        char ch;
        System.out.println("Enter text (@ at the end): ");

        try{
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Risha\\OneDrive\\Documents\\Desktop\\Test1.txt", true);
            while((ch = (char)(dis.read())) != '@'){
                fos.write(ch);
            }
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        finally {
            try {
                dis.close();
            }
            catch (FileNotFoundException ex){
                ex.printStackTrace();
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
