

import javax.script.ScriptException;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
//class that runs the spendings app



public class SpendingTrackerUI extends JFrame {
	//private Spendings sps;
	/*    public static void main(String[] args) {
	        try {
	            new SpendingsApp();
	        } catch (FileNotFoundException e) {
	            System.out.println("Unable to run application: file not found");
	        }
	    }*/


	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;
	private JTextField textField6;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws ScriptException {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					SpendingTrackerUI frame = new SpendingTrackerUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}


		});
	}

	/**
	 * Create the frame.
	 */

	@SuppressWarnings({"checkstyle:MethodLength", "checkstyle:SuppressWarnings"})
	public SpendingTrackerUI() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblDay = new JLabel("day");
		lblDay.setBounds(10, 10, 61, 16);
		panel.add(lblDay);

		textField2 = new JTextField();
		textField2.setBounds(10, 20, 61, 16);
		panel.add(textField2);

		JLabel lblMonth = new JLabel("month");
		lblDay.setBounds(110, 10, 61, 16);
		panel.add(lblMonth);

		textField3 = new JTextField();
		textField3.setBounds(20, 20, 61, 16);
		panel.add(textField3);

		JLabel lblYear = new JLabel("year");
		lblDay.setBounds(210, 10, 61, 16);
		panel.add(lblYear);

		textField4 = new JTextField();
		textField4.setBounds(30, 30, 61, 16);
		panel.add(textField4);

		JLabel lblCat = new JLabel("category");
		lblDay.setBounds(310, 20, 61, 16);
		panel.add(lblCat);

		textField5 = new JTextField();
		textField5.setBounds(40, 30, 61, 16);
		panel.add(textField5);

		JLabel lblAmount = new JLabel("amount");
		lblDay.setBounds(410, 20, 61, 16);
		panel.add(lblAmount);

		textField6 = new JTextField();
		textField6.setBounds(50, 30, 61, 16);
		panel.add(textField6);

		JButton addEntry = new JButton("Add Spending");
		addEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//sps.addSpending(new Spending(1,1,1,"cat",1000));
				textField.setText("Adding Complete");
			}
		});
		addEntry.setBounds(6, 65, 56, 29);
		panel.add(addEntry);

		List list = new List();
		list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		list.setForeground(Color.YELLOW);
		list.setBackground(Color.MAGENTA);
		list.setBounds(16, 43, 138, 76);
		panel.add(list);


	}

}




