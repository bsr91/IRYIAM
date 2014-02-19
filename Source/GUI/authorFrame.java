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
import javax.swing.BoxLayout;
import java.awt.FlowLayout;

public class AuthorFrame extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField surnameField;
	private JTextField initialField;
	private JTextPane authorListPane;
	private JButton addAuthorButton;
	private JButton delAuthorButton;
	public AuthorFrame(){
		setPreferredSize(new Dimension(250,700));
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setLayout(new BorderLayout());
		buildComponent();
	}
	private void buildComponent(){

			
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		JPanel iPanel = new JPanel();
		panel_1.add(iPanel);
		
		JLabel lblNewLabel_2 = new JLabel("Initials:");
		iPanel.add(lblNewLabel_2);
		
		initialField = new JTextField();
		iPanel.add(initialField);
		initialField.setColumns(15);
		
		JPanel sPanel = new JPanel();
		panel_1.add(sPanel);
		
		JLabel lblNewLabel_1 = new JLabel("Surname:");
		sPanel.add(lblNewLabel_1);
		
		surnameField = new JTextField();
		sPanel.add(surnameField);
		surnameField.setColumns(15);
		
		JPanel bPannel = new JPanel();
		panel_1.add(bPannel);
		bPannel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		addAuthorButton = new JButton("Add Author and Reset");
		bPannel.add(addAuthorButton);
		
		delAuthorButton = new JButton("Delete Author");
		bPannel.add(delAuthorButton);
		
		JPanel lPanel = new JPanel();
		lPanel.setBorder(new TitledBorder(null, "Current Authors", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.add(lPanel);
		
		authorListPane = new JTextPane();
		lPanel.add(authorListPane);
		authorListPane.setPreferredSize(new Dimension(200,450));
		authorListPane.setEditable(false);
		
		JLabel lblNewLabel = new JLabel("Authors");
		add(lblNewLabel, BorderLayout.NORTH);
		lblNewLabel.setToolTipText("Enter author details with NO punctuation except double-barrel hyphens");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	}
	public JTextField getInitialField(){
		return initialField;
	}
	public JTextField getSurnameField(){
		return surnameField;
	}
	public JButton getAddButton(){
		return addAuthorButton;
	}
	public JTextPane getListPane(){
		return authorListPane;
	}
	public JButton getDeleteAuthorButton() {
		return delAuthorButton;
	}
}
