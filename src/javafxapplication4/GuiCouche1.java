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

public class GuiCouche1 extends JFrame implements Runnable  {
	private Couche1 a;
        /**
         * instance de la classe Mendeleev_Table.
         */
	Mendeleev_Table tab = new Mendeleev_Table();
	Scouches1 sc = new Scouches1(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	
	private static final Dimension IDEAL_DASHBOARD_DIMENSION = new Dimension(400, 400);

	private JButton start = new JButton("");
	
	private GuiCouche1 instance = this;
	private JFrame f;
	private JPanel p;
	private JButton startButton = new JButton("");
	private final JTextField textField = new JTextField();
	private final JLabel label = new JLabel("");
	/**
         * constructeur de la classe GuiCouche.
         * @param n  nombre des electrons d'un element .
         */
		public GuiCouche1(int n ) {
			gui(n);
		}
		
		private boolean stop = true;
                
                
                
                
                
                
                
                
                public void gui(int n) {
			
                	 a = new Couche1(n);	
           // textField.setBounds(159, 508, 86, 42);
		//	textField.setColumns(10);
			
			f = new JFrame ("Couches");
			f.setSize(1300, 600);
                        
			
                          f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			
			p=new JPanel ();
			//p.setBackground(Color.GREEN);
                        p.setBackground(new Color(61,73, 86));
			p.setLayout(null);
			label.setText(sc.calculCouches(n));
			f.repaint();
			
			
			
			f.getContentPane().add(p);
			a.setBounds(271, 0, 400, 405);
			
			a.setPreferredSize(IDEAL_DASHBOARD_DIMENSION);
			p.add(a);
			
			p.add(textField);
			label.setBounds(25, 445, 1300, 52);
                        label.setForeground(Color.WHITE);
                        label.setFont(new Font("Serif",Font.PLAIN,20));
                       // startButton.setBounds(50, 508, 91, 42);
                		startButton.addActionListener(new StartStopAction());
                		p.add(startButton);
                        
			
			p.add(label);
			f.setVisible(true);
			
			
		}

	
	
	
	
	
	
            	private class StartStopAction implements ActionListener {
            		@Override
            		public void actionPerformed(ActionEvent e) {
            			if (!stop) {
            				stop = true;
            				startButton.setText(" Start ");
            			} else {
            				stop = false;
            				startButton.setText(" Pause ");
            			Thread chronoThread = new Thread(instance);
            				chronoThread.start();
            			}
            		}
            	}
	
	
	
	
	
	
	
	
	
	
	
	
	
            	@Override
            	public void run() {
            		// TODO Auto-generated method stub
            		while (!stop) {
            			
            			try {
            				Thread.sleep(1000);
            			} catch (InterruptedException e) {
            				System.out.println(e.getMessage());
            			}
            			
            		}
            	
            	
            	
            	
            	
            	
            	
            	
            	
            	}
	
	
	
	
	
	
	
	
	
	
	
                
                
                
                
                
                
                
                
                
                
         public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GuiCouche1(2);

	}












}

