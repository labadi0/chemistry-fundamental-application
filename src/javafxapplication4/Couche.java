/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;






import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.TextField;
import java.awt.Label;
/**
 * Classe Couche a pour role de gérer les Couches et les éléctrons des atomes.
 * cette classe est responsable du resultat graphique de dessin .
 * cette classe contient un algorithme qui gére la disperrtion des éléctrons autours des couches.
 * @author Soufiane
 */
public class Couche extends JPanel {
/**
	 * 
	 */
	private static final long serialVersionUID = -8008461342546570411L;
private int n;
/**
 * Constructeur de la classe Couche, il reçoit un paramétre.
 * @param n est le nombres des éléctrons d'une atome.
 */
	public Couche(int n) {
		
		this.n=n;
		
	}
        /**
         * fonction permet de modifier le nombre des electrons lors du changement de l'element.
         * @param n  est le nombres des éléctrons d'une atome
         */
	public void setCouche(int n) {
		this.n = n;
		
	}
        /**
         * deffinir qu'est ce que la methode paint va dessiner lorsque on va l'appeler.
         */
	public void paint(Graphics g) {
		//super.paintComponents(g);
		g.setColor(Color.WHITE);
              
		drawCircle(g, 200, 250, 150); // center (30,30) r=20
		drawCircle(g, 200, 250, 130);
		drawCircle(g, 200, 250, 110);
	
		drawCircle(g, 200, 250, 80);
		drawCircle(g, 200, 250, 60);
		drawCircle(g, 200, 250, 40);
		drawCircle(g, 200, 250, 20);
		
		g.setColor(Color.WHITE);
		//drawFillCircle(g,200,250,5,20);
		drawFillCircle(g,200,250);
		
		
		
		}
	
	public void drawCircle(Graphics g, int xCenter, int yCenter, int R) {
		g.drawOval(xCenter-R, yCenter-R, 2*R, 2*R);
	}
	
	//public void drawFillCircle(Graphics g, int xCenter, int yCenter, int r2, int R) {
		
