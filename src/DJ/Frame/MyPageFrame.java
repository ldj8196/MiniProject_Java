package DJ.Frame;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MyPageFrame extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	public MyPageFrame() {
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(112, 120, 64, 64);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(188, 120, 300, 40);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(188, 170, 300, 20);
		getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("수정");
		btnNewButton.setBounds(492, 122, 60, 35);
		getContentPane().add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(108, 200, 380, 35);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(108, 245, 380, 35);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(108, 290, 380, 35);
		getContentPane().add(textField_4);
		
		JButton btnNewButton_1 = new JButton("수정");
		btnNewButton_1.setBounds(490, 206, 60, 26);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("수정");
		btnNewButton_2.setBounds(490, 251, 60, 26);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("수정");
		btnNewButton_3.setBounds(490, 296, 60, 26);
		getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("수정하기");
		btnNewButton_4.setBounds(153, 366, 100, 40);
		getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("취소");
		btnNewButton_4_1.setBounds(334, 366, 100, 40);
		getContentPane().add(btnNewButton_4_1);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img2 = toolkit.getImage("Image/orca.jpg");
		this.setIconImage(img2);
		
		ImageIcon icon = new ImageIcon("Image/logo2.jpg");
		
		
		this.setSize(600, 486);
		this.setVisible(true);
		
	}

}
