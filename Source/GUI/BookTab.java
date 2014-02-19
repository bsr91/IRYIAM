package GUI;



import java.awt.*;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;

public class BookTab extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private AuthorFrame aframe;
	private JTextField yearField;
	private JTextField titleField;
	private JTextField editionField;
	private JTextField cityField;
	private JTextField pubField;
	private JButton btnAddBookReference;
	private JButton btnRefreshReference;
	private JTextArea refArea;
	public BookTab(){
		super();
		this.aframe=new AuthorFrame();
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(1000,700));
		buildComponent();
		addListeners();
	}
	private void buildComponent(){
		add(aframe,BorderLayout.WEST);
		
		JPanel cPanel = new JPanel();
		add(cPanel, BorderLayout.CENTER);
		cPanel.setLayout(new BoxLayout(cPanel, BoxLayout.Y_AXIS));
		
		JPanel topPanel = new JPanel();
		cPanel.add(topPanel);
		
		JPanel yearPanel = new JPanel();
		yearPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		topPanel.add(yearPanel);
		
		JLabel lblYear = new JLabel("Year:");
		yearPanel.add(lblYear);
		
		yearField = new JTextField();
		yearPanel.add(yearField);
		yearField.setColumns(10);
		
		JPanel titlePanel = new JPanel();
		titlePanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		topPanel.add(titlePanel);
		
		JLabel lblBookTitle = new JLabel("Book Title:");
		titlePanel.add(lblBookTitle);
		
		titleField = new JTextField();
		titlePanel.add(titleField);
		titleField.setColumns(50);
		
		JPanel edPanel = new JPanel();
		edPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		topPanel.add(edPanel);
		
		JLabel lblEdition = new JLabel("Edition:");
		edPanel.add(lblEdition);
		
		editionField = new JTextField();
		edPanel.add(editionField);
		editionField.setColumns(5);
		
		JPanel cityPanel = new JPanel();
		cityPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		topPanel.add(cityPanel);
		
		JLabel lblPublishingCity = new JLabel("Publishing City:");
		cityPanel.add(lblPublishingCity);
		
		cityField = new JTextField();
		cityPanel.add(cityField);
		cityField.setColumns(20);
		
		JPanel pubPanel = new JPanel();
		pubPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		topPanel.add(pubPanel);
		
		JLabel lblPublisher = new JLabel("Publisher:");
		pubPanel.add(lblPublisher);
		
		pubField = new JTextField();
		pubPanel.add(pubField);
		pubField.setColumns(25);
		
		JPanel buttonPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) buttonPanel.getLayout();
		flowLayout.setAlignOnBaseline(true);
		cPanel.add(buttonPanel);
		buttonPanel.setBorder(null);
		
		btnAddBookReference = new JButton("Add Book Reference");
		buttonPanel.add(btnAddBookReference);
		
		btnRefreshReference = new JButton("Refresh Reference");
		buttonPanel.add(btnRefreshReference);
		
		JPanel ovPanel = new JPanel();
		ovPanel.setBorder(new TitledBorder(null, "Reference", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		cPanel.add(ovPanel);
		ovPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel = new JPanel();
		ovPanel.add(panel);
		panel.setLayout(new BorderLayout(5, 5));
		
		refArea = new JTextArea();
		refArea.setPreferredSize(new Dimension(600,500));
		panel.add(refArea, BorderLayout.CENTER);
		
		
	}
	private void addListeners(){
		/**
		 * TODO: Add listeners to panel Components
		 */
	}
	
	public JTextField getYearField() {
		return yearField;
	}
	public JTextField getTitleField() {
		return titleField;
	}
	public JTextField getEditionField() {
		return editionField;
	}
	public JTextField getCityField() {
		return cityField;
	}
	public JTextField getPubField() {
		return pubField;
	}
	public JButton getAddBookButton() {
		return btnAddBookReference;
	}
	public JButton getRefreshButton() {
		return btnRefreshReference;
	}
	public JTextArea getRefArea() {
		return refArea;
	}
}
