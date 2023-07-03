package DJ.Frame;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class HarborSelectFrame extends JDialog {
	private JTable table;
	private JTextField textField;
	
	public HarborSelectFrame() {
		getContentPane().setBackground(new Color(255, 255, 255));
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img2 = toolkit.getImage("Image/orca.jpg");
		this.setIconImage(img2);
		
		ImageIcon icon = new ImageIcon("Image/logo2.jpg");
		
		
		this.setSize(600, 540);
		getContentPane().setLayout(null);
		
		table = new JTable();
		Vector<String> vector = new Vector<String>();
		vector.add("운행번호");
		vector.add("출발항");
		vector.add("도착항");
		vector.add("출발시간");
		vector.add("도착시간");
		
		DefaultTableModel model = new DefaultTableModel(vector, 0);
		table.setModel(model);
		
		JScrollPane jScrollPane = new JScrollPane(table);
		jScrollPane.setBounds(0, 196, 584, 180);
		getContentPane().add(jScrollPane);
		
		JButton btnNewButton = new JButton("<prev");
		btnNewButton.setBounds(82, 421, 100, 40);
		getContentPane().add(btnNewButton);
		
		JButton btnNext = new JButton("next>");
		btnNext.setBounds(377, 421, 100, 40);
		getContentPane().add(btnNext);
		
		JLabel lblNewLabel = new JLabel("항구이름");
		lblNewLabel.setBounds(31, 95, 57, 40);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(100, 96, 355, 40);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("검색");
		btnNewButton_1.setBounds(467, 95, 90, 40);
		getContentPane().add(btnNewButton_1);
		this.setVisible(true);

	}
}
