import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Signin extends JPanel {
	private Listener listen;
	/**
	 * Create the panel.
	 */
	public Signin() {
        setBackground(new Color(128, 0, 255));
       setLayout(null);

   	 	JTextField usname;
   	 	JPasswordField pass;
        JLabel lblNewLabel_5 = new JLabel("");
        lblNewLabel_5.setBackground(new Color(255, 255, 255));
        lblNewLabel_5.setOpaque(true);
        lblNewLabel_5.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\src\\hra.png"));
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_5.setBounds(285, 0, 186, 145);
       add(lblNewLabel_5);
        
        RoundedPanel panel_2 = new RoundedPanel();
        panel_2.setBackground(new Color(128, 128, 255));
        panel_2.setBounds(154, 144, 447, 295);
       add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblNewLabel_6 = new JLabel("SIGN IN");
        lblNewLabel_6.setForeground(new Color(255, 255, 255));
        lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 35));
        lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6.setBounds(107, 11, 250, 60);
        panel_2.add(lblNewLabel_6);
        
        JLabel as = new JLabel("Username : ");
        as.setFont(new Font("Tahoma", Font.BOLD, 11));
        as.setForeground(new Color(255, 255, 255));
        as.setBounds(82, 129, 81, 14);
        panel_2.add(as);
        
        usname = new JTextField();
        as.setLabelFor(usname);
        usname.setBounds(173, 126, 172, 20);
        panel_2.add(usname);
        usname.setColumns(10);
        JLabel lblPassword = new JLabel("Password : ");
        lblPassword.setForeground(Color.WHITE);
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblPassword.setBounds(82, 166, 81, 14);
        panel_2.add(lblPassword);
        
        pass = new JPasswordField();
        pass.setBounds(173, 163, 172, 20);
        panel_2.add(pass);
        
        JButton go = new JButton("SIGN IN");
        go.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		if(listen.signin(usname.getText(), new String(pass.getPassword()))) {
        			JOptionPane.showMessageDialog(null, "Signed In!");
        			listen.signedin(usname.getText());
        			return;
        		}
        		JOptionPane.showMessageDialog(null, "Username/Password not matched!");
        	}
        });
        go.setForeground(new Color(255, 255, 255));
        go.setBorderPainted(false);
        go.setBackground(new Color(0, 255, 0));
        go.setFont(new Font("Tahoma", Font.BOLD, 11));
        go.setBounds(256, 227, 89, 23);
        panel_2.add(go);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBounds(285, 438, 186, 95);
        add(panel_3);
	}
	
	public void setListener(Listener listen) {
		this.listen = listen;
	}
}
