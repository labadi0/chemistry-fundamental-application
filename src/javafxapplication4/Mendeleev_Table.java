/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;


import java.util.ArrayList;
/**
 * c'est la classe qui contient tous les elements du tableau de Mendeleev
 */

public class Mendeleev_Table {
	private final static double neutronMass= 1.675*Math.pow(10, -27);
	private final static double protonMass= 1.673*Math.pow(10, -27);



private ArrayList<Element> elements;
//Element h = new Element(1, 0, 1, 1, massOfElemnt_m, 1.0079, 13.26, quantit�_matiere_n);
//Element h1 = new Element(nbProton_p, nbNeutron_n, nbElectron_e, nbMass_A, massOfElemnt_m, massMolaire_M, volumeMolaire_Vm, quantit�_matiere_n)

//periode 1
Element H = new Element("hydrogene",1, 0, 1, 1, get_calculMassOfElemnt_m(1, 0), 1.0079, 13.26, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(1, 0),1.0079),"H","1A",1,"non-meteaux");
Element He = new Element("helium",2, 2, 2, 4, get_calculMassOfElemnt_m(2,2), 4.0026, 32.07,get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(2,2),32.07),"He","8B",1,"gazes rares" );
//periode 2
Element lithium_Li = new Element("lithium",3, 4, 3, 3+4, get_calculMassOfElemnt_m(3, 4), 6.941, 13 , get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(3, 4), 6.941),"Li","1A",2,"metaux alcalnis");
Element beryllium_Be = new Element("beryllium",4, 5, 4, 4+5, get_calculMassOfElemnt_m(4, 5), 9.0121, 4.88, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(4, 5), 9.0121),"Be","2A",2,"metaux alcalino terreux");
Element bore_B =  new Element("bore",5, 6, 5, 5+6, get_calculMassOfElemnt_m(5, 6), 10.811, 4.62 , get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(5, 6), 10.811),"B","3B",2,"semi metaux");
Element carbone_C = new Element("carbone",6, 6, 6, 6+6, get_calculMassOfElemnt_m(6, 6), 12.0107,3.42, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(6, 6), 12.0107),"C","4B",2,"non metaux");
Element azote_N = new Element("azote",7, 7, 7, 7+7, get_calculMassOfElemnt_m(7, 7), 14.0067, 13.65, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(7, 7), 14.0067),"N","5B",2,"non metaux");
Element oxygene_O = new Element("oxygene",8, 8, 8, 8+8, get_calculMassOfElemnt_m(8, 8), 15.9994, 8  , get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(8, 8), 15.9994),"O","6B",2,"non metaux");	
Element fluor_F = new Element("fluor",9, 10, 9, 9+10, get_calculMassOfElemnt_m(9, 10), 18.9984, 18.05, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(9, 10), 18.9984),"F","7B",2,"halogenes"); 
Element neon_Ne = new Element("neon",10, 10, 10, 10+10, get_calculMassOfElemnt_m(10, 10), 20.1797, 13.97, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(10, 10), 20.1797),"Ne","8B",2,"gaz rares");
//periode 3
Element sodium_Na = new Element("sodium",11, 12, 11, 11+12, get_calculMassOfElemnt_m(11, 12), 22.9897, 23.68, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(11, 12), 22.9897),"Na","1A",3,"metaux alcalnis");
Element magnesium_Mg = new Element("magnesium",12, 12, 12, 12+12, get_calculMassOfElemnt_m(12, 12), 24.3050, 13.98, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(12, 12), 24.3050),"Mg","2A",3,"metaux alcalino terreux");
Element aliminium_Al = new Element("aliminium",13, 14, 13, 13+14, get_calculMassOfElemnt_m(13, 14), 26.9815, 10 , get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(13, 14), 26.9815),"Al","3B",3,"metaux de post de transition");
Element silicium_Si = new Element("silicium",14, 14, 14, 14+14, get_calculMassOfElemnt_m(14, 14), 28.0855, 12.06, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(14, 14), 28.0855),"Si","4B",3,"semi metaux");
Element phosphore_P = new Element("phosphore",15, 16, 15, 15+16, get_calculMassOfElemnt_m(15, 16), 30.9737, 17.02, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(15, 16), 30.9737),"P","5B",3,"non metaux");
Element soufre_S= new Element("soufre",16, 16, 16, 16+16, get_calculMassOfElemnt_m(16, 16), 32.065, 15.49, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(16, 16), 32.065),"S","6B",3,"non metaux");
Element chlore_Cl = new Element("chlore",17, 18, 17, 17+18, get_calculMassOfElemnt_m(17, 18), 35.453, 17.46, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(17, 18), 35.453),"Cl","7B",3,"halogenes");
Element argon_Ar = new Element("argon",18, 22, 18, 18+22, get_calculMassOfElemnt_m(18, 22), 39.948, 24.12, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(18, 22), 39.948),"Ar","8B",3,"gazes rares");
//periode 4
Element potassium_K = new Element("potassium",19, 20, 19, 19+20, get_calculMassOfElemnt_m(19, 20), 39.0983, 45.36, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(19, 20), 39.0983),"K","1A",4,"metaux alcalnis");
Element calcium_Ca = new Element("calcium",20, 20, 20, 20+20, get_calculMassOfElemnt_m(20, 20), 40.078, 25.86, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(20, 20), 40.078),"Ca","2B",4,"metaux alcalino terreux");
Element scandium_Sc = new Element("scandium",21, 24, 21, 21+24, get_calculMassOfElemnt_m(21, 24), 44.9559, 15.04, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(21, 24), 44.9559),"Sc","3A",4,"metaux de transition");
Element titane_Ti = new Element("titane",22, 26, 22, 22+26, get_calculMassOfElemnt_m(22, 26), 47.867, 10.55, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(22, 26), 47.867),"Ti","4A",4,"metaux de transition");
Element vanadium_V = new Element("vanadium",23, 28, 23, 23+28, get_calculMassOfElemnt_m(23, 28), 50.9415, 8.34 , get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(23, 28), 50.9415),"V","5A",4,"metaux de transition");
Element chrome_Cr = new Element("chrome",24, 28, 24, 24+28, get_calculMassOfElemnt_m(24, 28), 51.9961, 7.23, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(24, 28), 51.9961),"Cr","6A",4,"metaux de transition");
Element manganese_Mn =new Element("manganese",25, 30, 25, 25+30, get_calculMassOfElemnt_m(25, 30), 54.9380, 7.38, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(25, 20), 54.9380),"Mn","7A",4,"metaux de transition");
Element fer_Fe= new Element("fer",26, 30, 26, 26+30, get_calculMassOfElemnt_m(26, 30), 55.845, 7.09, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(26, 30), 55.845),"Fe","8A",4,"metaux de transition");
Element cobalt_Co =new Element("cobalt",27, 32, 27, 27+32, get_calculMassOfElemnt_m(27, 32), 58.9331, 6.62, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(27, 32), 58.9331),"Co","8A",4,"metaux de transition");
Element nickel_Ni =new Element("nickel",28, 31, 28, 28+31, get_calculMassOfElemnt_m(28, 31), 58.6934, 6.59, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(28, 31), 58.6934),"Ni","8A",4,"metaux de transition");
Element cuivre_Cu =new Element("cuivre",29, 35, 29, 29+35, get_calculMassOfElemnt_m(29, 35), 63.546, 7.09, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(29, 35), 63.546),"Cu","1B",4,"metaux de transition");
Element zinc_Zn =new Element("zinc",30, 35, 30, 30+35, get_calculMassOfElemnt_m(30, 35), 65.409, 9.17, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(30, 35), 65.409),"Zn","2B",4,"metaux de transition");
Element gallium_Ga = new Element("gallium",31, 39, 31, 31+39, get_calculMassOfElemnt_m(31, 39), 69.723, 11.81, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(31, 39), 69.723),"Ga","3B",4,"metaux de post de transition");
Element germanium_Ge = new Element("germanium",32, 41, 32, 32+41, get_calculMassOfElemnt_m(32, 41), 72.64, 13.64 , get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(32, 41), 72.64),"Ge","4B",4,"semi metaux");
Element arsenic_As = new Element("arsenic",33, 42, 33, 33+42, get_calculMassOfElemnt_m(33, 42), 74.9216, 12.95, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(33, 42), 74.9216),"As","5B",4,"semi metaux");
Element selenium_Se = new Element("selenium",34, 45, 34, 34+45, get_calculMassOfElemnt_m(34, 45), 78.96, 16.48, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(34, 45), 78.96),"Se","6B",4,"non metaux");
Element brome_Br = new Element("brome",35, 45, 35, 35+45, get_calculMassOfElemnt_m(35, 45), 79.904, 19.73, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(35, 45), 79.904),"Br","7B",4,"halogenes");
Element krypton_Kr = new Element("krypton",36, 48, 36, 36+48, get_calculMassOfElemnt_m(36, 48), 83.798, 29.68, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(36, 48), 83.798),"Kr","8B",4,"gazes rares");
//periode 5 
Element rubidium_Rb = new Element("rubidium",37, 48, 37, 37+48, get_calculMassOfElemnt_m(37, 48), 85.467, 55.79, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(37, 48), 85.467),"Rb","1A",5,"metaux alcalnis");
Element strontium_Sr = new Element("strontium",38, 50, 38, 38+50, get_calculMassOfElemnt_m(38, 50), 87.62, 34.5, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(38, 50), 87.62),"Sr","2A",5,"metaux alcalino terreux");
Element yttrium_Y = new Element("yttrium",39, 50, 39, 39+50, get_calculMassOfElemnt_m(39, 50), 88.905, 19.89, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(39, 50), 88.905),"Y","3A",5,"metaux de transition");
Element zirconium_Zr = new Element("zirconium",40, 51, 40, 40+51, get_calculMassOfElemnt_m(40, 51), 91.224, 14.02, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(40, 51), 91.224),"Zr","4A",5,"metaux de transition");
Element niobium_Nb = new Element("niobium",41, 52, 41, 41+52, get_calculMassOfElemnt_m(41, 52), 92.906, 10.84 , get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(41, 52), 92.906),"Nb","5A",5,"metaux de transition");
Element molybdene_Mo = new Element("molybdene",42, 54, 42, 42+54, get_calculMassOfElemnt_m(42, 54), 95.94, 9.39, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(42, 54), 95.94),"Mo","6A",5,"metaux de transition");
Element techenetium_Tc =new Element("techenetium",43, 55, 43, 43+55, get_calculMassOfElemnt_m(43, 55), 98.906, 8.6 , get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(43, 55), 98.906),"Tc","7A",5,"metaux de transition");
Element ruthenium_Ru= new Element("ruthenium",44, 58, 44, 44+58, get_calculMassOfElemnt_m(44, 58), 101.07, 8.14, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(44, 58), 101.07),"Ru","8A",5,"metaux de transition");
Element rhodium_Rh =new Element("rhodium",45, 57, 45, 45+57, get_calculMassOfElemnt_m(45, 57), 102.905,8.29 , get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(45, 57), 102.905),"Rh","8A",5,"metaux de transition");
Element palladium_pd =new Element("palladium",46, 60, 46, 46+60, get_calculMassOfElemnt_m(46, 60), 106.42, 8.85, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(46, 60), 106.42),"Pd","8A",5,"metaux de transition");
Element argent_Ag =new Element("argent",47, 61, 47, 47+61, get_calculMassOfElemnt_m(47, 61), 107.868, 10.27, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(47, 61), 107.868),"Ag","1B",5,"metaux de transition");
Element cadmium_Cd =new Element("cadmium",48, 64, 48, 48+64, get_calculMassOfElemnt_m(48, 64), 112.411, 13, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(48, 64), 112.411),"Cd","2B",5,"metaux de transition");
Element indium_In = new Element("indium",49, 66, 49, 49+66, get_calculMassOfElemnt_m(49, 66), 114.818, 15.71, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(49, 66), 114.818),"In","3B",5,"metaux de post de transition");
Element etain_Sn = new Element("etain",50, 69, 50, 50+69, get_calculMassOfElemnt_m(50, 69), 118.710, 16.24 , get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(50, 69), 118.710),"Sn","4B",5,"metaux de post de transition");
Element antimoine_Sb = new Element("antimoine",51, 71, 51, 51+71, get_calculMassOfElemnt_m(51, 71), 121.760, 18.2, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(51, 71), 121.760),"Sb","5B",5,"semi metaux");
Element tellure_Te = new Element("tellure",52, 75, 52, 52+75, get_calculMassOfElemnt_m(52, 75), 127.60, 20.45, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(52, 75), 127.60),"Te","6B",5,"semi metaux");
Element Iode_I = new Element("Iode",53, 74, 53, 53+74, get_calculMassOfElemnt_m(53, 74), 126.904, 25.74, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(53, 74), 126.904),"I","7B",5,"halogenes");
Element xenon_Xe = new Element("xenon",54, 77, 54, 54+77, get_calculMassOfElemnt_m(54, 77), 131.293, 37.09, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(54, 77), 131.293),"Xe","8B",5,"gazes rares");
//periode 6
Element cesium_Cs = new Element("cesium",55, 78, 55, 55+78, get_calculMassOfElemnt_m(55, 78), 132.905, 70.96, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(55, 78), 132.905),"Cs","1A",6,"metaux alcalnis");
Element baryum_Ba = new Element("baryum",56, 81, 56, 56+81, get_calculMassOfElemnt_m(56, 81), 137.327, 38.21, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(56, 81), 137.327),"Ba","2A",6,"metaux alcalino terreux");
//hors
Element lanthane_La = new Element("lanthane",57, 82, 57, 57+82, get_calculMassOfElemnt_m(57, 82), 138.905, 22.6 , get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(57, 82), 138.905),"La","3A",6,"lanthanides");
Element cerium_Ce = new Element("cerium",58, 82, 58, 58+82, get_calculMassOfElemnt_m(58, 82), 140.116, 17, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(58, 82), 140.116),"Ce","3A",6,"lanthanides");
Element praseodyme_Pr = new Element("praseodyme",59, 82, 59, 59+82, get_calculMassOfElemnt_m(59, 82), 140.904, 20.8 , get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(59, 82), 140.904),"Pr","Pr",6,"lanthanides");
Element neodyme_Nd = new Element("neodyme",60, 84, 60, 60+84, get_calculMassOfElemnt_m(60, 84), 144.242, 20.59, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(60, 84), 144.242),"Nd","3A",6,"lanthanides");
Element promethium_Pm =new Element("promethium",61, 85, 61, 61+85, get_calculMassOfElemnt_m(61, 85), 146.915, 20.1 , get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(61, 85), 146.915),"Pm","3A",6,"lanthanides");
Element samarium_Sm= new Element("samarium",62, 88, 62, 62+88, get_calculMassOfElemnt_m(62, 88), 150.36, 20, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(62, 88), 150.36),"Sm","3A",6,"lanthanides");
Element europium_Eu =new Element("europium",63, 89, 63, 63+89, get_calculMassOfElemnt_m(63, 89), 151.964,28.98 , get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(63, 89), 151.964),"Eu","3A",6,"lanthanides");
Element gadolinium_Gd =new Element("gadolinium",64, 93, 64, 64+93, get_calculMassOfElemnt_m(64, 93), 157.25, 19.9, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(64, 93), 157.25),"Gd","3A",6,"lanthanides");
Element terbium_Tb =new Element("terbium",65, 93, 65, 65+93, get_calculMassOfElemnt_m(65, 93), 158.925, 19.31, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(65, 93), 158.925),"Tb","3A",6,"lanthanides");
Element dysprosium_Dy =new Element("dysprosium",66, 96, 66, 66+96, get_calculMassOfElemnt_m(66, 96), 162.500, 19, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(66, 96), 162.500),"Dy","3A",6,"lanthanides");
Element holmium_Ho = new Element("holmium",67, 97, 67, 67+97, get_calculMassOfElemnt_m(67, 97), 164.93, 18.75, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(67, 97), 164.93),"Ho","3A",6,"lanthanides");
Element erbium_Er = new Element("erbium",68, 99, 68, 68+99, get_calculMassOfElemnt_m(68, 99), 167.259, 18.44 , get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(68, 99), 167.259),"Er","3A",6,"lanthanides");
Element thulium_Tm = new Element("thulium",69, 99, 69, 69+99, get_calculMassOfElemnt_m(69, 99), 168.934, 18.12, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(69, 99), 168.934),"Tm","3A",6,"lanthanides");
Element ytterbium_Yb = new Element("ytterbium",70, 103, 70, 70+103, get_calculMassOfElemnt_m(70, 103), 173.04, 24.84, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(70, 103), 173.04),"Yb","3A",6,"lanthanides");
Element lutecium_Lu = new Element("lutecium",71, 103, 71, 71+103, get_calculMassOfElemnt_m(71, 103), 174.967, 17.78, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(71, 103), 174.967),"Lu","3A",6,"lanthanides");
//fin de hors
Element hafnium_Hf = new Element("hafnium",72, 107, 72, 72+107, get_calculMassOfElemnt_m(72, 107), 178.49, 13.41, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(72, 107), 178.49),"Hf","4A",6,"metaux de transition");
Element tantale_Ta = new Element("tantale",73, 108, 73, 73+108, get_calculMassOfElemnt_m(73, 108), 180.947, 10.87, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(73, 108), 180.947),"Ta","5A",6,"metaux de transition");
Element tugstene_W = new Element("tugstene",74, 109, 74, 74+109, get_calculMassOfElemnt_m(74, 109), 183.84, 9.53, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(74, 109), 183.84),"W","6A",6,"metaux de transition");
Element rhenium_Re = new Element("rhenium",75, 111, 75, 75+111, get_calculMassOfElemnt_m(75, 111), 186.207, 8.86, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(75, 111), 186.207),"Re","7A",6,"metaux de transition");
Element osmium_Os = new Element("osmium",76, 115, 76, 76+115, get_calculMassOfElemnt_m(76, 115), 190.23, 8.43, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(76, 115), 190.23),"Os","8A",6,"metaux de transition");
Element iridium_Ir = new Element("iridium",77, 115, 77, 77+115, get_calculMassOfElemnt_m(77, 115), 192.217, 8.57, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(77, 115), 192.217),"Ir","8A",6,"metaux de transition");
Element platine_Pt = new Element("platine",78, 117, 78, 78+117, get_calculMassOfElemnt_m(78, 117), 195.084, 9.1, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(78, 117), 195.084),"Pt","8A",6,"metaux de transition");
Element or_Au = new Element("or",79, 118, 79, 79+118, get_calculMassOfElemnt_m(79, 118), 196.966, 10.19, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(79, 118), 196.966),"Au","1B",6,"metaux de transition");
Element mercure_Hg = new Element("mercure",80, 120, 80, 80+120, get_calculMassOfElemnt_m(80, 120), 200.59, 14.81, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(80, 120), 200.59),"Hg","2B",6,"metaux de transition");
Element thallium_Ti = new Element("thallium",81, 123, 81, 81+123, get_calculMassOfElemnt_m(81, 123), 204.383, 17.24, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(81, 123), 204.383),"Tl","3B",6,"metaux de post de transition");
Element plomb_pb = new Element("plomb",82, 125, 82, 82+125, get_calculMassOfElemnt_m(82, 125), 207.2, 18.26, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(82, 125), 207.2),"Pb","4B",6,"metaux de post de transition");
Element bismuth_Bi = new Element("bismuth",83, 125, 83, 83+125, get_calculMassOfElemnt_m(83, 125), 208.9804, 21.44, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(83, 125), 208.9804),"Bi","5B",6,"metaux de post de transition");
Element polonium_Po = new Element("polonium",84, 126, 84, 84+126, get_calculMassOfElemnt_m(84, 126), 208.9824, 22.4 , get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(84, 126), 208.9824),"Po","6B",6,"semi metaux");
Element astate_At = new Element("astate",85, 125, 85, 85+125, get_calculMassOfElemnt_m(85, 125), 209.9871, 23.55, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(85, 125), 209.9871),"At","7B",6,"halogenes");
Element radon_Rn = new Element("radon",86, 136, 86, 86+136, get_calculMassOfElemnt_m(86, 136), 222.0176, 50.5, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(85, 125), 209.9871),"Rn","8B",6,"gazes rares");
//periode 7
Element francium_Fr = new Element("francium",87, 136, 87, 87+136, get_calculMassOfElemnt_m(87, 136), 223.0197, 15.64, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(87, 136), 223.0197),"Fr","1A",7,"metaux alcalnis");
Element radium_Ra = new Element("radium",88, 138, 88, 88+138, get_calculMassOfElemnt_m(88, 138), 226.0254, 45.2, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(88, 138), 226.0254),"Ra","2A",7,"metaux alcalino terreux");
//hors
Element actinium_Ac = new Element("actinium",89, 138, 89, 89+138, get_calculMassOfElemnt_m(89, 138), 227.0278, 22.6, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(89, 138), 227.0278),"Ac","3A",7,"actinides");
Element thorium_Th = new Element("thorium",90, 142, 90, 90+142, get_calculMassOfElemnt_m(90, 142), 232.0380, 19.8 , get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(90, 142), 232.0380),"Th","3A",7,"actinides");
Element protactinium_Pa = new Element("protactinium",91, 140, 91, 91+140, get_calculMassOfElemnt_m(91, 140), 231.0358, 15, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(91, 140), 231.0358),"Pa","3A",7,"actinides");
Element uranium_U = new Element("uranium",92, 146, 92, 92+146, get_calculMassOfElemnt_m(92, 146), 238.0289, 12.56, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(92, 146), 238.0289),"U","3A",7,"actinides");
Element neptunium_Np = new Element("neptunium",93, 144, 93, 93+144, get_calculMassOfElemnt_m(93, 144), 237.0482, 11.71, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(93, 144), 237.0482),"Np","3A",7,"actinides");
Element plutonium_Pu = new Element("plutonium",94, 150, 94, 94+150, get_calculMassOfElemnt_m(94, 150), 244.0642, 12.3, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(94, 150), 244.0642),"Pu","3A",7,"actinides");
Element americium_Am = new Element("americium",95, 148, 95, 95+148, get_calculMassOfElemnt_m(95, 148), 243.0614, 17.78, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(95, 148), 243.0614),"Am","3A",7,"actinides");
Element curium_Cm = new Element("curium",96, 151, 96, 96+151, get_calculMassOfElemnt_m(96, 151), 247.0703, 18.6 , get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(96, 151), 247.0703),"Cm","3A",7,"actinides");
Element berkelium_Bk = new Element("berkelium",97, 150, 97, 97+150, get_calculMassOfElemnt_m(97, 150), 247.0703, 16.7 , get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(97, 150), 247.0703),"Bk","3A",7,"actinides");
Element californium_Cf = new Element("californium",98, 153, 98, 98+153, get_calculMassOfElemnt_m(98, 153), 251.0796, 15.46, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(98, 153), 251.0796),"Cf","3A",7,"actinides");
Element einsteinium_Es = new Element("einsteinium",99, 153, 99, 99+153, get_calculMassOfElemnt_m(99, 153), 252.0829, 16.12 , get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(99, 153), 252.0829),"Es","3A",7,"actinides");
Element fermium_Fm = new Element("fermium",100, 157, 100, 100+157, get_calculMassOfElemnt_m(100, 157), 257.0951, 14.26, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(100, 157), 257.0951),"Fm","3A",7,"actinides");
Element mendelevium_Md = new Element("mendelevium",101, 157, 101, 101+157, get_calculMassOfElemnt_m(101, 157), 258.0951, 13.81, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(101, 157), 258.0951),"Md","3A",7,"actinides");

