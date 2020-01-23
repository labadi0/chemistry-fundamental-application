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
 * c'est la classe ou on fait appel aux objets de la classe LewisDashboard et ajoute des boutons pour faire plusieurs type de representation 
 * @author TAREK
 */

public class GuiLewis extends JFrame {
        private JFrame f;
	private JPanel p;	
        private JPanel control = new JPanel();
	JButton molecule1 = new JButton("CH4");
	JButton molecule2 = new JButton("C2H6");
	JButton molecule3 = new JButton("NH3");
	JButton molecule4 = new JButton("PH3");
	JButton molecule5 = new JButton("N2H6");



	Mendeleev_Table tab = new Mendeleev_Table();
	

	private LewisDashboard a	= new LewisDashboard("C2H6");
	

        public GuiLewis () throws NullPointerException{
	
		initialize();

	}
        
        
        /**
         * dans cette methode on ajoute pour chaque bouton une action pour que chaque button faire une representation  
         * @throws NullPointerException ..
         */
	public void initialize() throws NullPointerException{ 
		
		
		molecule5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Valide V = new Valide ("N2H6");
				a.setElement1(V.getElement1());
				a.setElement2(V.getElement2());
				a.setN1(V.getIndice1() );
				a.setN2(V.getIndice2() );
				f.repaint();	
			}
		});
		molecule4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Valide V = new Valide ("PH3");
				a.setElement1(V.getElement1());
				a.setElement2(V.getElement2());
				a.setN1(V.getIndice1() );
				a.setN2(V.getIndice2() );
				f.repaint();	
			}
		});
		
		molecule3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Valide V = new Valide ("NH3");
				a.setElement1(V.getElement1());
				a.setElement2(V.getElement2());
				a.setN1(V.getIndice1() );
				a.setN2(V.getIndice2() );
				f.repaint();	
			}
		});
		
		molecule2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Valide V = new Valide ("C2H6");
				a.setElement1(V.getElement1());
				a.setElement2(V.getElement2());
				a.setN1(V.getIndice1() );
				a.setN2(V.getIndice2() );
				f.repaint();	
			}
		});
		
		molecule1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Valide V = new Valide ("CH4");
				a.setElement1(V.getElement1());
				a.setElement2(V.getElement2());
				a.setN1(V.getIndice1() );
				a.setN2(V.getIndice2() );
				f.repaint();	
			}
			
		});
		
		molecule5.setBounds(550, 508, 91, 42);
		molecule4.setBounds(410, 508, 91, 42);
		molecule3.setBounds(280, 508, 91, 42);
		molecule2.setBounds(150, 508, 91, 42);
		molecule1.setBounds(25, 508, 91, 42);
		f = new JFrame ("Representation de Lewis");
		f.setSize(1000, 600);
		f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		p=new JPanel ();
		
		p.add(a);
		p.add(molecule5);
		p.add(molecule4);
		p.add(molecule3);
		p.add(molecule2);
		p.add(molecule1);
		p.setBackground(new Color(61,73,86));
		p.setLayout(null);
		f.repaint();
		
		f.getContentPane().add(p);
		a.setBounds(500, 0, 500, 400);
		f.setVisible(true);
				}
		
		
	



                public void run() throws NullPointerException{
				try {
					GuiLewis window = new GuiLewis();
					window.f.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		}


}
