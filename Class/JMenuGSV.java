import OpenFrameDemo.java.OpenFrameDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JMenuGSV extends JFrame implements ActionListener {
    public static void main(String[] args) {
        JMenuGSV jm = new JMenuGSV();
        jm.setTitle("NotePad");
        jm.setSize(500, 500);
        jm.setVisible(true);
        jm.pack();
        jm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    JMenuBar menu;
    JMenu file, edit, view, navigate, code, font;
    JMenuItem open, save, saveas, cut, copy, paste, tm, arial;

    public JMenuGSV() {
        menu = new JMenuBar();
        file = new JMenu("FILE");
        edit = new JMenu("EDIT");
        view = new JMenu("VIEW");
        navigate = new JMenu("NAVIGATE");
        code = new JMenu("CODE");
        add(menu, BorderLayout.NORTH); //Changing it's position to north as default layout of border is centre.
        open = new JMenuItem("OPEN");
        save = new JMenuItem("SAVE");
        saveas = new JMenuItem("SAVE AS");
        cut = new JMenuItem("CUT");
        copy = new JMenuItem("COPY");
        paste = new JMenuItem("PASTE");

        //adding a sub-meu
        font = new JMenu("FONT");
        tm = new JMenuItem("TimeNewRoman");
        arial = new JMenuItem("Arial");

        menu.add(file);
        menu.add(edit);
        menu.add(view);
        menu.add(navigate);
        menu.add(code);

        file.add(open);
        file.add(save);
        file.add(saveas);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);

        //Adding the sub-menu into the frame
        view.add(font);
        font.add(tm);
        font.add(arial);

        //Adding the action listener
        open.addActionListener(this);
        save.addActionListener(this); //added the action listener to the save button


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == open) {
            JFileChooser jfc = new JFileChooser();
            int openStatus = jfc.showOpenDialog(this);
            if (openStatus == JFileChooser.APPROVE_OPTION) {
                File f1 = jfc.getSelectedFile();
                System.out.println(f1.getAbsolutePath());
                OpenFrameDemo ofd = new OpenFrameDemo(f1);
                ofd.setVisible(true);
                ofd.setSize(500, 500);

            }
        } else if (e.getSource() == save) {
            JFileChooser jfc = new JFileChooser();
            int saveStatus = jfc.showSaveDialog(this);
            if (saveStatus == JFileChooser.APPROVE_OPTION) {
                File fileToSave = jfc.getSelectedFile();
                try (FileWriter fw = new FileWriter(fileToSave)) {
                    JTextArea textArea = new JTextArea();
                    fw.write(textArea.getText());  // Write the text area content to the file
                    JOptionPane.showMessageDialog(this, "File saved successfully!");
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error saving file!");
                }
            }
            }
        }
    }
