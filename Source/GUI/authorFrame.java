package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class authorFrame extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField surnameField;
	private JTextField initialField;
	private JTextPane authorListPane;
	private JButton addAuthorButton;
	public authorFrame(){
		super();
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setLayout(new BorderLayout(0, 0));
		buildComponent();
	}
	private void buildComponent(){
			
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setPreferredSize(new Dimension(250,700));
		add(panel_1, BorderLayout.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("Surname:");
		panel_1.add(lblNewLabel_1);
		
		surnameField = new JTextField();
		panel_1.add(surnameField);
		surnameField.setColumns(15);
		
		JLabel lblNewLabel_2 = new JLabel("Initials:");
		panel_1.add(lblNewLabel_2);
		
		initialField = new JTextField();
		panel_1.add(initialField);
		initialField.setColumns(15);
		
		addAuthorButton = new JButton("Add Author and Reset");
		panel_1.add(addAuthorButton);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Current Authors", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.add(panel);
		
		authorListPane = new JTextPane();
		panel.add(authorListPane);
		authorListPane.setPreferredSize(new Dimension(200,450));
		authorListPane.setEditable(false);
		
		JLabel lblNewLabel = new JLabel("Authors");
		add(lblNewLabel, BorderLayout.NORTH);
		lblNewLabel.setToolTipText("Enter author details with NO punctuation except double-barrel hyphens");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	}
}
