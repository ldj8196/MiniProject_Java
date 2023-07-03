package DJ.Frame;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CargoChargeFrame extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public CargoChargeFrame() {
		setTitle("화물료 조회");
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(12, 31, 320, 40);
		getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(12, 99, 320, 40);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(12, 173, 320, 40);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(12, 245, 320, 40);
		getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("조회");
		btnNewButton.setBounds(235, 311, 97, 23);
		getContentPane().add(btnNewButton);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img2 = toolkit.getImage("Image/orca.jpg");
		this.setIconImage(img2);
		
		ImageIcon icon = new ImageIcon("Image/logo2.jpg");
		
		
		this.setSize(360, 400);
		this.setVisible(true);
	}

}
