package DJ.Frame;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;

public class JoinFrame extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	public JoinFrame() {
		setTitle("Orca Join");
		getContentPane().setBackground(new Color(255, 255, 255));
		
		
		
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("사업자등록번호");
		lblNewLabel.setBounds(23, 37, 84, 15);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(50, 75, 57, 15);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("회사이름");
		lblNewLabel_2.setBounds(50, 117, 57, 15);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("대표번호");
		lblNewLabel_3.setBounds(50, 167, 57, 15);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("주소");
		lblNewLabel_4.setBounds(50, 217, 57, 15);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("업체선택");
		lblNewLabel_5.setBounds(23, 258, 57, 15);
		getContentPane().add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(147, 37, 116, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(147, 72, 116, 21);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(147, 114, 116, 21);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(147, 164, 116, 21);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(147, 214, 116, 21);
		getContentPane().add(textField_4);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Cargo");
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBounds(82, 254, 75, 23);
		getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxShip = new JCheckBox("Ship");
		chckbxShip.setBackground(new Color(255, 255, 255));
		chckbxShip.setBounds(161, 254, 75, 23);
		getContentPane().add(chckbxShip);
		
		JButton btnNewButton = new JButton("JOIN");
		btnNewButton.setBounds(44, 337, 97, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setBounds(177, 337, 97, 23);
		getContentPane().add(btnCancel);
		
		JButton btnNewButton_1 = new JButton("중복확인");
		btnNewButton_1.setBounds(274, 33, 46, 23);
		getContentPane().add(btnNewButton_1);
		
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img2 = toolkit.getImage("Image/orca.jpg");
		this.setIconImage(img2);
		
		this.setSize(360, 540);
		this.setVisible(true);
	}
}
