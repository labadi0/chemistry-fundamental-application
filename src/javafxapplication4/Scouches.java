/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

/**
 *Classe permet d'extraire la configuration electronique de chaque element .
 * @author Soufiane
 */




public class Scouches {

private int n, s1, s2, p2, s3, p3, s4, d3, p4, s5, d4, p5, s6, f4, d5, p6, s7, f5, d6, p7;

public Scouches(int n, int s1, int s2, int p2, int s3, int p3, int s4, int d3, int p4, int s5, int d4, int p5, int s6,
		int f4, int d5, int p6, int s7, int f5, int d6, int p7) {
	super();
	this.n = n;
	this.s1 = s1;
	this.s2 = s2;
	this.p2 = p2;
	this.s3 = s3;
	this.p3 = p3;
	this.s4 = s4;
	this.d3 = d3;
	this.p4 = p4;
	this.s5 = s5;
	this.d4 = d4;
	this.p5 = p5;
	this.s6 = s6;
	this.f4 = f4;
	this.d5 = d5;
	this.p6 = p6;
	this.s7 = s7;
	this.f5 = f5;
	this.d6 = d6;
	this.p7 = p7;
}

public int getN() {
	return n;
}

public void setN(int n) {
	this.n = n;
}

public int getS1() {
	return s1;
}

public void setS1(int s1) {
	this.s1 = s1;
}

public int getS2() {
	return s2;
}

public void setS2(int s2) {
	this.s2 = s2;
}

public int getP2() {
	return p2;
}

public void setP2(int p2) {
	this.p2 = p2;
}

public int getS3() {
	return s3;
}

public void setS3(int s3) {
	this.s3 = s3;
}

public int getP3() {
	return p3;
}

public void setP3(int p3) {
	this.p3 = p3;
}

public int getS4() {
	return s4;
}

public void setS4(int s4) {
	this.s4 = s4;
}

public int getD3() {
	return d3;
}

public void setD3(int d3) {
	this.d3 = d3;
}

public int getP4() {
	return p4;
}

public void setP4(int p4) {
	this.p4 = p4;
}

public int getS5() {
	return s5;
}

public void setS5(int s5) {
	this.s5 = s5;
}

public int getD4() {
	return d4;
}

public void setD4(int d4) {
	this.d4 = d4;
}

public int getP5() {
	return p5;
}

public void setP5(int p5) {
	this.p5 = p5;
}

public int getS6() {
	return s6;
}

public void setS6(int s6) {
	this.s6 = s6;
}

public int getF4() {
	return f4;
}

public void setF4(int f4) {
	this.f4 = f4;
}

public int getD5() {
	return d5;
}

public void setD5(int d5) {
	this.d5 = d5;
}

public int getP6() {
	return p6;
}

public void setP6(int p6) {
	this.p6 = p6;
}

public int getS7() {
	return s7;
}

public void setS7(int s7) {
	this.s7 = s7;
}

public int getF5() {
	return f5;
}

public void setF5(int f5) {
	this.f5 = f5;
}

public int getD6() {
	return d6;
}

public void setD6(int d6) {
	this.d6 = d6;
}

public int getP7() {
	return p7;
}

public void setP7(int p7) {
	this.p7 = p7;
}
/**
 * methode permet de calculer la configuration electronique d'un element 
 * @param x atome objet de la classe Element
 * @return string 
 */
public String calculCouches(Element x) {
	
	int z =x.getNbElectron_e();
	if (z<=2)
        s1=z;
       else if (z>2)
             s1=2;
       if (z<=4 && z>=2)
        s2=z-2;
       else if (z<=2)
        s2=0;
       else
        if (z>4)
             s2=2;
       if (z<=10 && z>=4)
             p2=(z-4);
       else if (z<4)
             p2=0;
       else
             if (z>10)
             p2=6 ;
       if (z<=12 && z>=10)
             s3=z-10;
       else if (z<10)
             s3=0;
       else
             if (z>12)
             s3=2;
       if (z<=18 && z>=12)
             p3=z-12;
       else if (z<12)
             p3=0;
       else
             if (z>18)
             p3=6;
       if (z<=20 && z>=18)
             s4=z-18;
       else if (z<18)
              s4=0;
       else
             if(z>20)
             s4=2;
       if (z<=30 && z>=20)
             d3=z-20;
       else if (z<20)
             d3=0;
       else
             if (z>30)
             d3=10;
       if (z<=36 && z>=30)
             p4=z-30;
       else if (z<30)
             p4=0;
       else
             if(z>36)
             p4=6;
       if (z<=38 && z>=36)
             s5=z-36;
       else if (z<36)
             s5=0;
       else
             if(z>38)
             s5=2;
       if (z<=48 && z>=38)
             d4=z-38;
       else if (z<38)
             d4=0;
       else
             d4=10;
       if (z<=54 && z>=48)
             p5=z-48;
       else if (z<48)
             p5=0;
       else
             if (z>54)
             p5=6;
       if (z<=56 && z>=54)
             s6=z-54;
       else if (z<54)
             s6=0;
       else
             if (z>56)
             s6=2;
       if (z<=70 &&  z>=56)
             f4=z-56;
       else if (z<56)
             f4=0;
       else
             if(z>70)
             f4=14;
       if (z<=80 && z>=70)
             d5=z-70;
       else if (z<70)
             d5=0;
       else
             if (z>80)
             d5=10;
       if (z<=86 && z>=80)
             p6=z-80;
       else if (z<80)
             p6=0;
       else
             p6=6;
       if (z<=88 && z>=86)
             s7=z-86;
       else if (z<86)
             s7=0;
       else
             if(z>88)
             s7=2;
       if(z<=102 && z>=88)
             f5=z-88;
       else if (z<88)
             f5=0;
       else
             if (z>102)
             f5=14;
       if (z<=112 && z>=102)
             d6=z-102;
       else if (z<102)
             d6=0;
       else
              if(z>112)
              d6=10;
       if (z<=118 && z>=112)
             p7=z-112;
       else if (z<112)
             p7=0;
       else
             if (z>118)
             p7=6;
      
	return 
			
			"les sous couches de l'atome "+x.getSymbole()+" : (1s):"+s1+"(2s):"+s2+"(2p):"+p2+"(3s):"+"\n"+s3+
			 "(3p):"+p3+"(4s):"+s4+"(3d):"+d3+"(4p):"+p4+"(5s):"+s5+"(4d):"+"\n"+
			d4+"(5p):"+p5+"(6s):"+s6+"(4f):"+f4+"(5d):"+d5+"(6p):"+p6+"(7s):"
			+s7+"(5f):"+f5+"(6d):"+d6+"(7p):"+p7+".";
	
}

}
