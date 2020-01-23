/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

/**
 * c'est la classe qui contient les caracterestique de base d'un molecule 
 * @author TAREK
 */

public class Molecule {
    
    
    private String molecule;

    private String element1 = "";
private String element2 = "";
private String element3 = "";
private int indice1	= 1;
private int indice2 = 1;
private int indice3 = 1;





public Molecule(String molecule ) {

this.molecule = molecule;

}

public String getElement1() {
return element1;
}



public String   setElement1(String x) {
element1 = x;
return x;
}



public String getElement2() {
return element2;
}



public String setElement2(String x) {
element2 = x;
    return x;

}



public String getElement3() {
return element3;
}



public String setElement3(String x) {
element3 = x;
    return x;
    
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



public int getIndice3() {
return indice3;
}



public void setIndice3(int indice3) {
this.indice3 = indice3;
}



public String getMolecule() {
return molecule;
}

public void setMolecule(String molecule) {
this.molecule = molecule;
}


/**
 * dans cette methode on tranfrome quelque string en Integer 
 */
public void setAll(){

String m = molecule;

for (int i = 0;i<m.length();i++){
    
String letter = Character.toString(m.charAt(i));  
            if (i==0) {
              element1 =  setElement1(letter);
	}
	else if (i==1) {
		indice1 = Integer.parseInt(letter);
	}
	else if (i==2) {
	
	 element2 =	setElement2(letter);
	}
	else if (i==3) {
		indice2 = Integer.parseInt(letter);
	}
	else if (i==4) {
	element3 = setElement3(letter);
		
	}
	else if (i==5) {
		indice3 = Integer.parseInt(letter);
   
            }
}

}






}

