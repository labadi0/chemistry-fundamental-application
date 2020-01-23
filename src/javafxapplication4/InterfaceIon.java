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
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class InterfaceIon {
	
	private static final long serialVersionUID = 1L;
	Mendeleev_Table tab = new Mendeleev_Table();
	
	private JFrame frame;
	private static final Color MESSAGE_ERROR_COLOR = Color.RED;
	private static final Color MESSAGE_STANDARD_COLOR = Color.white;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceIon window = new InterfaceIon();
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
	
	public InterfaceIon() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
                frame.setTitle("Ion");
		//frame.getContentPane().setBackground(new Color(0, 0, 0));
                frame.getContentPane().setBackground(new Color(61,73, 86));
		frame.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 99));
		frame.setBounds(100, 100, 450, 300);
		
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
                frame.getContentPane().setLayout(null);
                //frame.setBackground(Color.BLACK);
		
		
		JButton btnNumeroAtomiqueDe = new JButton("Numero atomique de l'ion");
		
		btnNumeroAtomiqueDe.setBounds(12, 204, 264, 40);
		frame.getContentPane().add(btnNumeroAtomiqueDe);
		
		JTextField textField = new JTextField();
		textField.setBounds(296, 204, 114, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		// recuperation de la valeur_charge saisie
		
		//String value = textField.getText();
		//int index = Integer.parseInt(value);
		//recherche de l'ion 
		//Ion i = new Ion();
		
		JLabel symbol = new JLabel();
		symbol.setBackground(Color.LIGHT_GRAY);
		symbol.setFont(new Font("Dialog", Font.BOLD, 50));
		// on montre l'ion dans l'interface
		//lblNewLabel.setText(value);
		symbol.setBounds(100, 62, 103, 93);
		frame.getContentPane().add(symbol);
		
		JLabel charge = new JLabel();
		charge.setBounds(216, 62, 41, 50);
		frame.getContentPane().add(charge);
		
		JLabel message = new JLabel();
		message.setBounds(51, 0, 342, 27);
		frame.getContentPane().add(message);
		/**
                 *
                 *  on cherche l'element dans le tableau				
                 */
		btnNumeroAtomiqueDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * on cherche l'element dans le tableau
				 */
				int index = 0;
				int valeur_charge;
				String valeur_charge_saisie = textField.getText();
				String symbole_Ion = null;
				for( int k = 0; k < tab.getTableau().size(); k++) {
					if( tab.getTableau().get(k).getSymbole().equals(valeur_charge_saisie) ) {
						symbole_Ion = tab.getTableau().get(k).getSymbole();
						index = k;
					}
				}
			
				if( symbole_Ion == null) {
					message.setForeground(MESSAGE_ERROR_COLOR);
					message.setText("Ne correspond à aucun élément du tableau");
					charge.setText("");
					symbol.setText("");
				} 
				else {
					message.setForeground(MESSAGE_STANDARD_COLOR);
					
				
					//recherche de l'ion 
					Ion ion = new Ion();
				    valeur_charge = ion.monoatomique(index);
					// on montre l'ion dans l'interface
					symbol.setText(""+tab.getTableau().get(index).getSymbole() );//+ i.monoatomique(index) );
					symbol.setForeground(MESSAGE_STANDARD_COLOR);
					if( valeur_charge == 0) {
						message.setForeground(MESSAGE_ERROR_COLOR);
						message.setText("Cet élément ne possedède pas d'ion");
						charge.setText("");
					}
					else {
						charge.setForeground(MESSAGE_STANDARD_COLOR);
						message.setForeground(MESSAGE_STANDARD_COLOR);
						message.setText("Ion  "+ tab.getTableau().get(index).getName() );
						if ( valeur_charge == 1) {
							charge.setText("+");
						}
						else if ( valeur_charge == -1) {
							charge.setText("-");
						}
						else if( valeur_charge > 0 ) {
							charge.setText(valeur_charge+"+");
						}
						else {
							valeur_charge = valeur_charge * -1;
							charge.setText(valeur_charge+"-");
						}
					}
				}
			}
		   }); 
	 }
        
        
        
        
        public void run() {
				try {
					InterfaceIon window = new InterfaceIon();
					window.frame.setVisible(true);
                                        
                                        
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
}