	public void drawFillCircle(Graphics g, int xCenter, int yCenter) {
        

		if(n<=2) {
        for (int i = 0; i < n; i++) {
            double t = 2 * Math.PI * i / n;
            int x = (int) Math.round( xCenter + 20 * Math.cos(t+(2.7*i)));
            int y = (int) Math.round(yCenter+ 20 * Math.sin(t+(2.7*i)));
          //  g.fillOval(x - r2, y - r2, 2 * r2, 2 * r2);
            g.fillOval(x - 5, y - 5, 2 * 5, 2 * 5);
        }
	}
		 if ((n>2) && (n<=10)) {
			   for (int i = 0; i < 2; i++) {
		            double t = 2 * Math.PI * i *2/ n;
		            int x = (int) Math.round( xCenter + 20 * Math.cos(t+(2.7*i)));
		            int y = (int) Math.round(yCenter+ 20 * Math.sin(t+(2.7*i)));
		            g.fillOval(x - 5, y - 5, 2 * 5, 2 * 5);

		}
			   for (int i = 0; i < n-2; i++) {
		            double t = 2 * Math.PI * i*2 / n;
		            int x = (int) Math.round( xCenter + 40 * Math.cos(t+(2.7*i)));
		            int y = (int) Math.round(yCenter+ 40 * Math.sin(t+(2.7*i)));
		            g.fillOval(x - 5, y - 5, 2 * 5, 2 * 5);
	
		}
		
		}
		 if ((n>10) && (n<=28)){
			   for (int i = 0; i < 2; i++) {
		            double t = 2 * Math.PI * i / n;
		            int x = (int) Math.round( xCenter + 20 * Math.cos(t+(2.7*i)));
		            int y = (int) Math.round(yCenter+ 20 * Math.sin(t+(2.7*i)));
		            g.fillOval(x - 5, y - 5, 2 * 5, 2 * 5);

		}
			   for (int i = 0; i < 8; i++) {
		            double t = 2 * Math.PI * i / n;
		            int x = (int) Math.round( xCenter + 40 * Math.cos(t+(2.7*i)));
		            int y = (int) Math.round(yCenter+ 40 * Math.sin(t+(2.7*i)));
		            g.fillOval(x - 5, y - 5, 2 * 5, 2 * 5);
			
			
		}
			   for (int i = 0; i < n-10; i++) {
		            double t = 2 * Math.PI * i / n;
		            int x = (int) Math.round( xCenter + 60 * Math.cos(t+(2.7*i)));
		            int y = (int) Math.round(yCenter+ 60 * Math.sin(t+(2.7*i)));
		            g.fillOval(x - 5, y - 5, 2 * 5, 2 * 5);
			   }
		}
		 
		 // CHOUF MENA 
		 if ((n>28) && (n<=50)) {
			 for (int i = 0; i < 2; i++) {
		            double t = 2 * Math.PI * i / n;
		            int x = (int) Math.round( xCenter + 20 * Math.cos(t+(2.7*i)));
		            int y = (int) Math.round(yCenter+ 20 * Math.sin(t+(2.7*i)));
		            g.fillOval(x - 5, y - 5, 2 * 5, 2 * 5);

		}
			   for (int i = 0; i < 8; i++) {
		            double t = 2 * Math.PI * i / n;
		            int x = (int) Math.round( xCenter + 40 * Math.cos(t+(2.7*i)));
		            int y = (int) Math.round(yCenter+ 40 * Math.sin(t+(2.7*i)));
		            g.fillOval(x - 5, y - 5, 2 * 5, 2 * 5);
			
			
		}
			   for (int i = 0; i < 18; i++) {
		            double t = 2 * Math.PI * i / n;
		            int x = (int) Math.round( xCenter + 60 * Math.cos(t+(2.7*i)));
		            int y = (int) Math.round(yCenter+ 60 * Math.sin(t+(2.7*i)));
		            g.fillOval(x - 5, y - 5, 2 * 5, 2 * 5);
			   }
			   for (int i = 0; i < n-28; i++) {
		            double t = 2 * Math.PI * i / n;
		            int x = (int) Math.round( xCenter + 80 * Math.cos(t+(2.7*i)));
		            int y = (int) Math.round(yCenter+ 80 * Math.sin(t+(2.7*i)));
		            g.fillOval(x - 5, y - 5, 2 * 5, 2 * 5);
			 
			   }
		 }
		// HAK RAK DERT COPIE HNA 
	
		 if ((n>50) && (n<=72)) {
			 for (int i = 0; i < 2; i++) {
		            double t = 2 * Math.PI * i / n;
		            int x = (int) Math.round( xCenter + 20 * Math.cos(t+(2.7*i)));
		            int y = (int) Math.round(yCenter+ 20 * Math.sin(t+(2.7*i)));
		            g.fillOval(x - 5, y - 5, 2 * 5, 2 * 5);

		}
			   for (int i = 0; i < 8; i++) {
		            double t = 2 * Math.PI * i / n;
		            int x = (int) Math.round( xCenter + 40 * Math.cos(t+(2.7*i)));
		            int y = (int) Math.round(yCenter+ 40 * Math.sin(t+(2.7*i)));
		            g.fillOval(x - 5, y - 5, 2 * 5, 2 * 5);
			
			
		}
			   for (int i = 0; i < 18; i++) {
		            double t = 2 * Math.PI * i / n;
		            int x = (int) Math.round( xCenter + 60 * Math.cos(t+(2.7*i)));
		            int y = (int) Math.round(yCenter+ 60 * Math.sin(t+(2.7*i)));
		            g.fillOval(x - 5, y - 5, 2 * 5, 2 * 5);
			   }
			   for (int i = 0; i < 32; i++) {
		            double t = 2 * Math.PI * i / n;
		            int x = (int) Math.round( xCenter + 80 * Math.cos(t+(2.7*i)));
		            int y = (int) Math.round(yCenter+ 80 * Math.sin(t+(2.7*i)));
		            g.fillOval(x - 5, y - 5, 2 * 5, 2 * 5);
			 
			   }
			   for (int i = 0; i < n-60; i++) {
		            double t = 2 * Math.PI * i / n;
		            int x = (int) Math.round( xCenter + 100 * Math.cos(t+(2.7*i)));
		            int y = (int) Math.round(yCenter+ 100 * Math.sin(t+(2.7*i)));
		            g.fillOval(x - 5, y - 5, 2 * 5, 2 * 5);
			 
			   }
		 }
		 
		 // ZEDT VHOUFFFFFFFFFFFFFFFFFFFFFFFFFFFF
		 
		 if ((n>72) && (n<=118)) {
			 for (int i = 0; i < 2; i++) {
		            double t = 2 * Math.PI * i / n;
		            int x = (int) Math.round( xCenter + 20 * Math.cos(t+(2.7*i)));
		            int y = (int) Math.round(yCenter+ 20 * Math.sin(t+(2.7*i)));
		            g.fillOval(x - 5, y - 5, 2 * 5, 2 * 5);

		}
			   for (int i = 0; i < 8; i++) {
		            double t = 2 * Math.PI * i / n;
		            int x = (int) Math.round( xCenter + 40 * Math.cos(t+(2.7*i)));
		            int y = (int) Math.round(yCenter+ 40 * Math.sin(t+(2.7*i)));
		            g.fillOval(x - 5, y - 5, 2 * 5, 2 * 5);
			
			
		}
			   for (int i = 0; i < 18; i++) {
		            double t = 2 * Math.PI * i / n;
		            int x = (int) Math.round( xCenter + 60 * Math.cos(t+(2.7*i)));
		            int y = (int) Math.round(yCenter+ 60 * Math.sin(t+(2.7*i)));
		            g.fillOval(x - 5, y - 5, 2 * 5, 2 * 5);
			   }
			   for (int i = 0; i < 32; i++) {
		            double t = 2 * Math.PI * i / n;
		            int x = (int) Math.round( xCenter + 80 * Math.cos(t+(2.7*i)));
		            int y = (int) Math.round(yCenter+ 80 * Math.sin(t+(2.7*i)));
		            g.fillOval(x - 5, y - 5, 2 * 5, 2 * 5);
			 
			   }
			   for (int i = 0; i < 50; i++) {
		            double t = 2 * Math.PI * i / n;
		            int x = (int) Math.round( xCenter + 110 * Math.cos(t+(2.7*i)));
		            int y = (int) Math.round(yCenter+ 110 * Math.sin(t+(2.7*i)));
		            g.fillOval(x - 5, y - 5, 2 * 5, 2 * 5);
			 
			   }
			   
			   for (int i = 0; i < n-110; i++) {
		            double t = 2 * Math.PI * i / n;
		            int x = (int) Math.round( xCenter + 130 * Math.cos(t+(2.7*i)));
		            int y = (int) Math.round(yCenter+ 130 * Math.sin(t+(2.7*i)));
		            g.fillOval(x - 5, y - 5, 2 * 5, 2 * 5);
			 
			   }
			   
			   
			   
			   
			   
			   
		 }
		 
		 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	}

