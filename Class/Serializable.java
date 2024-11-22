import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializable {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Rishav Kumar";
        p1.age = 21;
        p1.weight = 71.08f;
        p1.height = 5.11;
        p1.pid = 33712;
        p1.adha = 565950;

        File f1 = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try{
            f1 = new File ("D:\\person.txt");
            fos = new FileOutputStream(f1);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(p1);
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        finally {
            try{
                if(oos!=null){
                    oos.flush();
                    oos.close();
                    oos = null;
                }
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
            try {
                if(fos!=null){
                    fos.flush();
                    fos.close();
                    fos = null;
                }
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
