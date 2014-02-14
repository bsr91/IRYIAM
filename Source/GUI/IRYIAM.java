package GUI;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;

public class IRYIAM {
	JFrame window;
	JPanel allContent;
	JMenuBar rootMenu;
	private authorFrame bookAuthorFrame;
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
		rootMenu.setBorder(new BevelBorder(BevelBorder.RAISED));
		JMenu systemOption=new JMenu("System");
		
		JMenuItem exitOption=new JMenuItem("Exit");
		exitOption.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				window.dispose();
			}
		});
		systemOption.setBorder(new LineBorder(Color.DARK_GRAY));
		systemOption.add(exitOption);
		rootMenu.add(systemOption);
		allContent.add(rootMenu, BorderLayout.NORTH);
		
		/*
		 * Tabs
		 */
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		window.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel bookTab = new JPanel();
		tabbedPane.addTab("Add Book Reference", null, bookTab, null);
		bookTab.setLayout(new BorderLayout());
		
		JPanel journalTab = new JPanel();
		tabbedPane.addTab("Add Journal Reference", null, journalTab, null);
		journalTab.setLayout(new BorderLayout());
		
		JPanel journalTabC = new JPanel();
		journalTabC.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		journalTab.add(journalTabC, BorderLayout.CENTER);
		
		JPanel webTab = new JPanel();
		tabbedPane.addTab("Add Web Reference", null, webTab, null);
		webTab.setLayout(new BorderLayout());
		
		JPanel webTabC = new JPanel();
		webTabC.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		webTab.add(webTabC, BorderLayout.CENTER);
		
		
		/*
		 * Author Panel (Left) [books]
		 */
		authorFrame bookAuthorFrame=new authorFrame();
		bookTab.add(bookAuthorFrame, BorderLayout.WEST);
		
	}
	public authorFrame getBookAuthorFrame(){
		return this.bookAuthorFrame;
	}
}
