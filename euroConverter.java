import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class euroConverter extends JFrame {
	
		//items for the inputPanel
		JPanel inputPanel;
		JLabel lbleur;
		JTextField txteur;
		
		//items for the buttonPanel
		JPanel buttonPanel;
		JButton poundsButton;
		JButton dollarsButton;
		JButton yenButton;
		
		//items for the outputPanel
		JPanel outputPanel;
		JLabel lblConversion;
		JTextField txtConversion;
		
		public euroConverter(){
			
			super("euroConverter");
			setLayout(new FlowLayout());
			//initialize the items for the inptPanel
			inputPanel = new JPanel();
			inputPanel.setLayout(new GridLayout(2,2,5,5));
			
			lbleur = new JLabel("Eur:");
			txteur = new JTextField(6);
			//add the items to the JPanel
			inputPanel.add(lbleur);
			inputPanel.add(txteur);
			//now add the JPanel to the JFrame
			add(inputPanel);
			
			//initialize the items for the currencies Panel
			buttonPanel = new JPanel();
			buttonPanel.setLayout(new FlowLayout());
			poundsButton = new JButton("£");
			dollarsButton = new JButton("$");
			yenButton = new JButton("Y");
			
			buttonPanel.add(poundsButton);
			buttonPanel.add(dollarsButton);
			buttonPanel.add(yenButton);
			
			add(buttonPanel);
			
			//initialize the items for the output panel
			outputPanel = new JPanel();
			outputPanel.setLayout(new GridLayout(1,2,5,5));
			lblConversion = new JLabel("Conversion");
			txtConversion = new JTextField(6);
			outputPanel.add(lblConversion);
			outputPanel.add(txtConversion);
			add(outputPanel);
			
			
			//button to convert to pounds
			poundsButton.addActionListener(
					new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							
							String xString = txteur.getText();
							//String yString = txtY.getText();
							double euro, poundRate, result;
							try{
								
								euro = Double.parseDouble(xString);
							}catch (Exception ex){
								
								//do pop up message
								JOptionPane.showMessageDialog(null, "Not a valid number x set to 0");
								euro = 0.0;
							}
							
							
							result = euro * 0.84;
							txtConversion.setText(result+"");//concatenated and empty string
														//to convert to a string
							lblConversion.setText("Pounds:");
						}
						
					}
					);
			
			
			
			
			//button to convert to dollars
			dollarsButton.addActionListener(
					new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							
							String xString = txteur.getText();
							//String yString = txtY.getText();
							double euro, dollarRate, result;
							try{
								
								euro = Double.parseDouble(xString);
							}catch (Exception ex){
								
								//do pop up message
								JOptionPane.showMessageDialog(null, "Not a valid number x set to 0");
								euro = 0.0;
							}
							
							
							result = euro * 1.16;
							txtConversion.setText(result+"");//concatenated and empty string
														//to convert to a string
						}
						
					}
					);
			
			//button to convert to yen
			yenButton.addActionListener(
					new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							
							String xString = txteur.getText();
							//String yString = txtY.getText();
							double euro, yenRate, result;
							try{
								
								euro = Double.parseDouble(xString);
							}catch (Exception ex){
								
								//do pop up message
								JOptionPane.showMessageDialog(null, "Not a valid number x set to 0");
								euro = 0.0;
							}
							
							
							result = euro * 122.491;
							txtConversion.setText(result+"");//concatenated and empty string
														//to convert to a string
						}
						
					}
					);
			
			
		}
		
		

}
