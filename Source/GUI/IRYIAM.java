package GUI;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*
;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class IRYIAM {
	JFrame window;
	JPanel allContent;
	JMenuBar rootMenu;
	private JTextField nameField;
	private JTextField textField_1;
	
	public IRYIAM(){
		window=new JFrame();
		window.setSize(1000,700);
		window.setLocationRelativeTo(null);
		window.setTitle("IYRIAM");
		window.setResizable(false);
		window.setVisible(true);
		
		
		allContent=(JPanel)window.getContentPane();
		allContent.setLayout(new BorderLayout());
		
		
		/*
		 * Top menu
		 */
		rootMenu=new JMenuBar();
		rootMenu.setBorder(new BevelBorder(-1));
		JMenu system=new JMenu("System");
		
		JMenuItem exitOption=new JMenuItem("Exit");
		exitOption.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				window.dispose();
			}
		});
		system.add(exitOption);
		rootMenu.add(system);
		allContent.add(rootMenu, BorderLayout.NORTH);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		window.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel bookTab = new JPanel();
		tabbedPane.addTab("Add Book Reference", null, bookTab, null);
		bookTab.setLayout(new BorderLayout(0, 0));
		
		JPanel leftPanel = new JPanel();
		leftPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		bookTab.add(leftPanel, BorderLayout.WEST);
		leftPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel central = new JPanel();
		leftPanel.add(central, BorderLayout.CENTER);
		central.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setPreferredSize(new Dimension(250,700));
		central.add(panel_1, BorderLayout.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("Surname:");
		panel_1.add(lblNewLabel_1);
		
		nameField = new JTextField();
		panel_1.add(nameField);
		nameField.setColumns(15);
		
		JLabel lblNewLabel_2 = new JLabel("Initials:");
		panel_1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(15);
		
		JButton addAuthorButton = new JButton("Add Author and Reset");
		addAuthorButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * add author stuff
				 */
			}
		});
		panel_1.add(addAuthorButton);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Current Authors", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.add(panel);
		
		JTextPane textPane = new JTextPane();
		panel.add(textPane);
		textPane.setPreferredSize(new Dimension(200,450));
		textPane.setEditable(false);
		
		JLabel lblNewLabel = new JLabel("Authors");
		leftPanel.add(lblNewLabel, BorderLayout.NORTH);
		lblNewLabel.setToolTipText("\"Enter author details with NO punctuation except double-barrel hyphens\"");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		
		JPanel rightPanel = new JPanel();
		rightPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		bookTab.add(rightPanel);
		
		JPanel journalTab = new JPanel();
		tabbedPane.addTab("Add Journal Reference", null, journalTab, null);
		journalTab.setLayout(new BorderLayout());
		
		JPanel journalTabC = new JPanel();
		journalTabC.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		journalTab.add(journalTabC, BorderLayout.CENTER);
		
		JPanel webTab = new JPanel();
		tabbedPane.addTab("Add Web Reference", null, webTab, null);
		webTab.setLayout(new BorderLayout(0, 0));
		
		JPanel webTabC = new JPanel();
		webTabC.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		webTab.add(webTabC, BorderLayout.CENTER);
		
	}
}