Element nobelium_No = new Element("nobelium",102, 157, 102, 102+157, get_calculMassOfElemnt_m(102, 157), 259.1009, 12.59, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(102, 157), 259.1009),"No","3A",7,"actinides");
Element lawrencium_Lr = new Element("lawrencium",103, 163, 103, 103+163, get_calculMassOfElemnt_m(103, 163), 266.1193, 14.15, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(103, 163), 266.1193),"Lr","3A",7,"actinides");
//hors fin 
Element rutherfordium_Rf = new Element("rutherfordium",104, 157, 104, 104+157, get_calculMassOfElemnt_m(104, 157), 261, 15.54, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(104, 157), 261),"Rf","4A",7,"metaux de transition");
Element dubnium_Lr = new Element("dubnium",105, 157, 105, 105+157, get_calculMassOfElemnt_m(105, 157), 262, 15.81, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(105, 157), 262),"Db","5A",7,"metaux de transition");
Element seaborgium_Sg = new Element("seaborgium",106, 156, 106, 106+156, get_calculMassOfElemnt_m(106, 156), 262, 16.12, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(106, 156), 262),"Sg","6A",7,"metaux de transition");
Element bohrium_Bh = new Element("bohrium",107, 157, 107, 107+157, get_calculMassOfElemnt_m(107, 157), 264, 16.18, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(107, 157), 264),"Bh","7A",7,"metaux de transition");
Element hassium_Hs = new Element("hassium",108, 161, 108, 108+161, get_calculMassOfElemnt_m(108, 161), 269, 16.70, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(108, 161), 269),"Hs","8A",7,"metaux de transition");
Element meitnerium_Mt = new Element("meitnerium",109, 159, 109, 109+159, get_calculMassOfElemnt_m(109, 159), 268, 18.50, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(109, 159), 268),"Mt","8A",7,"metaux de transition");
Element darmstadtium_Ds = new Element("darmstadtium",110, 171, 110, 110+171, get_calculMassOfElemnt_m(110, 171), 281.1620, 17.74, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(110, 171), 281.1620),"Ds","8A",7,"metaux de transition");
Element roentgenium_Rg = new Element("roentgenium",111, 170, 111, 111+170, get_calculMassOfElemnt_m(111, 170), 281.1684, 18.66, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(111, 170), 281.1684),"Rg","1B",7,"metaux de transition");
Element copernicium_Cn = new Element("copernicium",112, 173, 112, 112+173, get_calculMassOfElemnt_m(112, 173), 285.1744, 18.95, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(112, 173), 285.1744),"Cn","2B",7,"metaux de transition");
Element nihonium_Nh = new Element("nihonium",113, 173, 113, 113+173, get_calculMassOfElemnt_m(113, 173), 286.1810, 19.12, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(113, 173), 286.1810),"Nh","3B",7,"metaux de post de transition");
Element flerovium_Fl = new Element("flerovium",114, 173, 114, 114+173, get_calculMassOfElemnt_m(114, 173), 287.1904, 14, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(114, 173), 287.1904),"Fl","4B",7,"metaux de post de transition");
Element moscovium_Mc = new Element("moscovium",115, 173, 115, 115+173, get_calculMassOfElemnt_m(115, 173), 288.1943, 13.66, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(115, 173), 288.1943),"Mc","5B",7,"metaux de post de transition");

