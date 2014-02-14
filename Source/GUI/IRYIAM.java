package GUI;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*
;

public class IRYIAM {
	JFrame window;
	JPanel allContent;
	JMenuBar rootMenu;
	
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
	}
}
