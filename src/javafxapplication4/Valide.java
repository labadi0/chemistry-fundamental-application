/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

/**
 *
 * @author Amadou
 */
public class Valide {
	
	private String molecule;
	private Mendeleev_Table tab = new Mendeleev_Table();
	
	private String element1 = null;
	private String element2 = null;
	private int indice1	= 1;
	private int indice2 = 1;
	
	private boolean double_caractere = false;
	
	public Valide(String m) {
		molecule = new String(m);
		
		int i = 0;
		String caractere2 = null;
		String symbol = null;
		while( i < molecule.length() ) {
			 String caractere1 = String.valueOf( molecule.charAt(i) );
			 if( ! entier(caractere1) ) {
				 if( i < molecule.length() - 1) {
					 caractere2 = String.valueOf( molecule.charAt(i+1) );
				 }
				 
				 if( est_element(caractere1) || caractere2 == null || entier( caractere2) ) {
					 if( est_element( caractere1 ) )
						 if( element1 == null ) {
							 element1 = caractere1;
						 } else {
							 element2 = caractere1;
						 }
					 else 
						 System.out.println( caractere1 + " n'est pas un element" );
				  }
				 
				 else {
					 i++;
					 double_caractere = true;
					 symbol = caractere1 + caractere2; 
					 if( est_element(symbol) )
						 if( element1 == null ) {
							 element1 = symbol;
						 } else {
							 element2 = symbol;
						 }
					 else 
						 System.out.println( symbol + " n'est pass un element" );
				 }
			 }
			 else {
				 
			   if( ! double_caractere ) {
				   String chaine = String.valueOf( molecule.charAt(i) );
					Integer valeur = Integer.valueOf( chaine );
				   if( i > 0 && i <= 1) {
						indice1 = valeur;
						//System.out.println("premier " + indice1 );
					}
					else if( i > 1 && i < 4) {
						indice2 = valeur;
						//System.out.println("2eme " + indice2 );
					}
			   }
			   else {
				   
				   if( i > 0 && i <= 2) {
					   String chaine1  = String.valueOf( molecule.charAt(i) );
					   Integer valeur1 = Integer.valueOf( chaine1 );
					   String chaine2  = String.valueOf( molecule.charAt(i+2) );
					   Integer valeur2 = Integer.valueOf( chaine2 );
					   
						indice1 = valeur1;
						indice2 = valeur2;
						//System.out.println("premier " + indice1 );
						//System.out.println("deuxieme " + indice2 );
					}
					//
				   double_caractere = false;
			   }
			 }
		 i++;
		}
		System.out.println(element1 + " " + indice1 + " " + element2 + " " + indice2);
		
	}
	
        /**
	 * Teste si une molécule est un bonne ou pas
	 * @return vrai si la molécule est conforme
	 */
        
	public boolean molecule() {
		/**
		 * On verifie si c'est une molecule simple
		 */
		if( molecule.length() > 5  ) {
			//System.out.println("taille > 5");
			return false;
		}
		
		else if( molecule.length() == 2 ) {
			//System.out.println("taille == 2");
			if( (element1.equals("H") || element1.equals("N") || element1.equals("O") ||
				element1.equals("I") || element1.equals("Br") || element1.equals("Cl") ) 
				&& indice1 == 2 ) {
				//System.out.println("di");
				return true;
				
			}
			else { 
				return false;
			}
		}
		
		else if( element1 == null || element2 == null) {
			//System.out.println("mauvaise formule");
			return false;
		}
		
		else if( element1.equals("C") && element2.equals("H")) {
			if( indice2 == (2 * indice1) + 2 ) {
				//System.out.println("alcane");
				return true;
			}
			else if( indice2 == 2*indice1 ) {
				//System.out.println("alcène");
				return true;
			}
			else if( indice2 == (2 * indice1) - 2 ) {
				//System.out.println("alcyne");
				return true;
			}
			else {
				//System.out.println(" pas hydrocarbure");
				return false;
			}
		}
		else if( electronegativité(element1,indice1,element2,indice2) )  {
			//System.out.println("electronegative");
			return true;
		}
		return false;
	
	}
        /**
	 * Cette classe verifie l'electronegativité d'une molecule
	 * @param s1 le premier atome de la molécule
	 * @param n1 l'indice du premier atome de la molécule
	 * @param s2 le deuxième atome de la molécule
	 * @param n2 l'indice de la deuxième atme de la molecule
	 * @return renvoi vrai si l'electronegativité est verifié
	 */
        
        
        
	
	public boolean electronegativité(String s1, int n1, String s2, int n2) {
		int indice1 = -1;
		int indice2 = -1;
		Ion ion = new Ion();
		
		for( int k = 0; k < tab.getTableau().size(); k++) {
			if( tab.getTableau().get(k).getSymbole().equals(s1) ) {
				indice1 = k;
			}
			else if( tab.getTableau().get(k).getSymbole().equals(s2)  ){
				indice2 = k;
			}
		}
		
		if( indice1 == -1 || indice2 == -1 ) {
			return false;
		}
		else {
			return ion.monoatomique(indice1) * n1 == - (ion.monoatomique(indice2) * n2);
		}	
	}
        
        /**
	 * Teste si Une chaine est un élément du tableau périodique de Mendeleiev
	 * @param element la chaine réçu en entrée
	 * @return renvoi vrai si la chaine existe dans le tableau de Mendeleiev
	 */
        
	
	public boolean est_element(String element) {		
		for( int k = 0; k < tab.getTableau().size(); k++) {
			if( tab.getTableau().get(k).getSymbole().equals(element) ) {
				return true;
			}
		}
		return false;
	}
	/**
	 * Teste si un caractère est un entier ou une lettre pour distinguer les atomes et leurs indices
	 * @param c le caractère réçu en paramètre
	 * @return renvoi vrai si c'est un entier
	 */
        
	public boolean entier(String c) {
		try {
			Integer.parseInt(c);
			//Character.isLetter(c);
		} catch(Exception e) {
			return false;
		}
		return true;
	}
        
        
        
        public String getMolecule() {
		return molecule;
	}

	public void setMolecule(String molecule) {
		this.molecule = molecule;
	}

	public Mendeleev_Table getTab() {
		return tab;
	}

	public void setTab(Mendeleev_Table tab) {
		this.tab = tab;
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

	public int getIndice1() {
		return indice1;
	}

	public void setIndice1(int indice1) {
		this.indice1 = indice1;
	}

	public int getIndice2() {
		return indice2;
	}

	public void setIndice2(int indice2) {
		this.indice2 = indice2;
	}

	public boolean isDouble_caractere() {
		return double_caractere;
	}

	public void setDouble_caractere(boolean double_caractere) {
		this.double_caractere = double_caractere;
	}








}
