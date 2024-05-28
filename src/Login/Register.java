package Login;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.io.IOException;

public class Register extends JFrame {
	
	 private static final long serialVersionUID = 1L;
	    private JPanel contentPane;
	    private JTextField name_textField;
	    private JTextField email_textField;
	    private JTextField usrn_textField;
	    private JPasswordField passwordField;
	    private JTextField textField_address;
	    private JPasswordField con_pwField;
	    String name, email, usrName, password, con_pw, address;
	    JLabel pwErrorLabel = new JLabel("");
	    JLabel con_pwLabel = new JLabel("");
	    
	    boolean validations() {
			
	    	name = name_textField.getText();
	    	email = email_textField.getText();
	    	usrName = usrn_textField.getText();
	    	password = passwordField.getText();
	    	con_pw = con_pwField.getText();
	    	address = textField_address.getText();
	    	
	    	if(name.equals("")) {
	    		
	    		JOptionPane.showMessageDialog(this, "Please enter name!");
	    		return false;
	    	}
	    	if(usrName.equals("")) {
	    		
	    		JOptionPane.showMessageDialog(this, "Please enter username!");
	    		return false;
	    	}
	    	if(password.equals("")) {
	    		
	    		JOptionPane.showMessageDialog(this, "Please enter password!");
	    		return false;
	    	}
	    	if(con_pw.equals("")) {
	    		
	    		JOptionPane.showMessageDialog(this, "Please confirm password!");
	    		return false;
	    	}
	    	if(address.equals("")) {
	    		
	    		JOptionPane.showMessageDialog(this, "Please enter address!");
	    		return false;
	    	}
	    	
	    	if(!password.equals(con_pw)){
	    		JOptionPane.showMessageDialog(this, "CONFIRM PASSWORD!");
	    		return false;
	    	}
	    	
	    	
	    	return true;
	   
	    	
	    	
	    }
	    
	    public void checkPassword() {
	    	
	    	password = passwordField.getText();
	    	if(password.length()<5) {
	    		pwErrorLabel.setBackground(new Color(255, 0, 0));
		        pwErrorLabel.setForeground(new Color(255, 0, 0));
	    		pwErrorLabel.setText("Too Short!");
	    	}
	    	else
	    	{
	    		pwErrorLabel.setBackground(new Color(127, 255, 0));
		        pwErrorLabel.setForeground(new Color(127, 255, 0));
	    		pwErrorLabel.setText("Perfect!");
	    	}
	    	
	    }
	    
