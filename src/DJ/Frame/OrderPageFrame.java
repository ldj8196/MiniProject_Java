package DJ.Frame;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class OrderPageFrame extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	public OrderPageFrame() {
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("정보");
		lblNewLabel.setBounds(54, 116, 130, 30);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setBounds(55, 170, 50, 25);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("연락처");
		lblNewLabel_1_1.setBounds(55, 205, 50, 25);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("이메일");
		lblNewLabel_1_1_1.setBounds(55, 240, 50, 25);
		getContentPane().add(lblNewLabel_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(102, 172, 300, 25);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(102, 207, 300, 25);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(102, 242, 300, 25);
		getContentPane().add(textField_2);
		
		JLabel lblNewLabel_2 = new JLabel("주문");
		lblNewLabel_2.setBounds(45, 316, 60, 30);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("???");
		lblNewLabel_1_1_1_1.setBounds(55, 360, 50, 25);
		getContentPane().add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(102, 360, 300, 25);
		getContentPane().add(textField_3);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("SRN");
		lblNewLabel_1_1_1_2.setBounds(55, 400, 50, 25);
		getContentPane().add(lblNewLabel_1_1_1_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(102, 400, 300, 25);
		getContentPane().add(textField_4);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("CNUM");
		lblNewLabel_1_1_1_3.setBounds(55, 440, 50, 25);
		getContentPane().add(lblNewLabel_1_1_1_3);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(102, 440, 300, 25);
		getContentPane().add(textField_5);
		
		JLabel lblNewLabel_1_1_1_4 = new JLabel("SNO");
		lblNewLabel_1_1_1_4.setBounds(55, 480, 50, 25);
		getContentPane().add(lblNewLabel_1_1_1_4);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(102, 480, 300, 25);
		getContentPane().add(textField_6);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.setBounds(54, 630, 100, 40);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.setBounds(377, 630, 100, 40);
		getContentPane().add(btnNewButton_1);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img2 = toolkit.getImage("Image/orca.jpg");
		this.setIconImage(img2);
		
		ImageIcon icon = new ImageIcon("Image/logo2.jpg");
		
		
		this.setSize(600, 785);
		this.setVisible(true);
	}
	
}
