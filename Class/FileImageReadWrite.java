import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileImageReadWrite {
    public static void main(String[] args) {
        File f1 = null;
        File f2  = null;

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try{
            f1 = new File("C:\\Users\\Risha\\OneDrive\\Pictures\\Saved Pictures\\WhatsApp Image 2024-07-03 at 03.57.24_4dde3f2e.jpg");
            fis = new FileInputStream(f1);
            //f1.length :-> will give output in long that's why we are typecasting it into INT in the next line for defininf the size of the array
            byte b [] = new byte[(int) f1.length()];
            //read data and store into byte array;
            fis.read(b);

            System.out.println(f1.length());
            f2 = new File("C:\\Users\\Risha\\OneDrive\\Pictures\\Saved Pictures\\WhatsApp Image 2024-07-03 at 03.57.24_4dde3f2e1.jpg");
            fos = new FileOutputStream(f2);
            fos.write(b);
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        finally {
            try{
                if(fis!=null){
                    fis.close();
                    fis = null;
                }
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
