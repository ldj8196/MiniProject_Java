package DJ.Frame;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import java.awt.Color;
import javax.swing.JButton;

public class MainFrame extends JDialog {
	public MainFrame() {
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("항만 시설 사용료");
		btnNewButton.setBounds(71, 65, 140, 130);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("운임료 조회");
		btnNewButton_1.setBounds(215, 65, 140, 130);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("배송 추적");
		btnNewButton_2.setBounds(355, 65, 140, 130);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("My page");
		btnNewButton_3.setBounds(71, 192, 140, 130);
		getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("화물 정보");
		btnNewButton_4.setBounds(71, 323, 140, 130);
		getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("항구 정보");
		btnNewButton_5.setBounds(215, 323, 140, 130);
		getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("선박 정보");
		btnNewButton_6.setBounds(355, 323, 140, 130);
		getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("선박 입출항 정보 및 주문");
		btnNewButton_7.setBounds(215, 192, 280, 130);
		getContentPane().add(btnNewButton_7);
	
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img2 = toolkit.getImage("Image/orca.jpg");
		this.setIconImage(img2);
		
		ImageIcon icon = new ImageIcon("Image/logo2.jpg");
			
		this.setSize(600, 580);
		this.setVisible(true);
	}

}
