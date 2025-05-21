package BTTH;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Nhan {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JLabel resultLabel;

	/**
	 * Launch the application.
	 */
	
	public void show() {
	    frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nhan window = new Nhan();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Nhan() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Phép Trừ");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Số thứ nhất:");
		lblNewLabel.setBounds(30, 30, 100, 25);
		frame.getContentPane().add(lblNewLabel);
		
		textField1 = new JTextField();
		textField1.setBounds(120, 30, 100, 25);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Số thứ hai:");
		lblNewLabel_1.setBounds(30, 70, 100, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField2 = new JTextField();
		textField2.setBounds(120, 70, 100, 25);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JButton btnSubtract = new JButton("Trừ");
		btnSubtract.setBounds(120, 110, 100, 25);
		frame.getContentPane().add(btnSubtract);
		
		resultLabel = new JLabel("Kết quả: ");
		resultLabel.setBounds(30, 150, 300, 25);
		frame.getContentPane().add(resultLabel);
		
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a = Integer.parseInt(textField1.getText());
					int b = Integer.parseInt(textField2.getText());
					int result = a * b;
					resultLabel.setText("Kết quả: " + result);
				} catch (NumberFormatException ex) {
					resultLabel.setText("Vui lòng nhập số hợp lệ!");
				}
			}
		});
	}
}


