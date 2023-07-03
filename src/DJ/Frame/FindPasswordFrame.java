package DJ.Frame;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FindPasswordFrame extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	public FindPasswordFrame() {
		getContentPane().setBackground(new Color(255, 255, 255));
		setBackground(new Color(255, 255, 255));
		setTitle("Orca Find Password");
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img2 = toolkit.getImage("Image/orca.jpg");
		this.setIconImage(img2);
		
		ImageIcon icon = new ImageIcon("Image/logo2.jpg");
		
		this.setSize(600, 608);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(144, 26, 300, 101);
		lblNewLabel.setIcon(icon);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setBounds(55, 191, 57, 15);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(55, 248, 57, 15);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("전화번호");
		lblNewLabel_3.setBounds(55, 306, 57, 15);
		getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(142, 188, 300, 30);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(142, 245, 300, 30);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(142, 303, 300, 30);
		getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("인증번호 받기");
		btnNewButton.setBounds(450, 310, 97, 23);
		getContentPane().add(btnNewButton);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(142, 359, 125, 30);
		getContentPane().add(textField_3);
		
		JButton btnNewButton_1 = new JButton("다음");
		btnNewButton_1.setBounds(144, 446, 300, 40);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("비밀번호를 찾고자하는 정보를 입력해주세요.");
		lblNewLabel_4.setBounds(165, 149, 260, 15);
		getContentPane().add(lblNewLabel_4);
		this.setVisible(true);
		
	}

}
