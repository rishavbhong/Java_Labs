import javax.swing.*;
import java.awt.*;

public class GSVRegristationDemo extends JFrame {
    public static void main(String[] args) {
        GSVRegristationDemo gsv = new GSVRegristationDemo();
        gsv.setVisible(true);
        gsv.setSize(800,800);
        gsv.setTitle("Registration");
        gsv.pack();
        gsv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //It transfers the control back to the terminal window

        //JOptionPane.showc
    }
    JLabel lframe,laddress,lgender, lhobbies;
    JTextField tfname,tfaddress;
    JRadioButton male, female;

    ButtonGroup bg; //TO group the radio button into one
    JCheckBox c,cpp,java,python;
    JButton regristation;
    JButton reset;
    JPanel jp1,jp2,jp3,jp4,mp; //We are using the master panel to add ALL of the panels in it.

    GSVRegristationDemo(){
        mp = new JPanel(new GridLayout(4,1));
        jp1 = new JPanel();
        jp1.setLayout(new GridLayout(2,2));
        lframe = new JLabel("Name");
        laddress = new JLabel("Address");
        tfname = new JTextField();
        tfaddress = new JTextField();
        jp1.add(lframe);
        jp1.add(tfname);
        jp1.add(laddress);

        jp1.add(tfaddress);
        mp.add(jp1);

        jp2 = new JPanel();
        jp2.setLayout(new GridLayout(1,3));

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        lgender = new JLabel("Gender");
        bg = new ButtonGroup();
        bg.add(male);
        bg.add(female); //Grouping the both of the radio buttons
        jp2.add(lgender);
        jp2.add(male);
        jp2.add(female);

        mp.add(jp2);
        jp3 = new JPanel();
        jp3.setLayout(new GridLayout(1,5));
        lhobbies = new JLabel("Hobbiess");

        c = new JCheckBox("c");
        cpp = new JCheckBox("cpp");
        java = new JCheckBox("java");
        python = new JCheckBox("python");

        jp3.add(lhobbies);
        jp3.add(c);
        jp3.add(cpp);
        jp3.add(java);
        jp3.add(python);

        mp.add(jp3);

        jp4 = new JPanel();
        jp4.setLayout(new GridLayout(1,2));
        regristation = new JButton("Registration");
        reset = new JButton("Reset");
        jp4.add(regristation);
        jp4.add(reset);

        mp.add(jp4);



        add(mp);

    }

}

