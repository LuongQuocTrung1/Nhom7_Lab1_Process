package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class cong {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JLabel resultLabel;

	public cong() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame("Phép Cộng");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lbl1 = new JLabel("Số thứ nhất:");
		lbl1.setBounds(30, 30, 100, 25);
		frame.getContentPane().add(lbl1);

		textField1 = new JTextField();
		textField1.setBounds(120, 30, 100, 25);
		frame.getContentPane().add(textField1);

		JLabel lbl2 = new JLabel("Số thứ hai:");
		lbl2.setBounds(30, 70, 100, 25);
		frame.getContentPane().add(lbl2);

		textField2 = new JTextField();
		textField2.setBounds(120, 70, 100, 25);
		frame.getContentPane().add(textField2);

		JButton btnAdd = new JButton("Cộng");
		btnAdd.setBounds(120, 110, 100, 25);
		frame.getContentPane().add(btnAdd);

		resultLabel = new JLabel("Kết quả: ");
		resultLabel.setBounds(30, 150, 300, 25);
		frame.getContentPane().add(resultLabel);

		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a = Integer.parseInt(textField1.getText());
					int b = Integer.parseInt(textField2.getText());
					int sum = a + b;
					resultLabel.setText("Kết quả: " + sum);
				} catch (NumberFormatException ex) {
					resultLabel.setText("Vui lòng nhập số hợp lệ!");
				}
			}
		});
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new cong();
			}
		});
	}
}
