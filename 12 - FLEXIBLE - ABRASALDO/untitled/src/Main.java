import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.github.lgooddatepicker.components.DatePicker;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
	private static JTextField lblname;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setSize(900,500);
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);
        frame.setResizable(false);

        JScrollPane _pane = new JScrollPane();
        _pane.setVisible(true);
        _pane.setBounds(250,100,550,300);

        frame.getContentPane().add(_pane);

        DefaultTableModel model= new DefaultTableModel(new Object[][]{},new String[]{"Name", "Birthday", "Grade", "Section"});
        JTable table = new JTable(model);
        table.setFillsViewportHeight(true);
        table.getTableHeader().setReorderingAllowed(false);
        _pane.setViewportView(table);
        
        JLabel lblNewLabel = new JLabel("Enrollment System");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(10, 33, 344, 34);
        frame.getContentPane().add(lblNewLabel);
        
        JPanel panel = new JPanel();
        panel.setBounds(10, 122, 230, 260);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("Name : ");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1.setForeground(new Color(0, 0, 0));
        lblNewLabel_1.setBounds(10, 30, 55, 26);
        panel.add(lblNewLabel_1);
        
        lblname = new JTextField();
        lblname.setBounds(64, 33, 156, 20);
        panel.add(lblname);
        lblname.setColumns(10);
        
        JLabel lblNewLabel_1_1 = new JLabel("Birthday : ");
        lblNewLabel_1_1.setForeground(Color.BLACK);
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1_1.setBounds(10, 66, 69, 26);
        panel.add(lblNewLabel_1_1);
        
        DatePicker bday = new DatePicker();
        bday.setBounds(64, 68, 156, 22);
        panel.add(bday);
        
        JLabel lblNewLabel_1_1_1 = new JLabel("Grade :");
        lblNewLabel_1_1_1.setForeground(Color.BLACK);
        lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1_1_1.setBounds(10, 104, 69, 26);
        panel.add(lblNewLabel_1_1_1);
        
        JComboBox section = new JComboBox();
        section.setModel(new DefaultComboBoxModel(new String[] {"FLEXIBLE", "COMMITED", "PRODUCTIVE", "INGENIOUS", "ETHICAL", "VISIONARY"}));
        section.setBounds(64, 143, 100, 22);
        panel.add(section);
        
        JLabel lblNewLabel_1_1_1_1 = new JLabel("Section :");
        lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
        lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1_1_1_1.setBounds(10, 141, 69, 26);
        panel.add(lblNewLabel_1_1_1_1);
        
        JComboBox grade = new JComboBox();
        grade.setModel(new DefaultComboBoxModel(new String[] {"11", "12"}));
        grade.setBounds(64, 104, 100, 22);
        panel.add(grade);
        
        JButton btnNewButton = new JButton("Enter");
        btnNewButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		
        	}
        });
        btnNewButton.setBounds(10, 201, 121, 26);
        panel.add(btnNewButton);
        
    }
}