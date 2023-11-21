import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.ListSelectionModel;

public class AdminDashboard {

	private JFrame frame;
	private JTable table;
	private static Connection con = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Class.forName("org.sqlite.JDBC");
					con = DriverManager
							.getConnection("jdbc:sqlite:" + System.getProperty("user.dir") + "\\src\\main.db");
					AdminDashboard window = new AdminDashboard();
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
	public AdminDashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(0, 128, 0));
		frame.getContentPane().setLayout(null);
		 
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 874, 382);
		frame.getContentPane().add(scrollPane);
		DefaultTableModel model = new DefaultTableModel(new Object[][] {}, new String[] { "", "Username", "Name", "Gender",
				"Birthday", "Contact Number", "Strand", "Status", "Email", "Address", "LRN"

		}) {
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// Return the class of the data in the first column
				return columnIndex == 0 ? JButton.class : super.getColumnClass(columnIndex);
			}
		};
		;
		table = new JTable();
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setModel(model);
		table.getTableHeader().setReorderingAllowed(false);
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
		frame.setBounds(100, 100, 910, 453);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set a custom renderer for the button column
		table.getColumnModel().getColumn(0).setCellRenderer(new ButtonRenderer());
		/* "", "Username", "Name", "Gender",
				"Birthday", "Contact Number", "Strand", "Status", "Email", "Address", "LRN"*/
		// Set a custom editor for the button column
		Lis lis = new Lis() {
			
			@Override
			public void admit() {
				// TODO Auto-generated method stub
				
			}
		};
		table.getColumnModel().getColumn(0).setCellEditor(new ButtonEditor(new JCheckBox(), lis));
		
		{
			try {
				ResultSet st;
				Statement s = con.createStatement();
				st = s.executeQuery("SELECT * FROM Students");
				while(st.next()) {
					String status = "";
					if(st.getInt("status") == 0) {
						status += "Not Enrolled";
					}else if(st.getInt("status") == -1){
						status += "Pending";
					}else {
						status += "Enrolled";
					}
					model.addRow(new Object[] {null, st.getString("username"), st.getString("name"), st.getString("gender"), st.getString("birthday")
							,st.getString("cnum"), st.getString("strand"), status, st.getString("email"), st.getString("address"), st.getString("lrn")});
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

	static class ButtonRenderer extends JButton implements TableCellRenderer {

		public ButtonRenderer() {
			setOpaque(true);
			setText("Enroll");
		}

		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			// Display a button with the text "Enroll" in the cell
			if(table.getValueAt(row, 7).toString().equals("Pending")) {
				addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						System.out.println(row);
					}
				});
				return this;
			}
			setText("Unavailable");
			setEnabled(false);
			return this;
		}
	}

	static class ButtonEditor extends DefaultCellEditor {
		private Lis lis;
		private JButton button;
		
		public ButtonEditor(JCheckBox checkBox, Lis la) {
			super(checkBox);
			lis = la;
			button = new JButton("Enroll");
			button.setOpaque(true);
			
		}
		
		

		@Override
		public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row,
				int column) {
			// Display the button in the editor
			
			if(table.getValueAt(row, 7).toString().equals("Pending")) {
				
				return button;}
			button.setText("Unavailable");
			button.setEnabled(false);
			return button;
		}
	}
}

interface Lis{
	public void admit();
}
