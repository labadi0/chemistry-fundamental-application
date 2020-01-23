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
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;
/**
 * c'est la classe qui fait la representation de Isomere D'un molecule 
 * elle contient comme attribut  element1 qui est le premier element d'un molecule et n1 qui est nombre des element1 et element2 le 2éme element d'un molecule et n2 qui est nombre des element2 , et pour element3 c'est le 3eme element dans un molecule et n3 c'est le nombre des element3 dans le molecule 
 * et le Symbole celui du molecule 
 * @author TAREK
 */

public class IsomereDashboard extends JPanel {

	Mendeleev_Table tab = new Mendeleev_Table();
	String symbole ;
	String element1 = "";
	String element2 = "" ;
	String element3 = "" ;
	int n1 	;
	int n2 ;
	int n3;
	public IsomereDashboard(String symbole) {
		Molecule v = new Molecule(symbole);
		v.setAll();
		element1 = v.getElement1();
		element2 = v.getElement2();
		element3 = v.getElement3();
		n1 = v.getIndice1();
		n2 = v.getIndice2();
		n3 = v.getIndice3();
		
	}
	public Mendeleev_Table getTab() {
		return tab;
	}
	public void setTab(Mendeleev_Table tab) {
		this.tab = tab;
	}
	public String getSymbole() {
		return symbole;
	}
	public void setSymbole(String symbole) {
		this.symbole = symbole;
	}
	public String getElement1() {
		return element1;
	}
	public void setElement1(String element1) {
		this.element1 = element1;
	}
	public String getElement2() {
		return element2;
	}
	public void setElement2(String element2) {
		this.element2 = element2;
	}
	public String getElement3() {
		return element3;
	}
	public void setElement3(String element3) {
		this.element3 = element3;
	}
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public int getN3() {
		return n3;
	}
	public void setN3(int n3) {
		this.n3 = n3;
	}
	
