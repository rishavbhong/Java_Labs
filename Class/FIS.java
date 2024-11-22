import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIS {
    public static void main(String[] args) {
    try {
        FileInputStream fis = new FileInputStream("C:\\Users\\Risha\\OneDrive\\Documents\\Desktop\\Test2.txt");
        int length = fis.available();
        for (int i =0;i<length;i++){
            System.out.print((char)fis.read());
        }
    }
    catch (FileNotFoundException ex){
        ex.printStackTrace();
    }
    catch (IOException ex){
        ex.printStackTrace();
    }
    }
}
