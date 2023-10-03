import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import javax.swing.JToggleButton;

public class Main {

	private JFrame mainFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
			mainFrame = new JFrame();
			mainFrame.setResizable(false);
	        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        mainFrame.setSize(800, 600);
	        JTabbedPane tabbedPane = new JTabbedPane();
	        mainFrame.getContentPane().add(tabbedPane);
	        Dashboard dashboard = new Dashboard();
	        tabbedPane.addTab("Dashboard", dashboard);
	        Signin signin = new Signin();
	        tabbedPane.addTab("Sign In", signin);
	        SignUp signup = new SignUp();
	        tabbedPane.addTab("Sign Up", signup);
	        JPanel panel5 = new JPanel();
	        panel5.setBackground(new Color(128, 0, 255));
	        tabbedPane.addTab("Profile", panel5);
	        panel5.setLayout(null);
	        
	        JLabel lblNewLabel_5_1 = new JLabel("");
	        lblNewLabel_5_1.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\src\\hra.png"));
	        lblNewLabel_5_1.setOpaque(true);
	        lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
	        lblNewLabel_5_1.setBackground(Color.WHITE);
	        lblNewLabel_5_1.setBounds(290, 0, 186, 145);
	        panel5.add(lblNewLabel_5_1);
	        
	        JPanel panel_1 = new JPanel();
	        panel_1.setBounds(290, 500, 186, 33);
	        panel5.add(panel_1);
	        
	        RoundedPanel roundedPanel = new RoundedPanel();
	        roundedPanel.setBackground(new Color(128, 128, 255));
	        roundedPanel.setBounds(10, 144, 759, 356);
	        panel5.add(roundedPanel);
	        roundedPanel.setLayout(null);
	        
	        JLabel lblNewLabel = new JLabel("");
	        lblNewLabel.setOpaque(true);
	        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	        lblNewLabel.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\src\\user.png"));
	        lblNewLabel.setBounds(287, 11, 181, 124);
	        roundedPanel.add(lblNewLabel);
	        
	        JLabel lblNewLabel_1 = new JLabel("Name : ");
	        lblNewLabel_1.setForeground(new Color(255, 255, 255));
	        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
	        lblNewLabel_1.setBounds(10, 152, 62, 14);
	        roundedPanel.add(lblNewLabel_1);
	       
	        
	        JPanel panel4 = new JPanel();
	        tabbedPane.addTab("Admin", panel4);
	        panel4.setLayout(null);
	        
	        JLabel lblNewLabel_7 = new JLabel("To develop");
	        lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 36));
	        lblNewLabel_7.setBounds(85, 115, 467, 235);
	        panel4.add(lblNewLabel_7);
	}
}
