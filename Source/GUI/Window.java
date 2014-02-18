package GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EtchedBorder;

public class Window extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JMenu sysMenu;
	private JMenuItem exitOption;
	private JMenuItem saveOption;
	private JMenuBar menu;
	
	private JPanel contentPanel;
	public Window(){
		super();
		setSize(1000,700);
		setLocationRelativeTo(null);
		setTitle("IYRIAM");
		setResizable(false);
		setVisible(true);
		
		this.contentPanel=(JPanel)this.getContentPane();
		
		this.menu=new JMenuBar();
		this.sysMenu=new JMenu("System");
		this.exitOption=new JMenuItem("Exit IRYIAM");
		this.saveOption=new JMenuItem("Save Reference List");
		
		buildComponent();
	}
	private void buildComponent(){
		contentPanel.setLayout(new BorderLayout());
		
		
		//JMenuBar
		menu.setBorder(new EtchedBorder(EtchedBorder.RAISED));
		exitOption.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
			}
		});
		sysMenu.add(exitOption);
		sysMenu.add(saveOption);
		menu.add(sysMenu);
		
		contentPanel.add(menu,BorderLayout.NORTH);
	}
}
