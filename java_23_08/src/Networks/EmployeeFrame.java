package Networks;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

public class EmployeeFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeFrame frame = new EmployeeFrame();
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
	public EmployeeFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(32, 22, 46, 14);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(120, 19, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblFistname = new JLabel("FirstName");
		lblFistname.setBounds(32, 60, 63, 14);
		contentPane.add(lblFistname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 50, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblLastname = new JLabel("LastName");
		lblLastname.setBounds(32, 106, 63, 14);
		contentPane.add(lblLastname);
		
		textField_2 = new JTextField();
		textField_2.setBounds(120, 103, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(32, 151, 46, 14);
		contentPane.add(lblEmail);
		
		textField_3 = new JTextField();
		textField_3.setBounds(120, 148, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Add Employee");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NetworkingServer ns = new NetworkingServer();
				try {
					ns.addEmp(Integer.parseInt(textField.getText().toString()),textField_1.getText().toString(),textField_2.getText().toString(),textField_3.getText().toString());
				} catch (NumberFormatException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		btnNewButton.setBounds(61, 227, 106, 23);
		contentPane.add(btnNewButton);
		
		table = new JTable();
		table.setBounds(260, 22, 153, 123);
		contentPane.add(table);
		
		JButton btnSearchbyid = new JButton("SearchByID");
		btnSearchbyid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NetworkingServer ns = new NetworkingServer();
				ResultSet rs = ns.searchByID(Integet.parseInt(textField_4.getText()));
				table.setModel(DbUtils.resultSetToTableModel(rs));
			}
		});
		btnSearchbyid.setBounds(232, 227, 89, 23);
		contentPane.add(btnSearchbyid);
		
		JLabel lblEnterId = new JLabel("Enter ID");
		lblEnterId.setBounds(231, 183, 46, 14);
		contentPane.add(lblEnterId);
		
		textField_4 = new JTextField();
		textField_4.setBounds(301, 180, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}
}
