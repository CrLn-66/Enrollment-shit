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
        
        JLabel lblNewLabel_1 = new JLabel("Enrollment ");
        lblNewLabel_1.setBounds(87, 11, 395, 104);
        panel.add(lblNewLabel_1);
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 50));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel lblNewLabel_2 = new JLabel("<html><h1 style='color: white;'><strong>Holy Rosary Academy of Las Piñas City</strong></h1><p style='color: #d4daff; font-family: cursive;'>Education founded on a love and respect of the Supreme Being superimposes on the learner the values that predicate academic excellence. In our pursuit for excellence, our entire school community dedicates itself to God, country, and the Filipino people.</p></html>");
        lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_2.setBounds(32, 115, 501, 176);
        panel.add(lblNewLabel_2);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(294, 472, 172, 61);
        add(panel_1);
	}
}