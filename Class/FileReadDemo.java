import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {
    public static void main(String[] args) {
        File f1 = null;
        FileReader fr = null;

        try{
            f1 = new File("D:\\A\\AI.txt");
            fr = new FileReader(f1);
            // fr.read() //public int read()
            //int ch;
            //while((ch=fr.read())!=-1)   //-1 = End of file
//            {
//                sout((char)ch);
//            }
            long length = f1.length();
            char ch[] = new char[(int)length];
            fr.read(ch);
            int words = 0;
            int vowel = 0;
            for(char c: ch){
                if (c == 32){
                    words++;
                }

                if(c == 97 || c ==101 || c == 105 || c == 111 || c == 117 || c == 65 || c == 69 || c == 73 || c == 79 || c == 85){
                    vowel++;
                }
                System.out.println(c);
            }
            System.out.println("Words: "+ (words+1));
            System.out.println("Vowels: "+ vowel);
        }
        catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
