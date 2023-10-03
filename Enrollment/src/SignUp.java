import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class SignUp extends JPanel {

	/**
	 * Create the panel.
	 */

	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	public SignUp() {
	        setBackground(new Color(128, 0, 255));
	        setLayout(null);
	        
	        JLabel lblNewLabel_5_1 = new JLabel("");
	        lblNewLabel_5_1.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\src\\hra.png"));
	        lblNewLabel_5_1.setOpaque(true);
	        lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
	        lblNewLabel_5_1.setBackground(Color.WHITE);
	        lblNewLabel_5_1.setBounds(287, 0, 186, 145);
	        add(lblNewLabel_5_1);
	        
	        RoundedPanel panel_2_1 = new RoundedPanel();
	        panel_2_1.setLayout(null);
	        panel_2_1.setBackground(new Color(128, 128, 255));
	        panel_2_1.setBounds(69, 143, 643, 295);
	        add(panel_2_1);
	        
	        JLabel lblNewLabel_6_1 = new JLabel("SIGN UP");
	        lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
	        lblNewLabel_6_1.setForeground(Color.WHITE);
	        lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 35));
	        lblNewLabel_6_1.setBounds(191, 11, 250, 60);
	        panel_2_1.add(lblNewLabel_6_1);
	        
	        JLabel as_1 = new JLabel("Username : ");
	        as_1.setForeground(Color.WHITE);
	        as_1.setFont(new Font("Tahoma", Font.BOLD, 11));
	        as_1.setBounds(10, 77, 81, 14);
	        panel_2_1.add(as_1);
	        
	        textField = new JTextField();
	        textField.setColumns(10);
	        textField.setBounds(84, 74, 172, 20);
	        panel_2_1.add(textField);
	        
	        JLabel lblPassword_1 = new JLabel("Password : ");
	        lblPassword_1.setForeground(Color.WHITE);
	        lblPassword_1.setFont(new Font("Tahoma", Font.BOLD, 11));
	        lblPassword_1.setBounds(10, 158, 81, 14);
	        panel_2_1.add(lblPassword_1);
	        
	        passwordField = new JPasswordField();
	        passwordField.setBounds(84, 155, 172, 20);
	        panel_2_1.add(passwordField);
	        
	        JButton btnSignUp = new JButton("SIGN UP");
	        btnSignUp.setForeground(Color.WHITE);
	        btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 11));
	        btnSignUp.setBorderPainted(false);
	        btnSignUp.setBackground(Color.GREEN);
	        btnSignUp.setBounds(504, 261, 89, 23);
	        panel_2_1.add(btnSignUp);
	        
	        JLabel as_1_1 = new JLabel("Email : ");
	        as_1_1.setForeground(Color.WHITE);
	        as_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
	        as_1_1.setBounds(10, 118, 81, 14);
	        panel_2_1.add(as_1_1);
	        
	        textField_1 = new JTextField();
	        textField_1.setColumns(10);
	        textField_1.setBounds(84, 115, 172, 20);
	        panel_2_1.add(textField_1);
	        
	        JFormattedTextField formattedTextField = new JFormattedTextField();
	        try {
	            // Define a mask for phone numbers (e.g., (###) ###-####)
	            MaskFormatter phoneNumberFormatter = new MaskFormatter("###-###-####");
	            formattedTextField.setFormatterFactory(new DefaultFormatterFactory(phoneNumberFormatter));
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	        formattedTextField.setBounds(84, 198, 89, 20);
	        panel_2_1.add(formattedTextField);
	        
	        JLabel lblPassword_1_1 = new JLabel("Contact no. : ");
	        lblPassword_1_1.setForeground(Color.WHITE);
	        lblPassword_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
	        lblPassword_1_1.setBounds(10, 201, 81, 14);
	        panel_2_1.add(lblPassword_1_1);
	        
	        JLabel as_1_2 = new JLabel("Gender : ");
	        as_1_2.setForeground(Color.WHITE);
	        as_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
	        as_1_2.setBounds(340, 114, 81, 14);
	        panel_2_1.add(as_1_2);
	        
	        JComboBox comboBox = new JComboBox();
	        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Prefer not to say"}));
	        comboBox.setBounds(397, 110, 108, 22);
	        panel_2_1.add(comboBox);
	        
	        JLabel as_1_2_1 = new JLabel("Birthday : ");
	        as_1_2_1.setForeground(Color.WHITE);
	        as_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
	        as_1_2_1.setBounds(340, 77, 81, 14);
	        panel_2_1.add(as_1_2_1);
	        
	        JFormattedTextField formattedTextField_1 = new JFormattedTextField();
	        try {
	            // Define a mask for phone numbers (e.g., (###) ###-####)
	            MaskFormatter bformay = new MaskFormatter("##/##/####");
	            formattedTextField_1.setFormatterFactory(new DefaultFormatterFactory(bformay));
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	        formattedTextField_1.setBounds(397, 74, 89, 20);
	        panel_2_1.add(formattedTextField_1);
	        
	        JPanel panel_3_1 = new JPanel();
	        panel_3_1.setBounds(287, 438, 186, 95);
	       add(panel_3_1);
	}

}
