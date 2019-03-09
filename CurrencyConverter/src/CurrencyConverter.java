import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;

public class CurrencyConverter {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	String[] currency={"US Dollar","Indian Rupee","British Pound","Euro","Canadian Dollar","Emirati Driham","Chinese Yuan"};
	private JComboBox dd1=new JComboBox(currency);
	private JComboBox dd2=new JComboBox(currency);
	private Double x1=0.0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CurrencyConverter window = new CurrencyConverter();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CurrencyConverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		
		dd1 = new JComboBox(currency);
		dd1.setSelectedIndex(0);
		dd1.setBounds(151, 56, 109, 20);
		frame.getContentPane().add(dd1);
		
		dd2 = new JComboBox(currency);
		dd2.setSelectedIndex(0);
		dd2.setBounds(151, 144, 109, 20);
		frame.getContentPane().add(dd2);
		
		
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCurrencyConverter.setForeground(new Color(255, 175, 175));
		lblCurrencyConverter.setBounds(151, 11, 138, 14);
		frame.getContentPane().add(lblCurrencyConverter);
		
		JLabel lblNewLabel = new JLabel("Select Input Currency:");
		lblNewLabel.setBounds(20, 59, 118, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Select Output Currency:");
		lblNewLabel_1.setBounds(20, 147, 118, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter the Amount");
		lblNewLabel_2.setBounds(20, 96, 100, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Output Amount:");
		lblNewLabel_3.setBounds(20, 187, 100, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tf1 = new JTextField();
		tf1.setBounds(174, 93, 86, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(174, 184, 86, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		
		JButton convertBtn = new JButton("Convert");
		
		 /*
		 if(dd1.getSelectedIndex()==0) {
			 
		 x1= Double.valueOf(tf1.getText());
		 
		 
		 }
	     if(dd1.getSelectedIndex()==1)
		 {
	     x1= Double.valueOf(tf1.getText());
		 x1=x1*(0.014);
		 tf1.setText("hii");
		 
		 }
	     
	    
	     if(dd1.getSelectedIndex()==3)
	     {	 
		 x1= Double.valueOf(tf1.getText());
		 x1=x1*(1.30);
	     }
		 if(dd1.getSelectedIndex()==4)
		 {
			 x1= Double.valueOf(tf1.getText());
			 x1=x1*(1.12);
		 }
		 if(dd1.getSelectedIndex()==5)
		 {
		 x1= Double.valueOf(tf1.getText());
		 x1=x1*(0.75);
		 }
		 if(dd1.getSelectedIndex()==6)
		 {
			 x1= Double.valueOf(tf1.getText());
			 x1=x1*(0.27);
		 }
		 if(dd1.getSelectedIndex()==7) {
			 
		 
		 x1= Double.valueOf(tf1.getText());
		 x1=x1*(0.15);
		 }
		 */
		 convertBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				/*
				if(dd1.getSelectedIndex()==1&&dd2.getSelectedIndex()==2) {
					x1=Double.valueOf(tf1.getText());
					tf2.setText(x1.toString());
				}
				*/
				x1=Double.valueOf(tf1.getText()); 
				switch(dd1.getSelectedIndex()) {
				case 0:
					break;
				
				case 1:
					x1=x1*(0.014);
					break;
				
				case 2:
					x1=x1*(1.30);
					break;
					 
				case 3:
					x1=x1*(1.12);
					break;
					
				case 4:
					x1=x1*(0.75);
					break;
					
				case 5:
					x1=x1*(0.27);
					break;
					
				case 6:
					x1=x1*(0.15);
					break;
				}
				
				switch(dd2.getSelectedIndex()) {
				
				case 0:
					
					break;
				
				case 1:
					x1=x1/(0.014);
					
					break;
					
				case 2:
					x1=x1/(1.30);
					
					break;
					 
				case 3:
					x1=x1/(1.12);
					
					break;
				
				case 4:
					x1=x1/(0.75);
					break;
					
				case 5:
					x1=x1/(0.27);
					break;
				case 6:
					x1=x1/(0.15);
					break;
				}
				tf2.setText(String.valueOf(x1));
				
				
				
				
				/*switch(dd2.getSelectedIndex()) {
				case 1:
					tf2.setText("hii");
					 
				case 2:
					tf2.setText(String.valueOf(x1));
					 
				case 3:
					tf2.setText(String.valueOf(x1));
					
				case 4:
					tf2.setText(String.valueOf(x1));
				case 5:
					tf2.setText(String.valueOf(x1));
				case 6:
					tf2.setText(String.valueOf(x1));
					
				case 7:
					tf2.setText(String.valueOf(x1));
					
				}
				*/
			}
		});
		convertBtn.setBounds(247, 215, 89, 23);
		frame.getContentPane().add(convertBtn);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			tf1.setText(" ");
			tf2.setText(" ");
			}
		});
		btnClear.setBounds(109, 215, 89, 23);
		frame.getContentPane().add(btnClear);
		
		
		
	}
}
