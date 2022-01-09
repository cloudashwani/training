package ducat.training.gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class myfilechooser extends JFrame {

 JTextField   m_fileNameTF  = new JTextField(15);
 JTextField   m_wordCountTF = new JTextField(4);
 JFileChooser m_fileChooser = new JFileChooser();


 myfilechooser() {
     m_fileNameTF.setEditable(false);
     m_wordCountTF.setEditable(false);
     JButton openButton = new JButton("Open");

    
     openButton.addActionListener(new OpenAction());

    
     JPanel content = new JPanel();
     content.setLayout(new FlowLayout());
     content.add(openButton);
     content.add(m_fileNameTF);
     content.add(new JLabel("Word Count"));
     content.add(m_wordCountTF);

     
     this.setTitle("Count Words");
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setContentPane(content);
     this.pack();
 }

 
 private int countWordsInFile(File f) {

     int numberOfWords = 0;  

     try {
         Scanner wordScanner = new Scanner(f);
         wordScanner.useDelimiter("[^A-Za-z]+");

         while (wordScanner.hasNext()) {
             String word = wordScanner.next();
             numberOfWords++;
         }
         wordScanner.close();     

     } catch (FileNotFoundException fnfex) {
         JOptionPane.showMessageDialog(myfilechooser.this,
                     "You gave me an unreadable file");
     }
     return numberOfWords;
 }



 class OpenAction implements ActionListener {
     public void actionPerformed(ActionEvent ae) {
         
         int retval = m_fileChooser.showOpenDialog(myfilechooser.this);
         if (retval == JFileChooser.APPROVE_OPTION) {
           
             File file = m_fileChooser.getSelectedFile();

             
             m_fileNameTF.setText(file.getName());
             m_wordCountTF.setText("" + countWordsInFile(file));
         }
     }
 }

 public static void main(String[] args) {
	 myfilechooser window = new myfilechooser();
     window.setVisible(true);
 }
}
