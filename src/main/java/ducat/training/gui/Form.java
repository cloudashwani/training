package ducat.training.gui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Form extends JFrame{
	
	Form(){
		setLayout(new GridLayout(2,3,10,10));
		JLabel l1 = new JLabel("Border1..........................");
		l1.setBorder(BorderFactory.createTitledBorder("Title Border"));
		add(l1);
		
		JLabel l2 = new JLabel("Border2..........................");
		l2.setBorder(BorderFactory.createLineBorder(Color.red, 10));
		add(l2);
		
		JLabel l3 = new JLabel("Border3..........................");
		l3.setBorder(BorderFactory.createLoweredBevelBorder());
		add(l3);
		
		JLabel l4 = new JLabel("Border4..........................");
		l4.setBorder(BorderFactory.createRaisedBevelBorder());
		add(l4);
		
		JLabel l5 = new JLabel("Border5..........................");
		l5.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		add(l5);
		
		JLabel l6 = new JLabel("Border6..........................");
		l6.setBorder(BorderFactory.createMatteBorder(10, 5, 10, 5, Color.red));
		add(l6);
		
		setSize(200,200);
		setVisible(true);
		

	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		new Form();
		
		
		
//		f.add(new JLabel("Name:"));
//		f.add(new JTextField(10));
//		JLabel lblColor = new JLabel("Color:");
//		f.add(lblColor);
//		JCheckBox chkRed = new JCheckBox("RED");
//		chkRed.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				if(chkRed.isSelected()) {
//					lblColor.setForeground(Color.RED);
//				}else {
//					lblColor.setForeground(Color.BLUE);
//				}
//			}
//		});
//		
//		JCheckBox chkGreen = new JCheckBox("GREEN");
//		JCheckBox chkBlue = new JCheckBox("BLUE");
//		f.add(chkRed);
//		f.add(chkGreen);
//		f.add(chkBlue);
//		
//		f.add(new JLabel("Gender"));
//		JRadioButton rMale =  new JRadioButton("Male");
//		JRadioButton rFemale =  new JRadioButton("Female");
//		ButtonGroup grp = new ButtonGroup();
//		grp.add(rMale);
//		grp.add(rFemale);
//		f.add(rMale);
//		f.add(rFemale);
//		String items[] =  {"C Language","C++","JAVA",".NET"};
//		JComboBox box = new JComboBox(items);
//		f.add(box);
//		
//		JList list = new JList(items);
//		f.add(list);
//		
//		JTextArea address = new JTextArea(5,60);
//		f.add(address);
		
		
		
		
//		f.setSize(300,300);
//		f.setVisible(true);
	}

}
