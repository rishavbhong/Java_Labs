import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sign_in extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JButton signInButton;
    private JLabel jL1;
    private JPanel jL;
    private JLabel jL2;

    public sign_in(){
       JFrame frame = new JFrame("SignIn_page");
       frame.setVisible(true);
       frame.setSize(500,500);

       textField1 = new JTextField();
       textField2 = new JTextField();
       jL1 = new JLabel();
       jL2 = new JLabel();
       signInButton = new JButton();

       frame.add(jL1);
       frame.add(jL2);
       frame.add(textField1);
       frame.add(textField2);
       frame.add(signInButton);


        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText() == textField2.getText()){
                    JOptionPane.showMessageDialog(null,"SignIn successful!");
                }
            }
        });
        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new sign_in();
    }
}
