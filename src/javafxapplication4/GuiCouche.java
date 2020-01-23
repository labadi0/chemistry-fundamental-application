/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

/**
 *
 * @author TAREK
 */





import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Gui classse des Couches.
 * @author Soufiane
 */


public class GuiCouche extends JFrame {
    /**
     * instance de la classe Mendeleev_Table()
     */
	Mendeleev_Table tab = new Mendeleev_Table();
	Scouches sc = new Scouches(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	
	private static final Dimension IDEAL_DASHBOARD_DIMENSION = new Dimension(400, 400);

	private JButton start = new JButton(" Start ");
	private Couche a = new Couche(0);
        /**
         * instance de cette classe
         */
	private GuiCouche instance = this;
	private JFrame f;
	private JPanel p;
	private final JTextField textField = new JTextField();
	private final JLabel label = new JLabel("");
	
		public GuiCouche() {
			gui();
		}
		
		
                
                
                
                
                
                
                
                
                public void gui() {
			textField.setBounds(159, 508, 86, 42);
			textField.setColumns(10);
			
			f = new JFrame ("Couches");
			f.setSize(1300, 600);
                        
                        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			
			p=new JPanel ();
			//p.setBackground(Color.GREEN);
                        p.setBackground(new Color(61,73, 86));
			p.setLayout(null);
			start.addActionListener(new ActionListener() {
                            /**
                             * permet de choisir un element et recuperer le nombre des electrons de l'element.
                             * @param arg0 
                             */
				public void actionPerformed(ActionEvent arg0) {
					
					int index = 0;
					int z=0;
					
					String valeur_saisie = textField.getText();
					Element element = null;
					for( int k = 0; k < tab.getTableau().size(); k++) {
						if( tab.getTableau().get(k).getSymbole().equals(valeur_saisie) ) {
							element = tab.getTableau().get(k);
							index = k;
							z=tab.getTableau().get(k).getNbElectron_e()	;						
						}
					}
					if( element == null ) {
						
						
					}
					else {
						label.setText(sc.calculCouches(element));
						a.setCouche(z);
						f.repaint();
					}
				}
				
			});
			start.setBounds(25, 508, 91, 42);
			
			p.add(start);
			
			f.getContentPane().add(p);
			a.setBounds(271, 0, 400, 405);
			
			a.setPreferredSize(IDEAL_DASHBOARD_DIMENSION);
			p.add(a);
			
			p.add(textField);
			label.setBounds(25, 445, 1300, 52);
                        label.setForeground(Color.WHITE);
                        label.setFont(new Font("Serif",Font.PLAIN,20));
                        
                        
			
			p.add(label);
			f.setVisible(true);
			
			
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuiCouche g = new GuiCouche();

	}

}

