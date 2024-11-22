import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) {
        File f1 = null;
        FileWriter fw  = null; //Char(text)
        long length = 0;
        try{
            f1 = new File("D:\\A\\AI.txt");
            fw = new FileWriter(f1); //Two cons FileWriter(String s)    FileWriter(File f1)
            fw.write("GSV AI JAVA CLASS");
            length = f1.length();
            System.out.println("Before close length: "+ length);
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        finally {
            try{
                if(fw!=null){
                    fw.flush();
                    fw.close();
                    fw = null; //GC
                }
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
        }
        System.out.println("After class length: "+f1.length());
    }
}
