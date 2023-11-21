import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Profile extends JPanel {

	/**
	 * Create the panel.
	 */
	
	JLabel name;
	JLabel number;
	JLabel gender;
	JLabel email;
	JLabel bday;
	JLabel addresss;
	JLabel status;
	JLabel lrntxt;
	User usr;
	private Listener listen;
	public Profile(User user) {
			
	        setBackground(new Color(128, 0, 255));
	        setLayout(null);
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
	        
	        name = new JLabel();
	        name.setVerticalAlignment(SwingConstants.TOP);
	        name.setForeground(Color.WHITE);
	        name.setFont(new Font("Tahoma", Font.BOLD, 12));
	        name.setBounds(60, 191, 204, 14);
	        roundedPanel.add(name);
	        
	         email = new JLabel();
	        email.setForeground(Color.WHITE);
	        email.setFont(new Font("Tahoma", Font.BOLD, 12));
	        email.setBounds(60, 226, 204, 14);
	        roundedPanel.add(email);
	        
	        JLabel lblNewLabel_1_2 = new JLabel("Email : ");
	        lblNewLabel_1_2.setForeground(Color.WHITE);
	        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
	        lblNewLabel_1_2.setBounds(10, 226, 94, 14);
	        roundedPanel.add(lblNewLabel_1_2);
	        
	        JLabel lblNewLabel_2 = new JLabel();
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
	        
	        number = new JLabel();
	        number.setForeground(Color.WHITE);
	        number.setFont(new Font("Tahoma", Font.BOLD, 12));
	        number.setBounds(92, 260, 103, 14);
	        roundedPanel.add(number);
	        
	        JLabel lblNewLabel_1_3 = new JLabel("Gender : ");
	        lblNewLabel_1_3.setForeground(Color.WHITE);
	        lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
	        lblNewLabel_1_3.setBounds(492, 189, 62, 14);
	        roundedPanel.add(lblNewLabel_1_3);
	        
	         gender = new JLabel();
	        gender.setForeground(Color.WHITE);
	        gender.setFont(new Font("Tahoma", Font.BOLD, 12));
	        gender.setBounds(552, 190, 103, 14);
	        roundedPanel.add(gender);
	        
	        JLabel lblNewLabel_1_3_1 = new JLabel("Birthday : ");
	        lblNewLabel_1_3_1.setForeground(Color.WHITE);
	        lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
	        lblNewLabel_1_3_1.setBounds(492, 214, 75, 14);
	        roundedPanel.add(lblNewLabel_1_3_1);
	        
	        bday = new JLabel();
	        bday.setForeground(Color.WHITE);
	        bday.setFont(new Font("Tahoma", Font.BOLD, 12));
	        bday.setBounds(562, 214, 103, 14);
	        roundedPanel.add(bday);
	        
	        JButton btnNewButton = new JButton("Enroll now!");

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
	        
	        status = new JLabel("Not Enrolled");
	        status.setForeground(Color.WHITE);
	        status.setFont(new Font("Tahoma", Font.BOLD, 12));
	        status.setBounds(562, 239, 145, 14);
	        roundedPanel.add(status);
	        
	        JButton btnNewButton_1 = new JButton("LOGOUT");
	        btnNewButton_1.addMouseListener(new MouseAdapter() {
	        	@Override
	        	public void mouseClicked(MouseEvent e) {
	        		listen.logout();
	        	}
	        });
	        btnNewButton_1.setBorderPainted(false);
	        btnNewButton_1.setBackground(new Color(128, 0, 64));
	        btnNewButton_1.setForeground(new Color(255, 255, 255));
	        btnNewButton_1.setBounds(10, 11, 94, 20);
	        roundedPanel.add(btnNewButton_1);
	        
	        JLabel lblNewLabel_1_3_1_1_1 = new JLabel("Address : ");
	        lblNewLabel_1_3_1_1_1.setForeground(Color.WHITE);
	        lblNewLabel_1_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
	        lblNewLabel_1_3_1_1_1.setBounds(492, 260, 75, 14);
	        roundedPanel.add(lblNewLabel_1_3_1_1_1);
	        
	         addresss = new JLabel("");
	         addresss.setVerticalAlignment(SwingConstants.TOP);
	        addresss.setForeground(Color.WHITE);
	        addresss.setFont(new Font("Tahoma", Font.BOLD, 12));
	        addresss.setBounds(562, 260, 132, 52);
	        roundedPanel.add(addresss);
	        
	        JLabel lrntxtasdas = new JLabel("LRN : ");
	        lrntxtasdas.setForeground(Color.WHITE);
	        lrntxtasdas.setFont(new Font("Tahoma", Font.BOLD, 12));
	        lrntxtasdas.setBounds(492, 168, 62, 14);
	        roundedPanel.add(lrntxtasdas);
	        
	         lrntxt = new JLabel();
	        lrntxt.setForeground(Color.WHITE);
	        lrntxt.setFont(new Font("Tahoma", Font.BOLD, 12));
	        lrntxt.setBounds(552, 169, 124, 14);
	        roundedPanel.add(lrntxt);
	        btnNewButton.addMouseListener(new MouseAdapter() {
	        	@Override
	        	public void mouseClicked(MouseEvent e) {
	        		if(usr.getStatus() == 1 || usr.getStatus() == -1) {
	        			JOptionPane.showMessageDialog(null, "You're already enrolled or have pending enrollment reqeuest!");
	        			return;
	        		}
	        		String address = showAdrressDialog();
	        		String lrn = showLRNDialog();
	        		usr.setAddrress(address);
	        		usr.setLrn(lrn);
	        		usr.setStatus(-1);
	        		listen.enroll(usr);
	        		status.setText("Pending Approval");
	        		lrntxt.setText(usr.getLrn());
	        		addresss.setText("<html>"+usr.getAddrress()+"</html>");
	        	}
	        });
	}
	
	public void setup(User usr) {
		this.usr = usr;
		name.setText("<html>"+usr.getName()+"</html>");
		email.setText(usr.getEmail());
		gender.setText(usr.getGender());
		number.setText(usr.getNumber());
		bday.setText(usr.getBirtday());
		lrntxt.setText(usr.getLrn());
		addresss.setText("<html>"+usr.getAddrress()+"</html>");
		switch(usr.getStatus()) {
		case 0:
			status.setText("Not Enrolled");
			break;
		
		case 1:
			status.setText("Enrolled");
			break;
		case -1:
			status.setText("Pending Approval");
			break;
		}
	}
	public void setListener(Listener listen) {
		this.listen = listen;
	}
	
	private String showAdrressDialog() {
        String address = JOptionPane.showInputDialog("Enter your address:");
        if (address != null && !address.isEmpty()) {
           
        	return address;
        	} else {
            JOptionPane.showMessageDialog(null, "Address cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
	private String showLRNDialog() {
        String address = JOptionPane.showInputDialog("Enter your LRN:");
        if (address != null && !address.isEmpty()) {
        	JOptionPane.showMessageDialog(null, "Core Subjects : \nEnglish for Acad. and Professional Purposes\nPractical Research\nFilipino sa Piling Larangan: Akademiko\n Understanding Cultural, Society, and Politics\n PE and Health 3\n\n\n Specialized & Elective subjects will soon be send!", "This will be your subjects", JOptionPane.INFORMATION_MESSAGE);;
        	return address;
        	 } else {
            JOptionPane.showMessageDialog(null, "LRN cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}