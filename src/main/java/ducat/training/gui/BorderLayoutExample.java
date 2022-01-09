package ducat.training.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BorderLayoutExample {
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Title");
		f.setLayout(new BorderLayout());
		JLabel header = new JLabel(" ");
		header.setSize(300, 100);
		
		class BtnClick  implements  ActionListener {
			String btnName;
			BtnClick(String str){
				this.btnName = str;
			}
			@Override
			public void actionPerformed(ActionEvent e) {
				header.setText(header.getText()+this.btnName);
			}
		}
		
		f.add(header,BorderLayout.NORTH);
		f.add(new JButton("copyrights"),BorderLayout.SOUTH);
		f.add(new JButton("east"),BorderLayout.EAST);
		f.add(new JButton("west"),BorderLayout.WEST);
		JPanel panel = new JPanel();
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new BtnClick("1"));
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new BtnClick("2"));
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new BtnClick("3"));
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new BtnClick("4"));
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new BtnClick("5"));
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new BtnClick("6"));
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.add(btn6);
		f.add(panel,BorderLayout.CENTER);
		f.setSize(300,300);
		f.setVisible(true);
		
		
		
	}
	
	
	

}
