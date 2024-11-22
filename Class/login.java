import javax.swing.*;
import java.awt.*;

public class login extends JFrame {
    JLabel jL1,jL2; //UserName, Password
    JTextField jT1,jT2;
    JButton jB1;
    public login(){
        JFrame frame = new JFrame("Login Page");
        frame.setVisible(true);
        frame.setSize(500,500);

        jL1 = new JLabel("Username: ");
        jL2 = new JLabel("Password: ");
        jT1 = new JTextField();
        jT2 = new JTextField();
        jB1 = new JButton("Login");

        frame.add(jB1);
        frame.add(jL1);
        frame.add(jL2);
        frame.add(jT1);
        frame.add(jT2);



        jL1.setBounds(30,30,80,25);
        jL2.setBounds(30,60,80,25);
        jT1.setBounds(130,30,80,25);
        jT2.setBounds(130,60,80,25);
        jB1.setBounds(50,90,80,25);



    }



    public static void main(String[] args)
    {
        new login();
    }

}
