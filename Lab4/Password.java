import java.util.Scanner;

class Check_Password{
    String pass;
    boolean lowcase = false;
    boolean digit = false;
    boolean uppcase = true;
    boolean spchar = true;
    boolean len = false;
 //boolean immediate = false;

    Check_Password(String pass){
        this.pass = pass;
    }

    void is_password(){
        if(pass.length()>=5 && pass.length()<=12){
            len = true;
        }
        for(int i=0;i<pass.length();i++){
            if(pass.charAt(i)>=97 && pass.charAt(i)<=122){
                lowcase = true;
            }
            else if(pass.charAt(i)>=48 && pass.charAt(i)<=57){
                digit = true;
            }
            else if(pass.charAt(i)>=65 && pass.charAt(i)<=90){
                uppcase = false;
            }
            else if((pass.charAt(i)>=0 && pass.charAt(i)<=47) || (pass.charAt(i)>=58 && pass.charAt(i)<=64) || (pass.charAt(i)>=91 && pass.charAt(i)<=96) || (pass.charAt(i)>=123 && pass.charAt(i)<=127)){
                spchar = false;
            }
           // if(pass.charAt(i)==pass.charAt(i+1) || pass.charAt(i)==pass.charAt(i+2) || pass.charAt(i)==pass.charAt(i+3) || pass.charAt(i+1)==pass.charAt(i+2) || pass.charAt(i+1)==pass.charAt(i+2))
      //  }

    }
   /* System.out.println(lowcase);
    System.out.println(digit);
    System.out.println(uppcase);
    System.out.println(lowcase);
    System.out.println(lowcase);*/

    if(lowcase && digit && uppcase && spchar && len){
        System.out.println("Correct Password");
      }
      else{
        System.out.println("Incorrect Password");
      }
}
}
;

public class Password extends Check_Password{
    Password(String pass){
        super(pass);
    }
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    String pass = input.nextLine();

    Check_Password object = new Check_Password(pass);
    
    object.is_password();

    input.close();

    }
}