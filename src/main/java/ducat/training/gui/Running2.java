package ducat.training.gui;

import java.awt.Button;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Running2 {
	public static void main(String[] args) {
		guiDesign();
		//swingDesign();
	}

	private static void guiDesign() {
		Frame f = new Frame("Title: welcome to ducat");
		f.setLayout(null);
		f.setSize(300,300);
		f.setVisible(true);
		Button b = new Button("Login");
		b.setBounds(100, 100, 100, 30);
		Button b1 = new Button("Reset");
		b1.setBounds(100, 200, 100, 30);
		f.add(b);
		f.add(b1);
	}
	
	private static void swingDesign() {
		JFrame f = new JFrame("Title: welcome to ducat");
		f.setLayout(null);
		f.setSize(300,300);
		f.setVisible(true);
		JButton b = new JButton("Login");
		b.setBounds(100, 100, 100, 30);
		JButton b1 = new JButton("Reset");
		b1.setBounds(100, 200, 100, 30);
		f.add(b);
		f.add(b1);
	}
}
