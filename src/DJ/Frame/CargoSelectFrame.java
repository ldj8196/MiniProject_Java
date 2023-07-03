package DJ.Frame;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;

public class CargoSelectFrame extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	private JTable table;
	
	public CargoSelectFrame() {
		getContentPane().setBackground(new Color(255, 255, 255));
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img2 = toolkit.getImage("Image/orca.jpg");
		this.setIconImage(img2);
		
		ImageIcon icon = new ImageIcon("Image/logo2.jpg");
		
		
		this.setSize(600, 540);
		
		table = new JTable();
		Vector<String> vector = new Vector<String>();
		vector.add("순번");
		vector.add("화물번호");
		vector.add("화물분류");
		vector.add("화물량");
		
		DefaultTableModel model = new DefaultTableModel(vector, 0);
		getContentPane().setLayout(null);
		table.setModel(model);
		
		JScrollPane jScrollPane = new JScrollPane(table);
		jScrollPane.setBounds(0, 250, 584, 180);
		getContentPane().add(jScrollPane);

		
		JLabel lblNewLabel = new JLabel("화물번호");
		lblNewLabel.setBounds(12, 76, 57, 40);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(77, 77, 210, 40);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("화물량");
		lblNewLabel_1.setBounds(12, 138, 45, 40);
		getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(77, 139, 210, 40);
		textField_1.setColumns(10);
		getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("화물분류");
		lblNewLabel_2.setBounds(299, 75, 57, 40);
		getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(364, 76, 210, 40);
		textField_2.setColumns(10);
		getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("검색");
		btnNewButton.setBounds(457, 138, 100, 40);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<prev");
		btnNewButton_1.setBounds(96, 452, 100, 40);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("next>");
		btnNewButton_1_1.setBounds(373, 452, 100, 40);
		getContentPane().add(btnNewButton_1_1);
		this.setVisible(true);
	}
}
