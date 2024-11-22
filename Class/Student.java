import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Student {
    public static void main(String[] args) {
    try{
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Risha\\OneDrive\\Documents\\Desktop\\Source1.txt");
        String str = "I AM NOT A LOSER";
        fos.write(str.getBytes());
        FileInputStream fis = new FileInputStream("C:\\Users\\Risha\\OneDrive\\Documents\\Desktop\\Source1.txt");
        byte b[] = new byte[fis.available()];
        fis.read(b);
        String s1 = new String(b);
        s1 = s1.toLowerCase();
//        System.out.println(s1);
        fos.write(s1.getBytes());
    }
    catch (FileNotFoundException ex){
        ex.printStackTrace();
    }
    catch (IOException ex){
        ex.printStackTrace();
    }



    }
}