Element livermorium_Lv = new Element("livermorium",116, 175, 116, 116+175, get_calculMassOfElemnt_m(116, 175), 291.2045, 12.32, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(116, 175), 291.2045),"Lv","6B",7,"metaux de post de transition");
Element tennesse_Ts = new Element("tennesse",117, 177, 117, 117+177, get_calculMassOfElemnt_m(117, 177), 294.2104, 16.44, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(117, 177), 294.2104),"Ts","7B",7,"halogenes");
Element oganesson_Og = new Element("oganesson",118, 176, 118, 115+176, get_calculMassOfElemnt_m(118, 176), 294.2139, 17.76, get_calculQuantite_matiere_n(get_calculMassOfElemnt_m(118, 176), 294.2139),"Og","8B",7,"gazes rares");
//fin tableau 


/**
 * c'est le constructeur ou on ajoute tous les objects de  la classe Element dans Arraylist
 */

public Mendeleev_Table() {

	elements = new ArrayList<Element>();

		// periode 1
		elements.add(H);
		elements.add(He);
		// periode 2
		elements.add(lithium_Li);
		elements.add(beryllium_Be);
		elements.add(bore_B);
		elements.add(carbone_C);
		elements.add(azote_N);
		elements.add(oxygene_O);
		elements.add(fluor_F);
		elements.add(neon_Ne);
		// periode 3
		elements.add(sodium_Na);
		elements.add(magnesium_Mg);
		elements.add(aliminium_Al);
		elements.add(silicium_Si);
		elements.add(phosphore_P);
		elements.add(soufre_S);
		elements.add(chlore_Cl);
		elements.add(argon_Ar);
		//periode 4
		elements.add(potassium_K);
		elements.add(calcium_Ca);
		elements.add(scandium_Sc);
		elements.add(titane_Ti);
		elements.add(vanadium_V);
		elements.add(chrome_Cr);
		elements.add(manganese_Mn);
		elements.add(fer_Fe);
		elements.add(cobalt_Co);
		elements.add(nickel_Ni);
		elements.add(cuivre_Cu);
		elements.add(zinc_Zn);
		elements.add(gallium_Ga);
		elements.add(germanium_Ge);
		elements.add(arsenic_As);
		elements.add(selenium_Se);
		elements.add(brome_Br);
		elements.add(krypton_Kr);
		// periode 5 
		elements.add(rubidium_Rb);
		elements.add(strontium_Sr);
		elements.add(yttrium_Y);
		elements.add(zirconium_Zr);
		elements.add(niobium_Nb);
		elements.add(molybdene_Mo);
		elements.add(techenetium_Tc);
		elements.add(ruthenium_Ru);
		elements.add(rhodium_Rh);
		elements.add(palladium_pd);
		elements.add(argent_Ag);
		elements.add(cadmium_Cd);
		elements.add(indium_In);
		elements.add(etain_Sn);
		elements.add(antimoine_Sb);
		elements.add(tellure_Te);
		elements.add(Iode_I);
		elements.add(xenon_Xe);
		//  periode 6
		elements.add(cesium_Cs);
		elements.add(baryum_Ba);
		// hors 
		elements.add(lanthane_La);
		elements.add(cerium_Ce);
		elements.add(praseodyme_Pr);
		elements.add(neodyme_Nd);
		elements.add(promethium_Pm);
		elements.add(samarium_Sm);
		elements.add(europium_Eu);
		elements.add(gadolinium_Gd);
		elements.add(terbium_Tb);
		elements.add(dysprosium_Dy);
		elements.add(holmium_Ho);
		elements.add(erbium_Er);
		elements.add(thulium_Tm);
		elements.add(ytterbium_Yb);
		elements.add(lutecium_Lu);
		// hors 
		elements.add(hafnium_Hf);
		elements.add(tantale_Ta);
		elements.add(tugstene_W);
		elements.add(rhenium_Re);
		elements.add(osmium_Os);
		elements.add(iridium_Ir);
		elements.add(platine_Pt);
		elements.add(or_Au);
		elements.add(mercure_Hg);
		elements.add(thallium_Ti);
		elements.add(plomb_pb);
		elements.add(bismuth_Bi);
		elements.add(polonium_Po);
		elements.add(astate_At);
		elements.add(radon_Rn);
		// periode 7
		elements.add(francium_Fr);
		elements.add(radium_Ra);
		elements.add(actinium_Ac);
		elements.add(thorium_Th);
		elements.add(protactinium_Pa);
		elements.add(uranium_U);
		elements.add(neptunium_Np);
		elements.add(plutonium_Pu);
		elements.add(americium_Am);
		elements.add(curium_Cm);
		elements.add(berkelium_Bk);
		elements.add(californium_Cf);
		elements.add(einsteinium_Es);
		elements.add(fermium_Fm);
		elements.add(mendelevium_Md);
		elements.add(nobelium_No);
		elements.add(lawrencium_Lr);
		elements.add(rutherfordium_Rf);
		elements.add(dubnium_Lr);
		elements.add(seaborgium_Sg);
		elements.add(bohrium_Bh);
		elements.add(hassium_Hs);
		elements.add(meitnerium_Mt);
		elements.add(darmstadtium_Ds);
		elements.add(roentgenium_Rg);
		elements.add(copernicium_Cn);
		elements.add(nihonium_Nh);
		elements.add(flerovium_Fl);
		elements.add(moscovium_Mc);
		elements.add(livermorium_Lv);
		elements.add(tennesse_Ts);
		elements.add(oganesson_Og);
			
	//s}
}



