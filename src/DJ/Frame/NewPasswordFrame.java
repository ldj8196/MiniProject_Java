package DJ.Frame;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class NewPasswordFrame extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	public NewPasswordFrame() {
		setBackground(new Color(255, 255, 255));
		getContentPane().setBackground(new Color(255, 255, 255));
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img2 = toolkit.getImage("Image/orca.jpg");
		this.setIconImage(img2);
		
		ImageIcon icon = new ImageIcon("Image/logo2.jpg");
		
		
		this.setSize(600, 608);
		this.setVisible(true);
		
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(163, 71, 260, 45);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(144, 176, 300, 30);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(144, 255, 300, 30);
		getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(144, 370, 300, 30);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호 재설정");
		lblNewLabel_1.setBounds(246, 142, 103, 15);
		getContentPane().add(lblNewLabel_1);
		
		
		
		
	}

}
