package filereaderwriter;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;

public class MyFileFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFileFrame frame = new MyFileFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFileFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(85, 45, 294, 107);
		contentPane.add(textArea);
		
		JLabel lblEnterTheContent = new JLabel("Enter the content");
		lblEnterTheContent.setBounds(53, 27, 106, 14);
		contentPane.add(lblEnterTheContent);
		
		JButton btnSave = new JButton("save");
		btnSave.setBounds(42, 191, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnReload = new JButton("reload");
		btnReload.setBounds(239, 191, 89, 23);
		contentPane.add(btnReload);
	}
}
