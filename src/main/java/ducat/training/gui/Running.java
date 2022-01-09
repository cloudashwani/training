package ducat.training.gui;

import java.awt.Button;
import java.awt.Container;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Running {
	public static void main(String[] args) {
		// awtGUI();
		swingGUI();
	}

	private static void awtGUI() {
		Frame f = new Frame("welcome to Ducat");
		f.setLayout(null);
		f.setSize(300, 300);
		f.setVisible(true);

		Button b = new Button("click here");
		b.setBounds(10, 100, 100, 30);
		f.add(b);

		Button b1 = new Button("click there");
		b1.setBounds(10, 150, 100, 30);
		f.add(b1);
	}

	private static void swingGUI() {
		JFrame f = new JFrame("welcome to Ducat");
		Container contentPane = f.getContentPane();
		f.setLayout(null);
		f.setSize(300, 300);
		f.setVisible(true);

		JButton b = new JButton("click here");
		b.setBounds(10, 100, 100, 30);
		contentPane.add(b);

		JButton b1 = new JButton("click there");
		b1.setBounds(10, 150, 100, 30);
		contentPane.add(b1);
	}
}