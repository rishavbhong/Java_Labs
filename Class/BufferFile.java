import java.io.*;

public class BufferFile {
    public static void main(String[] args) {
        DataInputStream dis = new DataInputStream(System.in);
        char ch;
        System.out.println("Write data to be eneter in the file: (and end it using @) ");
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        try{
            fos = new FileOutputStream("C:\\Users\\Risha\\OneDrive\\Documents\\Desktop\\Test2.txt",true);
            bos = new BufferedOutputStream(fos,1024);
            while((ch = (char)(dis.read()))!= '@'){
                bos.write(ch);
            }
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        finally {
            try{
                bos.close();
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
        }

    }
}
