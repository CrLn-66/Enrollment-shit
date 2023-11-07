import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Main {

	private JFrame mainFrame;
	private static Connection con;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Class.forName("org.sqlite.JDBC");
					Main window = new Main();
					con = DriverManager.getConnection("jdbc:sqlite:"+System.getProperty("user.dir")+"\\src\\main.db");
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
			final Profile profile = new Profile();
			
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
	        Listener listen = new Listener() {
				
			
				
				@Override
				public boolean signin(String username, String password) {
					// TODO Auto-generated method stub
					try {
						ResultSet rs;
						String sql = "SELECT username, password FROM Students WHERE username=\"" + username +"\"";
						Statement stmt = con.createStatement();
						rs = stmt.executeQuery(sql);
						if(rs.next()) {
							 if (password.equals(rs.getString("password"))) {
								 return true;
							 }
						}
					}catch(Exception e) {
						e.printStackTrace();;
					}
					return false;
				}

				@Override
				public void enroll() {
					// TODO Auto-generated method stub
					System.out.println("hello");
				}

				@Override
				public boolean signup(String username, String name, String email, String password, String contactno,
						String birthday, String gender, String strand) {
					// TODO Auto-generated method stub
					
					try {
						String sql = "INSERT INTO Students (name, gender, birthday, cnum, strand, status, password, username, email) VALUES(?,?,?,?,?,?,?,?,?)";
						PreparedStatement statement = con.prepareStatement(sql);
						statement.setString(1, name);
						statement.setString(2, gender);
						statement.setString(3, birthday);
						statement.setString(4, contactno);
						statement.setString(5, strand);
						statement.setInt(6, 0);
						statement.setString(7, password);
						statement.setString(8, username);
						statement.setString(9, email);
						statement.executeUpdate();
						return true;
					}catch(Exception e) {
						e.printStackTrace();
						return false;
					}
				}

				@Override
				public void signedin(String usr) {
					// TODO Auto-generated method stub
					try {
						ResultSet rs;
						String sql = "SELECT * FROM Students WHERE username=\"" + usr +"\"";
						Statement stmt = con.createStatement();
						rs = stmt.executeQuery(sql);
						User user  = new User();
						while(rs.next()) {
							user.setBirtday(rs.getString("birthday"));
							user.setEmail(rs.getString("email"));
							user.setGender(rs.getString("gender"));
							user.setNumber(rs.getString("cnum"));
							user.setPasswordHash(rs.getString("password"));
							user.setUsername(rs.getString("username"));
							user.setName(rs.getString("name"));
						    profile.setup(user);
						    tabbedPane.remove(0);
						    tabbedPane.remove(0);
						    tabbedPane.remove(0);
						    tabbedPane.addTab("Profile", profile);
						    
						}
						
					}catch(Exception e) {
						e.printStackTrace();
					}
				}

				@Override
				public void logout() {
					// TODO Auto-generated method stub
					
				}
			};
			profile.setListener(listen);
	        signin.setListener(listen);
	        SignUp signup = new SignUp();
	        tabbedPane.addTab("Sign Up", signup);
	       signup.setListener(listen);
	       // Profile profile = new Profile();
	       // profile.setListener(listen);
	       // tabbedPane.addTab("Profile", profile);
	}
}
