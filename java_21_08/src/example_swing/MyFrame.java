package example_swing;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class MyFrame extends JFrame implements  ActionListener{

	private JLabel label1;
	private JTextField textField1;
	private JButton button1;
	public MyFrame()throws HeadlessException
	{
		super();
		label1=new JLabel();
		label1.setText("Enter your name");
		textField1=new JTextField(25);
		button1=new JButton();
		button1.setText("SayHello");
		this.setTitle("My Frame Example");
		this.setSize(400,350);
		this.setLayout(new FlowLayout());
		this.add(label1);
		this.add(textField1);
		this.add(button1);
		button1.addActionListener(this);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this,"hello"+textField1.getText().toString());
	}
	
}
