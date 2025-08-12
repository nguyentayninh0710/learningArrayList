package exercise2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class classroomCheck extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private Classroom classroom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					classroomCheck frame = new classroomCheck();
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
	public classroomCheck() {
		classroom = new Classroom();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(6, 6, 438, 52);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(6, 91, 438, 175);
		contentPane.add(textArea);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				if (name.isEmpty()) {
					textArea.setText("Cannot add an empty variable");
				} else {
					Student st = new Student(name);
					classroom.addStudent(st);
					textArea.setText("Add success");
				}
			}
		});
		btnAdd.setBounds(6, 61, 117, 29);
		contentPane.add(btnAdd);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				if(name.isEmpty()) {
					for(Student st : classroom.Display()) {
						textArea.setText(st.getName() + "\n");
					}
				}
			}
		});
		btnSearch.setBounds(163, 61, 117, 29);
		contentPane.add(btnSearch);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(327, 61, 117, 29);
		contentPane.add(btnRemove);

	}
}
