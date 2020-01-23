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
 * c'est la classe qui fait la representation de Developée D'un molecule 
 * elle contient comme attribut  element1 qui est le premier element d'un molecule et n1 qui est nombre des element1 et element2 le 2éme element d'un molecule et n2 qui est nombre des element2 
 * et le Symbole celui du molecule 
 * @author TAREK
 */

public class DevloppeDashboard extends JPanel {

	Mendeleev_Table tab = new Mendeleev_Table();
	String symbole;
	
	
	String element1 = null;
	String element2 = null ;
	int n1 	;
	int n2 ;
	
	public DevloppeDashboard(String symbole) {
		Valide V = new Valide(symbole);
		element1 = V.getElement1();
		element2 = V.getElement2();
		n1 			= V.getIndice1();
		n2 			= V.getIndice2();
	}
	
	public void setElement1(String element1) {
		this.element1 = element1;
	}

	public void setElement2(String element2) {
		this.element2 = element2;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	 public void paint (Graphics g) {
		 super.paintComponents(g);
		 dessine(g);
	 
	 }
	 /**
          * cette methode fait le dessin des Symbole en utilisant les methode drawfill,verfierTheFirst,verfierTheSedond et pour dessiner on verifie celui qui a la plus grand nombre des electrons dans couche exterieur apres on dessine celui qui a le plus grand nombre de couche au milieu de jPanel  et on dessine ses electron  apres on parcours jusqu'a le n2 nombre des element apres on ajoute aussi ses eletrons de la couche EXteriure 
          * @param g objet de la classe Graphic
          */
	 
	 
	 public void dessine(Graphics g) {
		 g.setColor(Color.white);
		
		
		 g.setFont(new Font("SansSerif", Font.PLAIN, 58));
		 
		 for (int i = 0; i < n1 ; i++) {
			 g.drawString(verfierTheFirst() , 150 + 100*i, 250); 
			 for (int j = 0; j < monoatomique(verifierFirstElement()) ; j++) {
				int xcent = 150+100*i;
				int ycent =250;
				 double t = j * Math.PI/2 ;
				 int x = (int) Math.round(xcent + Math.cos(t)*30);
				 int y = (int) Math.round(ycent + Math.sin(t)*30)   ;	
			 
				 g.fillOval(x+18, y-22, 5, 5);
			 }
			 
			 
					
				
			 }
		 		
			 
			 for (int k = 0; k < n2; k++) {
				 
				 
				 if (n1==1 && n2<=4) {
					 if (k==0) {
						    g.drawString(verfierTheSedond() , 50 + 100*2, 250); 
							drawfill( g , k,  150, 250);
							  g.drawLine(200, 230, 250, 230);

					 }
					 if (k==1) {
					
					
					g.drawString(verfierTheSedond() , 50 , 250);

					 drawfill( g , k,  150, 250);
					 g.drawLine(140, 230, 90, 230);
				      }
					 

						  if (k==2) {
						  drawfill(g,k,70,320);
						  g.drawString(verfierTheSedond() ,150, 350);
						  g.drawLine(170, 260, 170, 300);

						  }
						  if (k==3) {
						  drawfill(g,k,230,170);
						  g.drawString(verfierTheSedond() ,150, 150);
						  g.drawLine(170, 150, 170, 200);

						  }
				 }
				 
				 if (n1==2 && n2==4) {
					 if (k<=1) {
							g.drawString(verfierTheSedond() , 50 + 100*3*k, 250);
							drawfill( g , 1,  150, 250);
							drawfill( g , 2,  250, 250);

					 }
					 if (k==2) {
						 g.drawString(verfierTheSedond() ,150, 350);
							drawfill( g , 1, 230 , 325);
							drawfill( g , 1, 330 , 325);
							
						 
					 }
					 if (k==3) {
						  g.drawString(verfierTheSedond() ,250, 350);

						 
					 }

				 }
				 
				
				 
				 if ((n1==2) && (n2<=8)&&(n2>4)) {
					 if(k<=1) {
							g.drawString(verfierTheSedond() , 50 + 150*2*k, 250); 
							drawfill( g , 1,  150, 250);
							drawfill( g , 2,  250, 250);
							g.drawLine(200, 230, 240, 230);
							g.drawLine(350, 230, 300, 230);


 
					 }
					
						  if (k==2) {
						  g.drawString(verfierTheSedond() ,150, 350);
							drawfill( g , 1, 230 , 325);
							drawfill( g , 1, 330 , 325);
						  g.drawLine(140, 230, 90, 230);

						  }

						  if (k==3) {
						  g.drawString(verfierTheSedond() ,250, 350);
						  g.drawLine(170, 260, 170, 305);
						  g.drawLine(270, 260, 270, 305);


					 }
					 
						  if (k==4) {
							  g.drawString(verfierTheSedond() ,250, 150);
								drawfill( g , 1, 330 , 180);
								 g.drawLine(270, 200, 270, 160);

							  g.drawString(verfierTheSedond() ,150, 150);
							  drawfill( g , 1, 230 , 180);
							  g.drawLine(170, 160, 170, 200);


						  }
					 }
				 
				 
				 
				 
				 
				 
				
				 
				 
				 if ((n1==2) && (n2==4)) {
					 if(k<=1) {
							g.drawString(verfierTheSedond() , 50 + 150*2*k, 250); 
							drawfill( g , 1,  150, 250);
							drawfill( g , 2,  250, 250);
							g.drawLine(200, 230, 240, 230);
							g.drawLine(350, 230, 300, 230);
							g.drawLine(170, 200, 270, 200);



 
					 }
					
						  if (k==2) {
						  g.drawString(verfierTheSedond() ,150, 350);
							drawfill( g , 1, 230 , 325);
							drawfill( g , 1, 330 , 325);
						  g.drawLine(140, 230, 90, 230);

						  }

						  if (k==3) {
						  g.drawString(verfierTheSedond() ,250, 350);
						  g.drawLine(170, 260, 170, 305);
						  g.drawLine(270, 260, 270, 305);


					 }
					 
						  if (k==4) {
							  g.drawString(verfierTheSedond() ,250, 150);
								drawfill( g , 1, 330 , 180);
								 g.drawLine(270, 200, 270, 160);

							  g.drawString(verfierTheSedond() ,150, 150);
							  drawfill( g , 1, 230 , 180);
							  g.drawLine(170, 160, 170, 200);


						  }
						  
						  
						  
					 }
				 
				
				 
				 
				 
				 if ((n1==3) && (n2==8)) {
					 if(k<=1) {
							//g.drawString(verfierTheSedond() , 50 + 150*2*k, 250); 
							g.drawString(verfierTheSedond() , 50 , 250); 

							drawfill( g , 1,  150, 250);
							//drawfill( g , 2,  250, 250);
							g.drawLine(200, 230, 240, 230);
							g.drawLine(340, 230, 300, 230);
							



 
					 }
					
						  if (k==2) {
						  g.drawString(verfierTheSedond() ,150, 350);
							drawfill( g , 1, 230 , 325);
							drawfill( g , 1, 330 , 325);
						  g.drawLine(140, 230, 90, 230);

						  }
						  
						  

						  if (k==3) {
						  g.drawString(verfierTheSedond() ,250, 350);
						  g.drawLine(170, 260, 170, 305);
						  g.drawLine(270, 260, 270, 305);


					 }
						 
					 
						  if (k==4) {
						

							  g.drawString(verfierTheSedond() ,350, 150);
							  drawfill( g , 1, 430 , 180);
							  g.drawLine(370, 160, 370, 200);
							 

						  }
						  
						 
						  
						  if (k==5) {
				
							  g.drawString(verfierTheSedond() ,150, 150);
							  drawfill( g , 1, 230 , 180);
							  g.drawLine(170, 160, 170, 200);
				

						  }
						  
						  
						  
						  if (k==6) {
							  

							  g.drawString(verfierTheSedond() ,250, 150);
							  drawfill( g , 1, 330 , 180);
							  g.drawLine(270, 160, 270, 200);


						  }
						  
						
						  if (k==7) {
							  g.drawString(verfierTheSedond() ,350, 350);
								drawfill( g , 1, 430 , 325);
								 g.drawLine(370, 260, 370, 300);
								  g.drawString(verfierTheSedond() ,443, 250);
								  drawfill( g , 1, 503 , 250);
									 g.drawLine(400, 230, 440, 230);

								  

						  }
						  
						  
					
						 
						  
						  
						  
						  
					 }
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
			
						
					}
					}
					
					
				

						
						
				 
			 
				 
			 
			 
			 
				
		
				 
			 
		 
		 
		 
		 
                                        /**
                                         * c'est la methode qui fait le dessin des electron de la couche exterieur d'un element 
                                         * @param g objet de la classe Graphic
                                         * @param k parametre a donner quand on fait l'appel de la fonction 
                                         * @param xcenter le centre de x pour dessiner le cercle 
                                         * @param ycenter le centre y pour dessiner le cercle 
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
                 * cette methode verifie si element2 le 2eme Element d'un melecule existe dans le tableau ou non si il existe il envoie le nombre de electron de ce element  
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
                 * cette methode verefie celui qui a le plus grand nombre des electrons de couche exterieur entre 2 element et elle retourne son  symbole   
                 * @return symbole d'un element 
                 */
		public String verfierTheFirst () {
			int x = monoatomique(verifierFirstElement());
		
			int y =  monoatomique(verifierSecondElement ());
		
		
			if (x<y) {
			return element2;
			}
			else {
			return element1;
			}
			
		}	
                /**
                 * cette methode verefie celui qui a le plus petit nombre des electrons de couche exterieur entre 2 element et elle retourne son  symbole   
                 * @return symbole d'un element 
                 */
			public String verfierTheSedond () {
				int x = monoatomique(verifierFirstElement());
			
				int y =  monoatomique(verifierSecondElement ());
			
			
				if (x>y) {
				return element2;
				}
				else {
				return element1;
				}
		

		}
	 
	 
	 
	 
	 
	 
	 
	 
	























}