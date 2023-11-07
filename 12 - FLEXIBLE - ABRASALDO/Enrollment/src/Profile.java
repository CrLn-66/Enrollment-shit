import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Profile extends JPanel {

	/**
	 * Create the panel.
	 */
	private Listener listen;
	public Profile() {
	        setBackground(new Color(128, 0, 255));
	        setLayout(null);
	}
	
	public void setup(User usr) {
		JLabel lblNewLabel_5_1 = new JLabel("");
        lblNewLabel_5_1.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\src\\hra.png"));
        lblNewLabel_5_1.setOpaque(true);
        lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_5_1.setBackground(Color.WHITE);
        lblNewLabel_5_1.setBounds(290, 0, 186, 145);
       add(lblNewLabel_5_1);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(290, 500, 186, 33);
        add(panel_1);
        
        RoundedPanel roundedPanel = new RoundedPanel();
        roundedPanel.setBackground(new Color(128, 128, 255));
        roundedPanel.setBounds(10, 146, 759, 356);
        add(roundedPanel);
        roundedPanel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\src\\user.png"));
        lblNewLabel.setBounds(287, 11, 181, 124);
        roundedPanel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Name : ");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_1.setBounds(10, 190, 62, 14);
        roundedPanel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel(usr.getName());
        lblNewLabel_1_1.setForeground(Color.WHITE);
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_1_1.setBounds(60, 191, 103, 14);
        roundedPanel.add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_1_1_1 = new JLabel(usr.getEmail());
        lblNewLabel_1_1_1.setForeground(Color.WHITE);
        lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_1_1_1.setBounds(60, 226, 204, 14);
        roundedPanel.add(lblNewLabel_1_1_1);
        
        JLabel lblNewLabel_1_2 = new JLabel("Email : ");
        lblNewLabel_1_2.setForeground(Color.WHITE);
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_1_2.setBounds(10, 226, 94, 14);
        roundedPanel.add(lblNewLabel_1_2);
        
        JLabel lblNewLabel_2 = new JLabel(usr.getUsername());
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBounds(316, 146, 119, 20);
        roundedPanel.add(lblNewLabel_2);
        
        JLabel lblNewLabel_1_2_1 = new JLabel("Contct no. : ");
        lblNewLabel_1_2_1.setForeground(Color.WHITE);
        lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_1_2_1.setBounds(10, 260, 94, 14);
        roundedPanel.add(lblNewLabel_1_2_1);
        
        JLabel lblNewLabel_1_1_1_1 = new JLabel(usr.getNumber());
        lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
        lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_1_1_1_1.setBounds(92, 260, 103, 14);
        roundedPanel.add(lblNewLabel_1_1_1_1);
        
        JLabel lblNewLabel_1_3 = new JLabel("Gender : ");
        lblNewLabel_1_3.setForeground(Color.WHITE);
        lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_1_3.setBounds(492, 189, 62, 14);
        roundedPanel.add(lblNewLabel_1_3);
        
        JLabel lblNewLabel_1_1_2 = new JLabel(usr.getGender());
        lblNewLabel_1_1_2.setForeground(Color.WHITE);
        lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_1_1_2.setBounds(552, 190, 103, 14);
        roundedPanel.add(lblNewLabel_1_1_2);
        
        JLabel lblNewLabel_1_3_1 = new JLabel("Birthday : ");
        lblNewLabel_1_3_1.setForeground(Color.WHITE);
        lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_1_3_1.setBounds(492, 214, 75, 14);
        roundedPanel.add(lblNewLabel_1_3_1);
        
        JLabel lblNewLabel_1_1_2_1 = new JLabel(usr.getBirtday());
        lblNewLabel_1_1_2_1.setForeground(Color.WHITE);
        lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_1_1_2_1.setBounds(562, 214, 103, 14);
        roundedPanel.add(lblNewLabel_1_1_2_1);
        
        JButton btnNewButton = new JButton("Enroll now!");
        btnNewButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		listen.enroll();
        	}
        });
        btnNewButton.setBackground(new Color(0, 0, 255));
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBorderPainted(false);
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnNewButton.setBounds(316, 299, 119, 46);
        roundedPanel.add(btnNewButton);
        
        JLabel lblNewLabel_1_3_1_1 = new JLabel("Status : ");
        lblNewLabel_1_3_1_1.setForeground(Color.WHITE);
        lblNewLabel_1_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_1_3_1_1.setBounds(492, 239, 75, 14);
        roundedPanel.add(lblNewLabel_1_3_1_1);
        
        JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Not Enrolled");
        lblNewLabel_1_1_2_1_1.setForeground(Color.WHITE);
        lblNewLabel_1_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_1_1_2_1_1.setBounds(562, 239, 103, 14);
        roundedPanel.add(lblNewLabel_1_1_2_1_1);
        
        JButton btnNewButton_1 = new JButton("logout");
        btnNewButton_1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		removeAll();
        	}
        });
        btnNewButton_1.setBorderPainted(false);
        btnNewButton_1.setBackground(new Color(128, 0, 64));
        btnNewButton_1.setForeground(new Color(255, 255, 255));
        btnNewButton_1.setBounds(10, 11, 62, 14);
        roundedPanel.add(btnNewButton_1);
	}
	public void setListener(Listener listen) {
		this.listen = listen;
	}
}
