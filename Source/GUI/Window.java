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
	private JMenuItem loadOption;
	private JMenuBar menu;
	
	private TabPanel tabPanel;
	
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
		this.exitOption=new JMenuItem("Exit");
		this.saveOption=new JMenuItem("Save");
		this.loadOption=new JMenuItem("Load");
		this.tabPanel=new TabPanel();
		
		buildComponent();
	}
	private void buildComponent(){
		contentPanel.setLayout(new BorderLayout());
		contentPanel.add(tabPanel,BorderLayout.CENTER);
		
		//JMenuBar
		menu.setBorder(new EtchedBorder(EtchedBorder.RAISED));
		exitOption.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				warnOnExit();
			}
		});
		saveOption.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				/**
				 *  TODO: Export to XML stuff
				 */
			}
		});
		loadOption.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				/**
				 *  TODO: Load XML stuff
				 */
			}
		});
		sysMenu.add(exitOption);
		sysMenu.add(saveOption);
		sysMenu.add(loadOption);
		menu.add(sysMenu);
		contentPanel.add(menu,BorderLayout.NORTH);
	}
	private void warnOnExit(){
		int v= JOptionPane.showConfirmDialog(this,
				"Exit without saving?",
				"Exit Warning",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.WARNING_MESSAGE);	
		if(v==JOptionPane.YES_OPTION){
			dispose();
		}
	}
}
