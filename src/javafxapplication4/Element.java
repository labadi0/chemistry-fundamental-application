/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

/**
 * classe Element c'est la classe qui  contient les caractéristique de base d'un element  
 *
 * @author TAREK
 */
public class Element {

	
	
// la masse du neutron et proton est en KG !!!!
private final static double neutronMass= 1.675*Math.pow(10, -27);
private final static double protonMass= 1.673*Math.pow(10, -27);

private String name;
private int nbProton_p;        // numero atomique "z" 
private int nbNeutron_n;       
private int nbElectron_e;
private int nbMass_A ;     // cest le nombre de masse  "A=z+n"
private double massOfElemnt_m ;   // masse de la Element       				" g"
private double massMolaire_M;     // Masse molaire de Element             "g/mol" 
private double VolumeMolaire_Vm;  // volume molaire de Element  "cm^3/mol"
private double quantite_matiere_n;   // n en                  "mol"
private String symbole;
private String groupe;
private int periode ;
private String family ;
/**
 * 
 * @param name : nom de element 
 * @param nbProton_p nombre proton 
 * @param nbNeutron_n nombre neutron 
 * @param nbElectron_e nombre electron 
 * @param nbMass_A nombre de masse 
 * @param massOfElemnt_m masse d'un element 
 * @param massMolaire_M masse molaire
 * @param volumeMolaire_Vm volume molaire 
 * @param quantite_matiere_n quantite de la matiére 
 * @param symbole symbole de element
 * @param groupe groupe de element 
 * @param periode pariode de element 
 * @param family  famille de element 
 */
public Element(String name,int nbProton_p, int nbNeutron_n, int nbElectron_e, int nbMass_A, double massOfElemnt_m,double massMolaire_M, double volumeMolaire_Vm, double quantite_matiere_n,String symbole,String groupe,int periode,String family) {
	this.name = name;
	this.nbProton_p = nbProton_p;
	this.nbNeutron_n = nbNeutron_n;
	this.nbElectron_e = nbElectron_e;
	this.nbMass_A = nbMass_A;
	this.massOfElemnt_m = massOfElemnt_m;
	this.massMolaire_M = massMolaire_M;
	this.VolumeMolaire_Vm = volumeMolaire_Vm;
	this.quantite_matiere_n = quantite_matiere_n;
	this.symbole=symbole;
	this.groupe=groupe;
	this.periode=periode;
	this.family=family ;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}




public String getFamily() {
	return family;
}
public void setFamily(String family) {
	this.family = family;
}
public int getNbProton_p() {
	return nbProton_p;
}
public void setNbProton_p(int nbProton_p) {
	this.nbProton_p = nbProton_p;
}
public int getNbNeutron_n() {
	return nbNeutron_n;
}
public void setNbNeutron_n(int nbNeutron_n) {
	this.nbNeutron_n = nbNeutron_n  ;
}
public int getNbElectron_e() {
	return nbElectron_e;
}
public void setNbElectron_e(int nbElectron_e) {
	this.nbElectron_e = nbElectron_e;
}
public int getnbMass_A() {
	return nbMass_A;
}
public void setnbMass_A(int nbMass_A) {
	this.nbMass_A = nbMass_A;
}
public double getMassOfElemnt_m() {
	return massOfElemnt_m;
}
public void setMassOfElemnt_m(double massOfElemnt_m) {
	this.massOfElemnt_m = massOfElemnt_m;
}
public double getMassMolaire_M() {
	return massMolaire_M;
}
public void setMassMolaire_M(double massMolaire_M) {
	this.massMolaire_M = massMolaire_M;
}
public double getVolumeMolaire_Vm() {
	return VolumeMolaire_Vm;
}
public void setVolumeMolaire_Vm(double volumeMolaire_Vm) {
	VolumeMolaire_Vm = volumeMolaire_Vm;
}
public double getquantite_matiere_n() {
	return quantite_matiere_n;
}
public void setquantite_matiere_n(double quantite_matiere_n) {
	this.quantite_matiere_n = quantite_matiere_n;
}
public String getSymbole() {
	return symbole;
}
public void setSymbole(String symbole) {
	this.symbole = symbole;
}
public String getGroupe() {
	return groupe;
}
public void setGroupe(String groupe) {
	this.groupe = groupe;
}
public int getPeriode() {
	return periode;
}
public void setPeriode(int periode) {
	this.periode = periode;
}
public static double getNeutronmass() {
	return neutronMass;
}
public static double getProtonmass() {

	return protonMass;
}
@Override
public String toString() {
	return "Element [nbProton_p=" + nbProton_p + ", nbNeutron_n=" + nbNeutron_n + ", nbElectron_e=" + nbElectron_e
			+ ", nbMass_A=" + nbMass_A + ", massOfElemnt_m=" + massOfElemnt_m + ", massMolaire_M=" + massMolaire_M
			+ ", VolumeMolaire_Vm=" + VolumeMolaire_Vm + ", quantite_matiere_n=" + quantite_matiere_n + ", symbole="
			+ symbole + ", groupe=" + groupe + ", periode=" + periode + ", family=" + family + "]";
}




















}