	    public void confirmPassword() {
	    	
	    	password = passwordField.getText();
	    	con_pw = con_pwField.getText();
	    	if(con_pw.equalsIgnoreCase(password)) {
	    		con_pwLabel.setBackground(new Color(127, 255, 0));
	    		con_pwLabel.setForeground(new Color(127, 255, 0));
	    		con_pwLabel.setText("Matched!");
	    		
	    	}
	    	else
	    	{
	    		con_pwLabel.setBackground(new Color(255, 0, 0));
	    		con_pwLabel.setForeground(new Color(255, 0, 0));
	    		con_pwLabel.setText("Doesn't Match!");
	    	}
	    	
	    }
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Register() {
		setTitle("WELCOME TO ONZER :D");
		
		
		 
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBackground(new Color(240, 240, 240));
	        setBounds(100, 100, 715, 590);
	        contentPane = new JPanel();
	        contentPane.setBackground(new Color(255, 255, 255));
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

	        setContentPane(contentPane);
	        contentPane.setLayout(null);

	        JPanel panel_1 = new JPanel();
	        panel_1.setForeground(new Color(255, 255, 255));
	        panel_1.setBackground(new Color(0, 64, 64));
	        panel_1.setBounds(6, 0, 703, 555);
	        contentPane.add(panel_1);
	        panel_1.setLayout(null);

	        JLabel titleLabel = new JLabel("Register With Us");
	        titleLabel.setForeground(new Color(255, 255, 255));
	        titleLabel.setFont(new Font("Honeymoon Avenue Script", Font.BOLD | Font.ITALIC, 52));
	        titleLabel.setBounds(170, 50, 290, 77);
	        panel_1.add(titleLabel);

	        JLabel name_Label = new JLabel("NAME  :");
	        name_Label.setForeground(new Color(255, 255, 255));
	        name_Label.setFont(new Font("Tahoma", Font.BOLD, 18));
	        name_Label.setBounds(24, 163, 99, 58);
	        panel_1.add(name_Label);

	        JLabel email_label = new JLabel("EMAIL  :");
	        email_label.setForeground(new Color(255, 255, 255));
	        email_label.setFont(new Font("Tahoma", Font.BOLD, 18));
	        email_label.setBounds(24, 222, 88, 46);
	        panel_1.add(email_label);

	        JLabel pw_label = new JLabel("PASSWORD  :");
	        pw_label.setForeground(new Color(255, 255, 255));
	        pw_label.setFont(new Font("Tahoma", Font.BOLD, 18));
	        pw_label.setBounds(24, 325, 137, 46);
	        panel_1.add(pw_label);
	        
	        JLabel ConPW = new JLabel("CONFIRM PASSWORD  :");
	        ConPW.setForeground(Color.WHITE);
	        ConPW.setFont(new Font("Tahoma", Font.BOLD, 18));
	        ConPW.setBounds(24, 371, 216, 46);
	        panel_1.add(ConPW);
	        

	        JLabel usrName = new JLabel("USERNAME  :\r\n");
	        usrName.setForeground(new Color(255, 255, 255));
	        usrName.setFont(new Font("Tahoma", Font.BOLD, 18));
	        usrName.setBounds(24, 274, 128, 52);
	        panel_1.add(usrName);

	        JLabel address = new JLabel("ADDRESS  :");
	        address.setForeground(new Color(255, 255, 255));
	        address.setFont(new Font("Tahoma", Font.BOLD, 18));
	        address.setBounds(24, 421, 128, 46);
	        panel_1.add(address);

	        name_textField = new JTextField();
	        name_textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
	        name_textField.setBounds(271, 172, 290, 40);
	        panel_1.add(name_textField);
	        name_textField.setColumns(10);

	        email_textField = new JTextField();
	        email_textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
	        email_textField.setBounds(271, 225, 290, 40);
	        panel_1.add(email_textField);
	        email_textField.setColumns(10);

	        usrn_textField = new JTextField();
	        usrn_textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
	        usrn_textField.setBounds(271, 280, 290, 40);
	        panel_1.add(usrn_textField);
	        usrn_textField.setColumns(10);

	        passwordField = new JPasswordField();
	        passwordField.addKeyListener(new KeyAdapter() {
	        	@Override
	        	public void keyPressed(KeyEvent e) {
	        		checkPassword();
	        	}
	        	@Override
	        	public void keyReleased(KeyEvent e) {
	        		checkPassword();
	        	}
	        });
	        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
	        passwordField.setBounds(271, 328, 290, 40);
	        panel_1.add(passwordField);

	        
	        con_pwField = new JPasswordField();
	        con_pwField.addKeyListener(new KeyAdapter() {
	        	@Override
	        	public void keyPressed(KeyEvent e) {
	        		confirmPassword();
	        	}
	        	@Override
	        	public void keyReleased(KeyEvent e) {
	        		confirmPassword();
	        	}
	        });
	        con_pwField.setFont(new Font("Tahoma", Font.PLAIN, 20));
	        con_pwField.setBounds(271, 377, 290, 40);
	        panel_1.add(con_pwField);

	        textField_address = new JTextField();
	        textField_address.setFont(new Font("Tahoma", Font.PLAIN, 20));
	        textField_address.setBounds(271, 424, 290, 40);
	        panel_1.add(textField_address);
	        textField_address.setColumns(10);

	        JButton regButton = new JButton("REGISTER\r\n");
	        regButton.setBackground(new Color(240, 248, 255));
	        regButton.setForeground(new Color(47, 79, 79));
	        regButton.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		validations();
	        		try {
						FileWriter fw =  new FileWriter("login.txt", true);
						FileWriter admin =  new FileWriter("adminlogin.txt", true);
						fw.write(usrn_textField.getText()+"\t"+passwordField.getText()+"\n");
						admin.write(usrn_textField.getText()+"\t"+passwordField.getText()+"\n");
						fw.close();
						admin.close();
						FileWriter userDet =  new FileWriter("User.txt", true);
						userDet.write(name_textField.getText()+"\t"+email_textField.getText()+"\t"+usrn_textField.getText()+"\t"+passwordField.getText()+"\t"+textField_address.getText()+"\n");
						userDet.close();
						Component container = null;
						JOptionPane.showMessageDialog(container, "Registration Successful!");
						dispose();
		        		Login l= new Login();
		        		l.setVisible(true);
						
	        		} catch (IOException e1) {
						
						e1.printStackTrace();
					}
	        	}
	        });
	        
	        regButton.setFont(new Font("Tahoma", Font.BOLD, 20));
	        regButton.setBounds(406, 491, 137, 38);
	       
	        panel_1.add(regButton);

	        JButton backButton = new JButton("BACK\r\n");
	        backButton.setBackground(new Color(240, 248, 255));
	        //back button action
	        backButton.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		dispose();
	        		Login l= new Login();
	        		l.setVisible(true);
	        	}
	        });
	        backButton.setForeground(new Color(47, 79, 79));
	        backButton.setFont(new Font("Tahoma", Font.BOLD, 20));
	        backButton.setBounds(271, 491, 117, 38);
	        
	        panel_1.add(backButton);
	        
	        
	        pwErrorLabel.setBackground(new Color(255, 0, 0));
	        pwErrorLabel.setForeground(new Color(255, 0, 0));
	        pwErrorLabel.setBounds(577, 325, 130, 46);
	        panel_1.add(pwErrorLabel);
	        
	        
	        con_pwLabel.setBackground(new Color(255, 0, 0));
	        con_pwLabel.setForeground(new Color(255, 0, 0));
	        con_pwLabel.setBounds(577, 388, 120, 16);
	        panel_1.add(con_pwLabel);
	        

	}
}
