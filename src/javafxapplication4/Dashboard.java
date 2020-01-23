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
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import javax.swing.JPanel;

public class Dashboard extends JPanel {

	private static final long serialVersionUID = 1L;

	private int START_X1 = 0;
	private int START_X2 = 0;
	private int START_X3 = 0;

	private int START_Y1 = 50;
	private int START_Y2 = 50;
	private int START_Y3 = 50;
	private int a = 00;
	private int b = 00;

	private int a1 = 00;
	private int b1 = 00;

	@Override
        /**
	 * Permet de dessiner chaque objet sur le tableau de bord
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g1 = (Graphics2D) g;
		Graphics2D g2 = (Graphics2D) g;
		Graphics2D g3 = (Graphics2D) g;
		g.setColor(Color.RED);
		g.drawLine(a,100 ,b,100);

		g.setColor(Color.RED);
		g.drawLine(a1,100 ,b1,100);
		g1.drawImage( readImage("C:\\Users\\TAREK\\Documents\\NetBeansProjects\\JavaFXApplication4\\src\\image/o.jpeg"), START_X2, START_Y2, 100, 100, null );
		g2.drawImage( readImage("C:\\Users\\TAREK\\Documents\\NetBeansProjects\\JavaFXApplication4\\src\\image/c.jpg"), START_X1, START_Y1, 100, 100, null );
		g3.drawImage( readImage("C:\\Users\\TAREK\\Documents\\NetBeansProjects\\JavaFXApplication4\\src\\image/o.jpeg"), START_X3, START_Y3, 100, 100, null );
	}
        
        /**
	 * 
	 * @param filePath schemin de l'image
	 * @return renvoi l'image
	 */

	public static Image readImage(String filePath) {
		try {
			return ImageIO.read(new File(filePath));
		} catch (IOException e) {
			System.err.println("-- image non trouvé ! --");
			return null;
		}
	}
        /**
	 * 
	 * @param a position pour mettre à jour la ligne
	 * @param b position pour mettre à jour la ligne
	 */
	public void setLigne(int a, int b) {
		this.a = a;
		this.b = b;
	}

        /**
	 * 
	 * @param a position pour mettre à jour la ligne
	 * @param b position pour mettre à jour la ligne
	 */
        
        
        
	public void setLigne1(int a, int b) {
		this.a1 = a;
		this.b1 = b;
	}
        /**
	 * 
	 * @param START_X1 mise à jour de la position de  l'atome en animation
	 */

	public void setSTART_X1(int START_X1) {
		this.START_X1 = START_X1;
	}
        /**
	 * 
	 * @param START_Y1 mise à jour de la position de  l'atome en animation
	 */
	public void setSTART_Y1(int START_Y1) {
		this.START_Y1 = START_Y1;
	}
        /**
	 * 
	 * @param START_X3 mise à jour de la position de  l'atome en animation
	 */

	public void setSTART_X3(int START_X3) {
		this.START_X3 = START_X3;
	}
        /**
	 * 
	 * @param START_Y3 mise à jour de la position de  l'atome en animation
	 */
        
        
	public void setSTART_Y3(int START_Y3) {
		this.START_Y3 = START_Y3;
	}
	/**
	 * 
	 * @param START_X2 mise à jour de la position de  l'atome en animation
	 */
	public void setSTART_X2(int START_X2) {
		this.START_X2 = START_X2;
	}
        /**
	 * 
	 * @param START_Y2 mise à jour de la position de  l'atome en animation
	 */
	public void setSTART_Y2(int START_Y2) {
		this.START_Y2 = START_Y2;
	}
}
