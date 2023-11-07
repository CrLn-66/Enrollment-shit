package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.github.lgooddatepicker.components.DatePicker;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.ImageIcon;

public class Main {

	private JFrame frame;
	private JTextField fname;
	private JTextField fcnum;
	private JTable table;
	private static Connection sql = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sql = DriverManager.getConnection("jdbc:sqlite:C:\\12 - FLEXIBLE - ABRASALDO\\Enrollment System\\src\\main\\student.db");
					Main window = new Main();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(64, 0, 0));
		frame.setBounds(100, 100, 895, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 100, 321, 309);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Full name : ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 109, 72, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Gender : ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(10, 134, 58, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Contact no. :");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(10, 195, 72, 14);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Birthday : ");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(10, 163, 58, 14);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Strand : ");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_4.setBounds(10, 224, 72, 14);
		panel.add(lblNewLabel_1_4);
		
		JButton btnNewButton = new JButton("ENROLL");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(0, 0, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(10, 260, 89, 23);
		panel.add(btnNewButton);
		
		fname = new JTextField();
		fname.setBounds(75, 106, 187, 20);
		panel.add(fname);
		fname.setColumns(10);
		
		JComboBox fgender = new JComboBox();
		fgender.setModel(new DefaultComboBoxModel(new String[] {"MALE", "FEMALE", "PREFER NOT TO ANSWER"}));
		fgender.setBounds(78, 130, 184, 22);
		panel.add(fgender);
		
		DatePicker fbday = new DatePicker();
		fbday.setBounds(78, 157, 184, 28);
		panel.add(fbday);
		
		fcnum = new JTextField();
		fcnum.setBounds(88, 192, 114, 20);
		panel.add(fcnum);
		fcnum.setColumns(10);
		
		JComboBox fstrand = new JComboBox();
		fstrand.setModel(new DefaultComboBoxModel(new String[] {"STEM", "ABM", "HUMMS", "GAS", "TVL-ICT", "TVL-ANIMATION"}));
		fstrand.setBounds(78, 220, 184, 22);
		panel.add(fstrand);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(116, 11, 80, 75);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\flexible000\\Downloads\\image-removebg-preview (1).png"));
		
		JLabel lblNewLabel = new JLabel("Enrollment System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 321, 95);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(341, 100, 528, 309);
		frame.getContentPane().add(scrollPane);
		 DefaultTableModel model= new DefaultTableModel(new Object[][]{},new String[]{"Name", "Gender", "Birthday", "Contact Number", "Strand"});
		table = new JTable(model);
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
		 table.getTableHeader().setReorderingAllowed(false);
			btnNewButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					model.addRow(new Object[] {fname.getText(), fgender.getSelectedItem().toString(), fbday.getDateStringOrEmptyString(), fcnum.getText(), fstrand.getSelectedItem()});
				}
			});
			{
				ResultSet set;
				
			}
	}
	
	
}
