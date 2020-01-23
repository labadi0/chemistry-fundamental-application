/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

/**
 *
 * @author amadou
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;



import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Gui_valide {
	/**
	 *
	*/
	
	Mendeleev_Table tab = new Mendeleev_Table();
	
	private JFrame frame;
	private static final Color MESSAGE_ERROR_COLOR = Color.RED;
	private static final Color MESSAGE_STANDARD_COLOR = Color.white;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_valide window = new Gui_valide();
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
	
	public Gui_valide() {
		initialize3();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize3() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 99));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//frame.setBackground(Color.BLACK);
               // frame.setBackground(new Color(61,73, 86));
                frame.getContentPane().setBackground(new Color(61,73, 86));
		
		
		JButton btnVerifier = new JButton("Verifier");
		
		btnVerifier.setBounds(12, 204, 264, 40);
		frame.getContentPane().add(btnVerifier);
		btnVerifier.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JTextField textField = new JTextField();
		textField.setBounds(296, 204, 114, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setFont(new Font("Dialog", Font.BOLD, 20));
		 
		
		JLabel symbol = new JLabel();
		symbol.setBackground(Color.LIGHT_GRAY);
		symbol.setFont(new Font("Dialog", Font.BOLD, 30));
		
		symbol.setBounds(200, 62, 200, 90);
		frame.getContentPane().add(symbol);
		
		JLabel message = new JLabel();
		message.setBounds(51, 0, 342, 27);
		frame.getContentPane().add(message);
                frame.setTitle("Validation molécule");
		
		btnVerifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String symbole = textField.getText();
				
				if( symbole.length() == 0) {
					message.setForeground(MESSAGE_ERROR_COLOR);
					message.setText("Vous n'avez pas saisie de molecule");
					symbol.setText("");
				}
				else if( symbole.length() > 5 ) {
					message.setForeground(MESSAGE_ERROR_COLOR);
					message.setText("Limiter vous aux molecules simples");
					symbol.setText("");
				}
				else {
					message.setForeground(MESSAGE_STANDARD_COLOR);
					
					Valide v = new Valide(symbole);
					if( v.molecule() ) {
						symbol.setText("Valide");
						symbol.setForeground(MESSAGE_STANDARD_COLOR);
					} else {
						symbol.setForeground(MESSAGE_ERROR_COLOR);
						symbol.setText("inValide");
					}
				}
			}
		   }); 
	 }
        
        public void run() {
				try {
					Gui_valide window = new Gui_valide();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
}

