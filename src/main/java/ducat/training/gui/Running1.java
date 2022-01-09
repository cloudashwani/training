package ducat.training.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Running1 extends JFrame {

	JButton btnLogin;
	JButton btnReset;
	JTextField txtPassword;
	JTextField txtName;

	public Running1() {
		super("Welcome to Ducat");
		btnLogin = new JButton("Login");
		btnReset = new JButton("Reset");
		btnReset.addActionListener(new MyAction());
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (txtPassword.getText().equalsIgnoreCase(txtName.getText())) {
					int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Incorrect password");
					if(JOptionPane.YES_OPTION ==  showConfirmDialog ) {
						System.exit(0);
					}
				}
			}
		});
	}

	class MyAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			txtPassword.setText("");
			txtName.setText("");
		}
	}

	public static void main(String[] args) {
		new Running1().init();
	}

	private void init() {
		setLayout(null);

		JLabel name = new JLabel("Enter your name");
		name.setBounds(10, 10, 100, 30);
		add(name);
		txtName = new JTextField();
		txtName.setBounds(150, 10, 100, 30);
		add(txtName);

		JLabel password = new JLabel("<html><FONT COLOR=RED>Enter Password</FONT></html>");
		password.setBounds(10, 40, 100, 30);
		add(password);

		txtPassword = new JTextField();
		txtPassword.setBounds(150, 40, 100, 30);
		add(txtPassword);

		btnLogin.setBounds(10, 100, 100, 30);
		add(btnLogin);
		btnReset.setBounds(150, 100, 100, 30);
		add(btnReset);
		setSize(300, 200);
		setVisible(true);
	}
}