/**
 * cette methode retourne le size de ArrayList 
 * @return  string qui contient le size de Arraylist
 */
public String size() {
	return ""+	elements.size() ;		
	}

/**
 * cette methode retourne tous les caractéristiques de chaque element dans le ArrayList 
 * @return String
 */
public String toString () {
	String s = "";
	for (int i=0;i<118;i++) {
		s = s+ elements.get(i).toString()+"\n";
	}
	return s ;
}

/**
 * cette methode retourne le Symbole d'un element dans ArrayList quand on donne le nombre de proton 
 * @param i  : le nombre de proton
 * @return : return le symbole d'un element
 */

public String getSymbo(int i) {
	
	return elements.get(i).getSymbole();
}

/**
 * cette methode retourne object de la classe Element quand on donne le nombre de proton 
 * @param i : le nombre de proton
 * @return : object de la classe Element 
 */

public Element getElements(int i){

return elements.get(i);
}




public ArrayList<Element> getTableau() {
	return elements;
}

/**
 * cette methode statique calcule la masse d'un element quand on donne le nombre de proton et neutron
 * @param nbProton_p : le nombre de proton d'un element dans le ArrayList 
 * @param nb_neutron_n : le nombre de neutron d'un element dans le ArrayList 
 * @return masse d'un element dans le Arraylist
 */

public double  get_calculMassOfElemnt_m(int nbProton_p,int nb_neutron_n) {
	return nbProton_p*protonMass + nb_neutron_n*neutronMass;
}
/**
 * cette methode statique calcule la quantité de matiére  d'un element quand on donne la masse d'un element  et la masse molaire de meme element 
 * @param m : c'est la masse d'un element dans le ArrayList  
 * @param M : c'est la masse molaire d'un element dans le ArrayList 
 * @return : quantité de matiére d'un element dans le ArrayList
 */



public double get_calculQuantite_matiere_n(double m, double M) {
	return m/M;
}


}


