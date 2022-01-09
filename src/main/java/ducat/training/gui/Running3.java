package ducat.training.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Running3 extends JFrame{
	
	JButton btnLogin = null;
	JButton btnReset = null;
	JLabel lblName, lblPassword;
	JTextField txtName;
	JPasswordField txtPassword;
	
	public Running3() {
		super("Title: welcome to ducat");
		btnLogin = new JButton("Login");
		btnReset = new JButton("Reset");
		lblName = new JLabel("Name: ");
		lblPassword = new JLabel("<html><font color='red'>Password: </font></html>");
		txtName = new JTextField("Text");
		txtPassword = new JPasswordField();
	}
	
	public void init(){
//		setLayout(null);
//   
//		lblName.setBounds(50,50,100,30); 		
//		txtName.setBounds(100,50,100,30); 		
//		lblPassword.setBounds(50,100,100,30); 	
//		txtPassword.setBounds(100,100,100,30); 
//		btnLogin.setBounds(50, 200, 100, 20); 	
//		btnReset.setBounds(150, 200, 100, 20); 
		                                       
		
		FlowLayout f = new FlowLayout();
		
//		setLayout(f);
		
		BorderLayout borderLayout = new BorderLayout();
		setLayout(borderLayout);
		
		add(lblName);
		add(txtName);
		add(lblPassword);
		add(txtPassword);
		add(btnLogin);
		add(btnReset);
		
		btnReset.addActionListener(new MyActionLister());
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				String pass = txtPassword.getText();
				if(name.equalsIgnoreCase(pass)) {
					JOptionPane.showMessageDialog(null, "You are valid User");
//					int showConfirmDialog = JOptionPane.showConfirmDialog(null, "You are valid User");
//					if(JOptionPane.NO_OPTION == showConfirmDialog) {
//						System.exit(0);
//					}
				}else {
					JOptionPane.showMessageDialog(null, "Invalid User, pls try again");
				}
			}
		});
		setSize(300,300);
		setVisible(true);
	}
	
	class MyActionLister implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			txtName.setText("");
			txtPassword.setText("");
		}
	}
	
	public static void main(String[] args) {
		Running3 running3 = new Running3();
		running3.init();
	}
	
	

}
