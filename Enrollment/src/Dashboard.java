import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Dashboard extends JPanel {

	/**
	 * Create the panel.
	 */
	public Dashboard() {
        setBackground(new Color(128, 0, 255));
        setLayout(null);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setOpaque(true);
        lblNewLabel.setBackground(new Color(255, 255, 255));
        lblNewLabel.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\src\\hra.png"));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(294, 0, 172, 154);
        add(lblNewLabel);
        
        RoundedPanel panel = new RoundedPanel();
        panel.setBackground(new Color(128, 128, 255));
        panel.setForeground(new Color(255, 255, 255));
        panel.setBounds(112, 154, 562, 318);
        add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel_2 = new JLabel("Total User :");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBounds(37, 245, 101, 28);
        panel.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("0");
        lblNewLabel_2.setLabelFor(lblNewLabel_3);
        lblNewLabel_3.setForeground(new Color(255, 255, 255));
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_3.setBounds(132, 245, 102, 30);
        panel.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_4.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\src\\user.png"));
        lblNewLabel_4.setBounds(10, 105, 207, 149);
        panel.add(lblNewLabel_4);
        
        JLabel lblNewLabel_4_1 = new JLabel("");
        lblNewLabel_4_1.setBounds(302, 105, 207, 149);
        panel.add(lblNewLabel_4_1);
        lblNewLabel_4_1.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\src\\enroll.png"));
        lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel lblNewLabel_2_1 = new JLabel("Total Enrollees :");
        lblNewLabel_2_1.setBounds(332, 245, 126, 28);
        panel.add(lblNewLabel_2_1);
        lblNewLabel_2_1.setBackground(new Color(255, 255, 255));
        lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        
        JLabel lblNewLabel_3_1 = new JLabel("0");
        lblNewLabel_2_1.setLabelFor(lblNewLabel_3_1);
        lblNewLabel_3_1.setBounds(460, 245, 102, 30);
        panel.add(lblNewLabel_3_1);
        lblNewLabel_3_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
        
        JLabel lblNewLabel_1 = new JLabel("DASHBOARD");
        lblNewLabel_1.setBounds(87, 11, 395, 104);
        panel.add(lblNewLabel_1);
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 50));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(294, 472, 172, 61);
        add(panel_1);
	}

}
