/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import com.jfoenix.controls.JFXButton;
import java.util.ArrayList;

/**
 *cette classe regroupe les button dans un Arraylist 
 * @author TAREK
 */
public class AtrributList {
 private ArrayList<JFXButton> arry ;
 
 public AtrributList(){
 arry = new ArrayList<JFXButton>();
 }
 
 public void adder(JFXButton x)throws IndexOutOfBoundsException{
 arry.add(x);
 }
 
 public JFXButton getButton(int i) throws IndexOutOfBoundsException{
    return arry.get(i);
 }
 
}
