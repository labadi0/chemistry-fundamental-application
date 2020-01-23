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
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui_reaction extends JFrame implements Runnable {
	private static final Dimension IDEAL_MAIN_DIMENSION = new Dimension(1380, 300);
	private static final Dimension IDEAL_DASHBOARD_DIMENSION = new Dimension(1380, 300);

	private static Font font = new Font(Font.MONOSPACED, Font.BOLD, 20);

	private static final int SPEED = 10;
	private static final int MAX = 400;

	private static final long serialVersionUID = 1L;

	private JButton startButton = new JButton(" Reaction chimique de dioxyde de carbone : C(boule noire) + O2(boule rouge) =====> CO2 ");
	
	private Dashboard dashboard = new Dashboard();
	private Gui_reaction instance = this;
	private boolean stop = true;
	int compteur1 = 0;
	int compteur2 = 1160;
	int compteur3 = 1260;
	
	public Gui_reaction(String title) {
		super(title);
		init();
	}

	private void init() {
		updateValues();
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		
		contentPane.add(BorderLayout.CENTER, dashboard);
		contentPane.add(BorderLayout.SOUTH, startButton);
		
		add(startButton);
		startButton.setFont(font);
		startButton.addActionListener(new StartStopAction());
		

		dashboard.setPreferredSize(IDEAL_DASHBOARD_DIMENSION);
		contentPane.add(BorderLayout.SOUTH, dashboard);

		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		pack();
		setVisible(true);
		setPreferredSize(IDEAL_MAIN_DIMENSION);
		setResizable(false);
	}
	/**
	 * Mise à jour des differentes positions
	 */
	private void updateValues() {
		dashboard.repaint();
		dashboard.setSTART_X1( compteur1 );
		dashboard.setSTART_X2( compteur2 );
		dashboard.setSTART_X3( compteur3 );
		
	}
	
	@Override
        /**
	 * Dans cette classe on inremente les differentes positions à chaque evloution du temps
	 */
	public void run() {
		while (!stop) {
			try {
				Thread.sleep(SPEED);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			++compteur1 ;
			--compteur2 ;
			--compteur3;
			if( compteur1 >= MAX ) {
				compteur1 = MAX;
				compteur2 = 600;
				dashboard.repaint();
				dashboard.setLigne(600,500);
				if( compteur3 == 180 ) {
					dashboard.setSTART_X3( 200 );
					dashboard.repaint();
					dashboard.setLigne1(300,400);
					stop = true;
					compteur1 = 0;
					compteur2 = 1160;
					compteur3 = 1260;
				}
				else {
					dashboard.repaint();
					dashboard.setLigne1(0,0);
				}
			}
			else {
				dashboard.repaint();
				dashboard.setLigne(0,0);
				dashboard.setLigne1(0,0);
			}
			
			if (!stop) {
				updateValues();
			}
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.setColor(Color.RED);
		g.drawLine(400, 150, 50, 50);
	}
        /**
	 * 
	 * @author amadou
	 *Cette class permet de mettre en pause la réaction, et de reprenedre
	 */
	private class StartStopAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (!stop) {
				stop = true;
				//startButton.setText(" Reaction chimique de C + O2 => CO2 ");
			} else {
				stop = false;
				//startButton.setText(" Pause ");
				Thread reactionThread = new Thread(instance);
				reactionThread.start();
			}
		}
	}

	public static void main(String[] args) {
		new Gui_reaction("Reaction chimique");
	}
}