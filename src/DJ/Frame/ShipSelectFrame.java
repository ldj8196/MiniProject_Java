package DJ.Frame;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ShipSelectFrame extends JDialog {
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public ShipSelectFrame() {
		getContentPane().setBackground(new Color(255, 255, 255));
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img2 = toolkit.getImage("Image/orca.jpg");
		this.setIconImage(img2);
		
		ImageIcon icon = new ImageIcon("Image/logo2.jpg");
		
		
		this.setSize(600, 540);
		
		table = new JTable();
		Vector<String> vector = new Vector<String>();
		vector.add("순번");
		vector.add("SRN");
		vector.add("선박분류");
		vector.add("최대적재량");
	
		DefaultTableModel model = new DefaultTableModel(vector, 0);
		getContentPane().setLayout(null);
		table.setModel(model);
		
		JScrollPane jScrollPane = new JScrollPane(table);
		jScrollPane.setBounds(0, 223, 584, 180);
		getContentPane().add(jScrollPane);
		
		JLabel lblNewLabel = new JLabel("배등록번호");
		lblNewLabel.setBounds(12, 40, 65, 40);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(81, 41, 210, 40);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("최대적재량");
		lblNewLabel_1.setBounds(12, 90, 65, 40);
		getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(81, 91, 210, 40);
		getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("선박분류");
		lblNewLabel_2.setBounds(300, 40, 50, 40);
		getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(351, 41, 210, 40);
		getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("검색");
		btnNewButton.setBounds(461, 90, 100, 40);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<prev");
		btnNewButton_1.setBounds(64, 444, 100, 40);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("next>");
		btnNewButton_1_1.setBounds(406, 444, 100, 40);
		getContentPane().add(btnNewButton_1_1);
		this.setVisible(true);
	}
	
}
