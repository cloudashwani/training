package ducat.training.gui;
import java.awt.*;
import javax.swing.*;


public class mylabel extends JFrame {
  public static void main(String[] args) {
    new mylabel();
  }

  public mylabel() {
    super("Using HTML in JLabels");
   
   
    Container content = getContentPane();
    Font font = new Font("Serif", Font.PLAIN, 30);
    content.setFont(font);
    String labelText =
      "<html><FONT COLOR=RED>Red</FONT> and " +
      "<FONT COLOR=BLUE>Blue</FONT> Text</html>";
    JLabel coloredLabel =
      new JLabel(labelText, JLabel.CENTER);
    coloredLabel.setBorder
      (BorderFactory.createTitledBorder("Mixed Colors"));
    content.add(coloredLabel, BorderLayout.NORTH);
    labelText =
      "<html><B>Bold</B> and <I>Italic</I> Text</html>";
    JLabel boldLabel =
      new JLabel(labelText, JLabel.CENTER);
    boldLabel.setBorder
      (BorderFactory.createTitledBorder("Mixed Fonts"));
    content.add(boldLabel, BorderLayout.CENTER);
    labelText =
      "<html>Java Laboratory is a division " +
      "of the DUCAT University." +
      "<P>" +
      "Major JAVA divisions include:" +
      "<UL>" +
      "  <LI>java" +
      "  <LI>oops" +
      "  <LI>rmi" +
      "  <LI>ejb" +
      "  <LI>j2ee" +
      "  <LI>j2me" +
      "  <LI>servlets" +
      "  <LI>jsp" +
      "</UL>";
    JLabel fancyLabel = new JLabel(labelText,JLabel.CENTER);
    fancyLabel.setBorder(BorderFactory.createTitledBorder("Multi-line HTML"));
    content.add(fancyLabel, BorderLayout.SOUTH);
    pack();
    setVisible(true);
  }
}
    
    
