package DJ.Frame;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

public class LoginFrame extends JDialog{
	private JTextField textField;
	private JTextField textField_1;
	
	public LoginFrame() {
		getContentPane().setBackground(new Color(255, 255, 255));
		setTitle("Orca Login");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(59, 111, 57, 15);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(59, 137, 210, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(59, 188, 210, 21);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("PW");
		lblNewLabel_1.setBounds(59, 168, 57, 15);
		getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Join");
		btnNewButton.setBounds(42, 260, 100, 40);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("패스워드변경");
		btnNewButton_2.setBounds(209, 219, 60, 20);
		getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(0, 10, 344, 99);
		getContentPane().add(lblNewLabel_3);
		
		ImageIcon icon = new ImageIcon("Image/logo2.jpg");
		Image img = icon.getImage();
		Image changeimg = img.getScaledInstance(344, 70, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeimg);
		lblNewLabel_3.setIcon(changeIcon);
		getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setBounds(199, 260, 100, 40);
		getContentPane().add(btnNewButton_1);
		
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img2 = toolkit.getImage("Image/orca.jpg");
		this.setIconImage(img2);
		
		this.setSize(360, 500);
		this.setVisible(true);
	}
}
