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
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * c'est la classe ou on fait appel aux objets de la classe DevloppeDashboard et ajoute des boutons pour faire plusieurs type de representation 
 * @author TAREK
 */

public class GuiIsomere extends JFrame {
	 private JFrame f;
		private JPanel p;	
	        private JPanel control = new JPanel();
	        JButton molecule1 = new JButton("C2H4O");
	    	JButton molecule2 = new JButton("C3H8O");
	    	JButton molecule3 = new JButton("C3K8O");
	    	JButton molecule4 = new JButton("C3H8S");




	    	Mendeleev_Table tab = new Mendeleev_Table();
	    	//private NewDashboard a =  new NewDashboard();

	    	private IsomereDashboard a	= new IsomereDashboard("C2H4O1");
	    	
	
	            
	            public GuiIsomere () throws NullPointerException{
	    	
	    		initialize();

	    	}
	/**
         * dans cette methode on ajoute pour chaque bouton une action pour que chaque button faire une representation  
         * @throws NullPointerException .. 
         */
	    	public void initialize() throws NullPointerException{ 
	    		
	    		
	    		molecule4.addActionListener(new ActionListener() {
	    			public void actionPerformed(ActionEvent arg0) {
	    				Molecule V = new Molecule ("C3H8S1");
	    				V.setAll();
	    				
	    				a.setElement1(V.getElement1());
	    				a.setElement2(V.getElement2());
	    				a.setElement3(V.getElement3());
	    				a.setN1(V.getIndice1() );
	    				a.setN2(V.getIndice2() );
	    				a.setN3(V.getIndice3() );
	    				
	    				
	    				f.repaint();	
	    			}
	    		});
	    		
	    		molecule3.addActionListener(new ActionListener() {
	    			public void actionPerformed(ActionEvent arg0) {
	    				Molecule V = new Molecule ("C3K8O1");
	    				V.setAll();
	    				
	    				a.setElement1(V.getElement1());
	    				a.setElement2(V.getElement2());
	    				a.setElement3(V.getElement3());
	    				a.setN1(V.getIndice1() );
	    				a.setN2(V.getIndice2() );
	    				a.setN3(V.getIndice3() );
	    				
	    				
	    				f.repaint();	
	    			}
	    		});
	    		
	    		molecule2.addActionListener(new ActionListener() {
	    			public void actionPerformed(ActionEvent arg0) {
	    				Molecule V = new Molecule ("C3H8O1");
	    				V.setAll();
	    				
	    				a.setElement1(V.getElement1());
	    				a.setElement2(V.getElement2());
	    				a.setElement3(V.getElement3());
	    				a.setN1(V.getIndice1() );
	    				a.setN2(V.getIndice2() );
	    				a.setN3(V.getIndice3() );
	    				
	    				
	    				f.repaint();	
	    				
	    				
	    			}
	    		});
	    		
	    		molecule1.addActionListener(new ActionListener() {
	    			public void actionPerformed(ActionEvent arg0) {
	    				Molecule V = new Molecule ("C2H4O1");
	    				V.setAll();
	    				
	    			
	    				a.setElement1(V.getElement1());
	    				a.setElement2(V.getElement2());
	    				a.setElement3(V.getElement3());
	    				a.setN1(V.getIndice1() );
	    				a.setN2(V.getIndice2() );
	    				a.setN3(V.getIndice3() );
	    				
	    				
	    				f.repaint();	
	    			}
	    			
	    		});
	    		
	    	;
	    		molecule4.setBounds(410, 508, 91, 42);
	    		molecule3.setBounds(280, 508, 91, 42);
	    		molecule2.setBounds(150, 508, 91, 42);
	    		molecule1.setBounds(25, 508, 91, 42);
	    		f = new JFrame ("Isomére");
	    		f.setSize(1000, 600);
	    		f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	    		
	    		p=new JPanel ();
	    		
	    		p.add(a);
	    	
	    		p.add(molecule4);
	    		p.add(molecule3);
	    		p.add(molecule2);
	    		p.add(molecule1);
	    		p.setBackground(new Color(61,73,86));
	    		p.setLayout(null);
	    		f.repaint();
	    		
	    		f.getContentPane().add(p);
	    		a.setBounds(10, 0, 1000, 600);
	    		//a.setBounds(x, y, width, height);
	    		//f.setSize(width, height);
	    		f.setVisible(true);
	    		this.getContentPane().setBackground(Color.black);
	    				}
	    		
	    		
	    	



	                  
	                    
	                    
	                    
	                    
	                    
	                    public static void main(String[] args) {
	                		// TODO Auto-generated method stub
	                    	GuiIsomere p =	new GuiIsomere();

	                	}

	        
	        
	        
	        
	       


}

