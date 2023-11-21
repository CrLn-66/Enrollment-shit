import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBoxMenuItem;

public class SignUp extends JPanel {

	/**
	 * Create the panel.
	 */
	private Listener listen;	
	private JTextField name;
	private JPasswordField password;
	private JTextField email;
	private JTextField username;
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
	        
	        JLabel as_1 = new JLabel("Name : ");
	        as_1.setForeground(Color.WHITE);
	        as_1.setFont(new Font("Tahoma", Font.BOLD, 11));
	        as_1.setBounds(10, 113, 81, 14);
	        panel_2_1.add(as_1);
	        
	        name = new JTextField();
	        name.setColumns(10);
	        name.setBounds(84, 110, 172, 20);
	        panel_2_1.add(name);
	        JLabel lblPassword_1 = new JLabel("Password : ");
	        lblPassword_1.setForeground(Color.WHITE);
	        lblPassword_1.setFont(new Font("Tahoma", Font.BOLD, 11));
	        lblPassword_1.setBounds(10, 189, 81, 14);
	        panel_2_1.add(lblPassword_1);
	        
	        password = new JPasswordField();
	        password.setBounds(84, 186, 172, 20);
	        panel_2_1.add(password);
	        
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
	        as_1_1.setBounds(10, 149, 81, 14);
	        panel_2_1.add(as_1_1);
	        
	        email = new JTextField();
	        email.setColumns(10);
	        email.setBounds(84, 146, 172, 20);
	        panel_2_1.add(email);
	        
	        JFormattedTextField number = new JFormattedTextField();
	        try {
	            // Define a mask for phone numbers (e.g., (###) ###-####)
	            MaskFormatter phoneNumberFormatter = new MaskFormatter("###-###-####");
	            number.setFormatterFactory(new DefaultFormatterFactory(phoneNumberFormatter));
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	        number.setBounds(84, 229, 89, 20);
	        panel_2_1.add(number);
	        
	        JLabel lblPassword_1_1 = new JLabel("Contact no. : ");
	        lblPassword_1_1.setForeground(Color.WHITE);
	        lblPassword_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
	        lblPassword_1_1.setBounds(10, 232, 81, 14);
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
	        
	        JFormattedTextField bday = new JFormattedTextField();
	        try {
	            // Define a mask for phone numbers (e.g., (###) ###-####)
	            MaskFormatter bformay = new MaskFormatter("##/##/####");
	            bday.setFormatterFactory(new DefaultFormatterFactory(bformay));
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	        bday.setBounds(397, 74, 89, 20);
	        panel_2_1.add(bday);
	        
	        JLabel as_1_2_2 = new JLabel("Strand : ");
	        as_1_2_2.setForeground(Color.WHITE);
	        as_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 11));
	        as_1_2_2.setBounds(340, 154, 81, 14);
	        panel_2_1.add(as_1_2_2);
	        
	        JComboBox comboBox_1 = new JComboBox();
	        comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"ABM", "STEM", "HUMMS", "GAS", "TVL-ICT", "TVL-ANIMATION", "TVL-AUTOMOTIVE"}));
	        comboBox_1.setBounds(397, 150, 108, 22);
	        panel_2_1.add(comboBox_1);
	        
	        JLabel as_1_3 = new JLabel("Username : ");
	        as_1_3.setForeground(Color.WHITE);
	        as_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
	        as_1_3.setBounds(10, 77, 81, 14);
	        panel_2_1.add(as_1_3);
	        
	        username = new JTextField();
	        username.setColumns(10);
	        username.setBounds(84, 74, 172, 20);
	        panel_2_1.add(username);
	        
	        JPanel panel_3_1 = new JPanel();
	        panel_3_1.setBounds(287, 438, 186, 95);
	       add(panel_3_1);
	        btnSignUp.addMouseListener(new MouseAdapter() {
	        	@Override
	        	public void mouseClicked(MouseEvent e) {
	        		
	        		boolean a = listen.signup(username.getText(), name.getText(), email.getText(), new String(password.getPassword()),number.getText(), bday.getText(), comboBox.getSelectedItem().toString(), comboBox_1.getSelectedItem().toString());
	        		if(!a) {
	        			JOptionPane.showMessageDialog(null, "Something went wrong!");
	        			return;
	        		}
	        		JOptionPane.showMessageDialog(null, "Succesful!");
	        	}
	        });
	}

	public void setListener(Listener listen) {
		this.listen = listen;
	}
}