	public void paint (Graphics g) {
		 super.paintComponents(g);
		 dessine(g);
	 
	 }
	
        
        /**
          * cette methode fait le dessin des Symbole en utilisant les methode drawfill,verfierTheFirst,verfierTheSedond et pour dessiner on verifie celui qui a la plus grand nombre des electrons dans couche exterieur apres on dessine celui qui a le plus grand nombre de couche au milieu de jPanel  et on dessine ses electron  apres on parcours jusqu'a le n2 nombre des element apres on ajoute aussi ses eletrons de la couche EXteriure 
          * @param g  objet de la classe Graphic
          */
        
        
	public void dessine(Graphics g)  {
		 g.setColor(Color.WHITE);		
		 g.setFont(new Font("SansSerif", Font.PLAIN, 50));
		 
		 
		 if (n1==2 && n2 == 4) {
		 for (int i = 0; i < n1 ; i++) {
			 g.drawString(verfierTheFirst() , 10 + 150*i, 250);		 
			 g.drawString("3" ,90, 275);
			 drawfill( g , 2,  40, 250);
			 drawfill( g , 2, 75, 210);
			 drawfill( g , 2, 85, 210);
			// drawfill(g, k, xcenter, ycenter);
		//	 drawfill( g , 2,  20, 400);
		 }
		 g.drawString(verfierTheSedond(), 160, 140);
		 drawfill( g , 2, 85, 170);
		 drawfill( g , 2, 75, 170);
		 g.drawLine(490, 0, 490, 600);

		 
		 g.drawString(verfierTheThird(), 270, 250);
		 g.drawString(verfierTheThird(), 45, 250);
		 drawfill( g , 2, 112, 250);
		 drawfill( g , 2, 160, 250);
		 g.drawLine(90, 230, 140, 230);
		 g.drawLine(175, 190, 175, 150);
		 g.drawLine(185, 190, 185, 150);
		 g.drawLine(210, 230, 262, 230);
		 
		 g.drawString(verfierTheFirst(), 700, 250);
		 g.drawString(verfierTheFirst(), 850, 250);
		 drawfill( g , 2,  650, 240);
		 drawfill( g , 2,  650, 260);
		 
		 drawfill( g , 2,  730, 240);
		 drawfill( g , 2,  730, 260);
		 
		 g.drawString(verfierTheThird(), 700, 150);
		 g.drawString(verfierTheThird(), 700, 350);
		 g.drawString(verfierTheThird(), 850, 350);
		 
		 g.drawString(verfierTheSedond(), 830, 150);
		 g.drawString(verfierTheThird(), 870, 150);
		 drawfill( g , 2,  770, 180);
		 drawfill( g , 2,  770, 220);
		 drawfill( g , 2,  766, 285);
		 drawfill( g , 2,  766, 330);
		 drawfill( g , 2,  617, 330);
		 drawfill( g , 2,  617, 285);
		 drawfill( g , 2,  617, 220);
		 drawfill( g , 2,  617, 180);	 
		 g.drawLine(717, 265, 717, 310);
		 g.drawLine(866, 265, 866, 310);
		 g.drawLine(717, 200, 717, 160);
		 g.drawLine(870, 200, 870, 160);
		 
		 g.drawLine(750, 240, 830, 240);
		 g.drawLine(750, 220, 830, 220);
		 
		 }
		 

		 
		
		 else if (n1==3 && n2 == 8) {
			 for (int i = 0; i < n1 ; i++) {
				
				 
				 g.drawString(verfierTheFirst() , 174, 180);
				 g.drawString(verfierTheFirst() , 75, 180);
				 
				 g.drawString(verfierTheFirst() , 274, 180);
				 
				 for (int j = 0; j < monoatomique(verifierFirstElement()) ; j++) {
						int xcent = 70+100*i;
						int ycent =180;
						 double t = j * Math.PI/2 ;
						 int x = (int) Math.round(xcent + Math.cos(t)*30);
						 int y = (int) Math.round(ycent + Math.sin(t)*30)   ;	
					 
						 g.fillOval(x+18, y-22, 5, 5);
					 }
			 }
			 g.drawLine(490, 0, 490, 600);
			 
			 
			 drawfill( g , 1,  420, 180);
			 g.drawString(verfierTheSedond(), 370, 175);
			 drawfill( g , 1,  475, 180);
			 
			 
			 
			 for (int k = 0; k < n2; k++) {
				 if(k==0) {
						
						
					 g.drawString(verfierTheThird(), -4, 175);
						drawfill( g , 1,  90, 180);
						g.drawLine(30, 160, 60, 160);
						g.drawLine(90, 130, 90, 80);
						
						g.drawLine(190, 130, 190, 80);
						g.drawLine(290, 130, 290, 80);						
						g.drawLine(90, 190, 90, 250);
						
						g.drawLine(190, 190, 190, 250);
						g.drawLine(290, 190, 290, 250);
						
						g.drawLine(120, 160, 160, 160);
						
						g.drawLine(220, 160, 260, 160);
						
						g.drawLine(320, 160, 360, 160);
						
						
						
						
				 }
	
				 if(k==1) {
						
						
						 g.drawString(verfierTheThird(), 70, 300);
							drawfill( g , 1,  150, 270);
							
					 }
					 
					
						  if (k==2) {
						  g.drawString(verfierTheThird()  ,75, 70);
						  drawfill( g , 1,  150, 100);

						  }

						  if (k==3) {
						  g.drawString(verfierTheThird()  ,175, 70);
						  	drawfill( g , 1,  250, 100);


					 }
					 
						  if (k==4) {
							  g.drawString(verfierTheThird()  ,175, 300);
							  drawfill( g , 1,  250, 270);
						

						  }
						  if (k==5) {
							  g.drawString(verfierTheThird()  ,273, 70);
							  drawfill( g , 1,  350, 100);						

						  }
						  if (k==6) {
							  g.drawString(verfierTheThird()  ,273, 300);
							  drawfill( g , 1,  350, 100);						
							  drawfill( g , 1,  350, 270);
						  }
						  
						  if (k==7) {
							  g.drawString(verfierTheThird()  ,450, 175);
							  drawfill( g , 1,  510, 180);
							  g.drawLine(415, 160, 450, 160);
								
							 
						  }
					  
					 }
			 
		
			 
			 g.drawString(verfierTheSedond(), 670, 300);
			 drawfill( g , 1,  725, 300);
			 drawfill( g , 1,  775, 300);
			 
			 for (int i = 1; i < n1 ; i++) {
				
				 
				 drawfill( g , 1,  656, 265);
				 drawfill( g , 1,  622, 300);
				 drawfill( g , 1,  690, 300);
				 drawfill( g , 1,  656, 340);
				 
				 
					 g.drawString(verfierTheFirst() , 755, 300);
					 g.drawString(verfierTheFirst() , 855, 300);
					 
					 g.drawString(verfierTheFirst() , 580, 300);
					 
					 for (int j = 0; j < monoatomique(verifierFirstElement()) ; j++) {
							int xcent = 650+100*i;
							int ycent =300;
							 double t = j * Math.PI/2 ;
							 int x = (int) Math.round(xcent + Math.cos(t)*30);
							 int y = (int) Math.round(ycent + Math.sin(t)*30)   ;	
						 
							 g.fillOval(x+18, y-22, 5, 5);
						 }
				 }
			 
			 
			 
			 for (int k = 0; k < n2; k++) {
				 if(k==0) {
						
						
					 g.drawString(verfierTheThird(), 500, 300);
						drawfill( g , 1,  600, 300);				
					g.drawLine(540, 280, 560, 280);
					g.drawLine(630, 280, 665, 280);
					g.drawLine(715, 280, 740, 280);
					g.drawLine(800, 280, 840, 280);
						
						
				 }
	
				 if(k==1) {
						
						
						 g.drawString(verfierTheThird(), 580, 160);
							drawfill( g , 1,  655, 200);
						  	 g.drawLine(596, 180, 596, 245);

					
				 }
					 
					
						  if (k==2) {
						  g.drawString(verfierTheThird()  ,580, 440);
						  drawfill( g , 1,  655, 405);
						  	 g.drawLine(596, 320, 596, 385);

						  }

						  if (k==3) {
						  g.drawString(verfierTheThird()  ,755, 160);
						  	drawfill( g , 1,  830, 200);
						  	 g.drawLine(770, 180, 770, 250);

					 }
					 
						  if (k==4) {
							  g.drawString(verfierTheThird()  ,755, 440);
							  drawfill( g , 1,  830, 405);
							  g.drawLine(770, 310, 770, 385);


						  }
						  if (k==5) {
							  g.drawString(verfierTheThird()  ,850, 160);
							  drawfill( g , 1,  930, 200);	
							  g.drawLine(870, 180, 870, 250);

						  }
						  if (k==6) {
							  g.drawString(verfierTheThird()  ,850, 440);
							  drawfill( g , 1,  930, 405);
							  g.drawLine(870, 310, 870, 385);
						  }
						  
						  if (k==7) {
							  g.drawString(verfierTheThird()  ,936, 300);
							  drawfill( g , 1,  990, 300);
							  g.drawLine(900, 280, 930, 280);
								
							 
						  }
					  
					 }
		 
				 
			 }
		 
	}	 
		 
		 
		 		
				
			 
		 
		 
		 
		 
		 
		 
	
				 
				 
				 
				 
				 
			

	
                                        /**
                                         * c'est la methode qui fait le dessin des electron de la couche exterieur d'un element 
                                         * @param g objet de la classe Graphic
                                         * @param k nombre a donner quand on fait l'appel de la fonction 
                                         * @param xcenter postion de centre de x quand on dessin eletron
                                         * @param ycenter postion de centre de Y quand on dessin eletron
                                         */
	
	
	public void drawfill(Graphics g ,int k, int xcenter,int ycenter ) {
		
		
		double t = 2*k* Math.PI/2 ;
		 System.out.print(k);
		 int x = (int) Math.round(xcenter + Math.cos(t)*80);
		 int y = (int) Math.round(ycenter + Math.sin(t)*80)   ;	
		 
		 g.fillOval(x+18, y-22, 5, 5);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
                /**
                 * cette methode verifie si element1 le premier Element d'un melecule existe dans le tableau ou non si il existe il envoie le nombre de electron de ce element  
                 * @return nombre de electron 
                 */
	
	
	 public int verifierFirstElement () {
		 int x1 = 0 ;
		 

		 
		 for (int i = 0; i < 117; i++) {
			if (element1.equals(tab.getTableau().get(i).getSymbole())) {
				x1 = i;
				//x1 = tab.getTableau().get(i);
			}
		 }
		 return x1;
	
	 }
	  /**
                 * cette methode verifie si element2 le 2éme Element d'un melecule existe dans le tableau ou non si il existe il envoie le nombre de electron de ce element  
                 * @return nombre de electron 
                 */
	 
	 public int verifierSecondElement () {
		 int x1 = 0 ;
		 

		 
		 for (int i = 0; i < 117; i++) {
			if (element2.equals(tab.getTableau().get(i).getSymbole())) {
				x1 = i;
			}
		 }
		 return x1;
	
	 }
          /**
                 * cette methode verifie si element3 le 3eme Element d'un melecule existe dans le tableau ou non si il existe il envoie le nombre de electron de ce element  
                 * @return nombre de electron 
                 */
	 
	 
	 public int verifierthirdElement () {
		 int x1 = 0 ;
 
		 for (int i = 0; i < 117; i++) {
			if (element3.equals(tab.getTableau().get(i).getSymbole())) {
				x1 = i;
			}
		 }
		 return x1;
	
	 }
	 
	 	 /**
          * cette methode calcule le nombre electron de la derniere couche quand on donne au paramaetre de la fonction nombre quelquonque d'un proton  
          * @param index : nombre de proton  
          * @return nombre des electrons de la derniere couche
          */
	 

		public int monoatomique(int index) {
			//if( tab.get_calculMassOfElemnt_m(nbProton_p, nb_neutron_n) == e)
			
			if( tab.getTableau().get(index).getGroupe() == "1A" || tab.getTableau().get(index).getGroupe() == "1B") {
				return 1;
			}
			
			else if( tab.getTableau().get(index).getGroupe() == "2A" || tab.getTableau().get(index).getGroupe() == "2B" ) {
				if( tab.getTableau().get(index).getNbElectron_e() == 111 || tab.getTableau().get(index).getNbElectron_e() == 80) {
					return 0;
				}
				else {
					return 2;
				}
			}
			
			else if( tab.getTableau().get(index).getGroupe() == "3A" || tab.getTableau().get(index).getGroupe() == "3B" ) {
				if( (tab.getTableau().get(index).getNbElectron_e() == 5) || 
					(tab.getTableau().get(index).getNbElectron_e() >= 121 && tab.getTableau().get(index).getNbElectron_e() <= 126) ) {
					return 0;
				}
				else if( (tab.getTableau().get(index).getNbElectron_e() >= 89 && tab.getTableau().get(index).getNbElectron_e() <= 92) ||
						(tab.getTableau().get(index).getNbElectron_e() == 94) ) {
					return 4;
				}
				else if( tab.getTableau().get(index).getNbElectron_e() == 93 ) {
					return 5;
				}
				else {
					return 3;
				}
			}
			
			else if( tab.getTableau().get(index).getGroupe() == "4A" || tab.getTableau().get(index).getGroupe() == "4B" ) {
				if( (tab.getTableau().get(index).getNbElectron_e() == 104) || (tab.getTableau().get(index).getNbElectron_e() == 104) ||
					(tab.getTableau().get(index).getNbElectron_e() == 14)	|| (tab.getTableau().get(index).getNbElectron_e() == 114) ) {
					return 0;
				} else {
					return 4;
				}
			}
			
			else if( tab.getTableau().get(index).getGroupe() == "5A" ) {
				if( (tab.getTableau().get(index).getNbElectron_e() == 105) ) {
						return 0;
				}
				else if( (tab.getTableau().get(index).getNbElectron_e() == 105) ) {
					return 3;
				}
				else {
					return 5;
				}
			}
			
			else if( tab.getTableau().get(index).getGroupe() == "5B" ) {
				if( (tab.getTableau().get(index).getNbElectron_e() == 105) || (tab.getTableau().get(index).getNbElectron_e() == 83) ) {
					return 3;
			     }
				else if( (tab.getTableau().get(index).getNbElectron_e() == 115) ) {
					return 0;
				}
				else {
					return 3;
				}
			}
			
			else if( tab.getTableau().get(index).getGroupe() == "6A" ) {
				if( (tab.getTableau().get(index).getNbElectron_e() == 24) ) {
					return 3;
			     }
				else if( (tab.getTableau().get(index).getNbElectron_e() == 106) ) {
					return 0;
				}
				else {
					return 6;
				}
			}
			
			else if( tab.getTableau().get(index).getGroupe() == "6B" ) {
				if( (tab.getTableau().get(index).getNbElectron_e() == 84) ) {
					return 2;
			     }
				else if( (tab.getTableau().get(index).getNbElectron_e() == 116) ) {
					return 0;
				}
				else {
					return 2;
				}
			}
			
			else if( tab.getTableau().get(index).getGroupe() == "7A" ) {
				if( (tab.getTableau().get(index).getNbElectron_e() == 25) ) {
					return 2;
			     }
				else if( (tab.getTableau().get(index).getNbElectron_e() == 107) ) {
					return 0;
				}
				else {
					return 7;
				}
			}
			
			else if( tab.getTableau().get(index).getGroupe() == "7B" ) {
				if( (tab.getTableau().get(index).getNbElectron_e() == 116) ) {
					return 0;
				}
				else {
					return 1;
				}
			}
			
			else if( tab.getTableau().get(index).getGroupe() == "8A" ) {
				if( (tab.getTableau().get(index).getNbElectron_e() >= 108) &&  (tab.getTableau().get(index).getNbElectron_e() >= 110) ) {
					return 0;
			     }
				else if( ( (tab.getTableau().get(index).getNbElectron_e() >= 76) &&  (tab.getTableau().get(index).getNbElectron_e() >= 78) ) ) {
					return 4;
				}
				else if( ( (tab.getTableau().get(index).getNbElectron_e() >= 44) &&  (tab.getTableau().get(index).getNbElectron_e() >= 45) ) ) {
					return 3;
				}
				else {
					return 2;
				}
			}
			
			else if( tab.getTableau().get(index).getGroupe() == "8B" ) {
				return 0;
			}
			
			return 0;
		}
		
		
                
                /**
                 * cette methode verefie celui qui a le plus grand nombre des electrons de couche exterieur entre 3 element et elle retourne son  symbole   
                 * @return symbole d'un element 
                 */
                
                
                public String verfierTheFirst() {
			int x = monoatomique(verifierFirstElement());		
			int y =  monoatomique(verifierSecondElement ());
			int z = monoatomique(verifierthirdElement());
		
		
				if ((y<x )&& (z<x) ) {
					return element1;		
			   }
				
				else  if ((x<y) && (z<y)) {
					return element2;
				 }
			
				else 	 {
				return element3;			
			 }
				
		}
		
                /**
                 * cette methode verefie celui qui a ni le plus petit ni le plus grand , nombre des electrons de couche exterieur entre 2 element et elle retourne son  symbole   
                 * @return symbole d'un element 
                 */
                
                
		public String verfierTheSedond () {
			int x = monoatomique(verifierFirstElement());		
			int y =  monoatomique(verifierSecondElement ());
			int z = monoatomique(verifierthirdElement());
		
		
			if (((y<x )&& (x<z)) || ((z<x )&& (x<y))  ) {
				return element1;		
		   }
			
			else  if (((x<y )&& (y<z)) || ((z<y )&& (y<x)) ) {
				return element2;
			 }
		
			else 	if (((x<z )&& (z<y)) || ((y<z )&& (z<x))) {
			return element3;			
		 }
			else {
			return "";
			}

	}
		
		/**
                 * cette methode verefie celui qui a le plus petit nombre des electrons de couche exterieur entre 3 element et elle retourne son  symbole   
                 * @return symbole d'un element 
                 */
		public String verfierTheThird () {
			int x = monoatomique(verifierFirstElement());		
			int y =  monoatomique(verifierSecondElement ());
			int z = monoatomique(verifierthirdElement());
		
		
			if ((x<y )&& (x<z)  ) {
				return element1;		
		   }
			
			else  if ((y<x )&& (y<z)) {
				return element2;
			 }
		
			else 	if ((z<x )&& (z<y) ) {
			return element3;			
		 }
			else {
			return "";
			}

	}
		
		
		
		
		
	 
	 
	 
	



}

