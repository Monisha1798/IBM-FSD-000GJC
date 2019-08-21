package example_swing;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jdbc_20_08.model.Employee;
import jdbc_20_08.service.EmployeeService;
import jdbc_20_08.service.EmployeeServiceImpl;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DemoFrame1 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoFrame1 frame = new DemoFrame1();
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
	public DemoFrame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeid = new JLabel("EmployeeID");
		lblEmployeeid.setBounds(89, 67, 75, 14);
		contentPane.add(lblEmployeeid);
		
		textField = new JTextField();
		textField.setBounds(191, 64, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblFirstname = new JLabel("FirstName");
		lblFirstname.setBounds(89, 99, 63, 14);
		contentPane.add(lblFirstname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(191, 96, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblLastname = new JLabel("LastName");
		lblLastname.setBounds(89, 137, 75, 14);
		contentPane.add(lblLastname);
		
		textField_2 = new JTextField();
		textField_2.setBounds(191, 134, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(89, 171, 46, 14);
		contentPane.add(lblEmail);
		
		textField_3 = new JTextField();
		textField_3.setBounds(191, 168, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnAddemployee = new JButton("AddEmployee");
		btnAddemployee.setBounds(75, 227, 119, 23);
		contentPane.add(btnAddemployee);
		btnAddemployee.addActionListener(new ActionListener()
				{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				EmployeeService emp=null;
				try {
					emp=new EmployeeServiceImpl();
				}catch(SQLException e1)
				{
					e1.printStackTrace();
				}
				emp.createEmployee(new Employee(Integer.parseInt(textField.getText().toString()),textField_1.getText().toString(),textField_2.getText().toString(),textField_3.getText().toString()));

			}

				});
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(230, 227, 89, 23);
		contentPane.add(btnReset);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
