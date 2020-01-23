/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import java.awt.Color;
import java.io.IOException;
import java.net.URL;
//import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;
import sun.plugin.javascript.navig.Anchor;

/**
 * c'est le jPanel qui contient ihm graphique de tableau de Mendeleev et contient 118 buttons et si on clic sur un button il affiche les resultats d'un element 
 * et elle contient un button qui ouvre une barre de navigation pour aller au d'autre Jpanel 
 * 
 * @author TAREK
 */
public class FXMLDocumentController implements Initializable {
  
 
    
   @FXML
    private JFXButton element1;

    @FXML
    private JFXButton element2;

    @FXML
    private JFXButton element3;

    @FXML
    private JFXButton element4;

    @FXML
    private JFXButton element5;

    @FXML
    private JFXButton element6;

    @FXML
    private JFXButton element7;

    @FXML
    private JFXButton element8;

    @FXML
    private JFXButton element9;

    @FXML
    private JFXButton element10;

    @FXML
    private JFXButton element11;

    @FXML
    private JFXButton element12;

    @FXML
    private JFXButton element13;

    @FXML
    private JFXButton element14;
     
    @FXML
    private JFXButton element15;

    @FXML
    private JFXButton element16;
    
    @FXML
    private JFXButton element17;

    @FXML
    private JFXButton element18;

    @FXML
    private JFXButton element19;

    @FXML
    private JFXButton element20;

    @FXML
    private JFXButton element21;

    @FXML
    private JFXButton element22;

    @FXML
    private JFXButton element23;

    @FXML
    private JFXButton element24;

    @FXML
    private JFXButton element25;

    @FXML
    private JFXButton element26;

    @FXML
    private JFXButton element27;

    @FXML
    private JFXButton element28;

    @FXML
    private JFXButton element29;

    @FXML
    private JFXButton element30;

    @FXML
    private JFXButton element31;

    @FXML
    private JFXButton element32;

    @FXML
    private JFXButton element33;

    @FXML
    private JFXButton element34;

    @FXML
    private JFXButton element35;

    @FXML
    private JFXButton element36;

    @FXML
    private JFXButton element37;

    @FXML
    private JFXButton element38;

    @FXML
    private JFXButton element39;

    @FXML
    private JFXButton element40;

    @FXML
    private JFXButton element41;

    @FXML
    private JFXButton element42;

    @FXML
    private JFXButton element43;

    @FXML
    private JFXButton element44;

    @FXML
    private JFXButton element45;

    @FXML
    private JFXButton element46;

    @FXML
    private JFXButton element47;

    @FXML
    private JFXButton element48;

    @FXML
    private JFXButton element49;

    @FXML
    private JFXButton element50;

    @FXML
    private JFXButton element51;

    @FXML
    private JFXButton element52;

    @FXML
    private JFXButton element53;

    @FXML
    private JFXButton element54;

    @FXML
    private JFXButton element55;

    @FXML
    private JFXButton element56;

    @FXML
    private JFXButton element57;

    @FXML
    private JFXButton element58;

    @FXML
    private JFXButton element59;

    @FXML
    private JFXButton element60;

    @FXML
    private JFXButton element61;

    @FXML
    private JFXButton element62;

    @FXML
    private JFXButton element63;

    @FXML
    private JFXButton element64;

    @FXML
    private JFXButton element65;

    @FXML
    private JFXButton element66;

    @FXML
    private JFXButton element67;

    @FXML
    private JFXButton element68;

    @FXML
    private JFXButton element69;
    
    @FXML
    private JFXButton element70;

    @FXML
    private JFXButton element71;

    @FXML
    private JFXButton element72;

    @FXML
    private JFXButton element73;

    @FXML
    private JFXButton element74;

    @FXML
    private JFXButton element75;

    @FXML
    private JFXButton element76;

    @FXML
    private JFXButton element77;

    @FXML
    private JFXButton element78;

    @FXML
    private JFXButton element79;
    
    @FXML
    private JFXButton element80;

    @FXML
    private JFXButton element81;

    @FXML
    private JFXButton element82;

    @FXML
    private JFXButton element83;

    @FXML
    private JFXButton element84;

    @FXML
    private JFXButton element85;

    @FXML
    private JFXButton element86;

    @FXML
    private JFXButton element87;

    @FXML
    private JFXButton element88;

    @FXML
    private JFXButton element89;
    
    @FXML
    private JFXButton element90;

    @FXML
    private JFXButton element91;

    @FXML
    private JFXButton element92;

    @FXML
    private JFXButton element93;

    @FXML
    private JFXButton element94;

    @FXML
    private JFXButton element95;

    @FXML
    private JFXButton element96;

    @FXML
    private JFXButton element97;

    @FXML
    private JFXButton element98;

    @FXML
    private JFXButton element99;
    
    @FXML
    private JFXButton element100;
    
    @FXML
    private JFXButton element101;

    @FXML
    private JFXButton element102;
    @FXML
    private JFXButton element103;
    
    @FXML
    private JFXButton element104;

    @FXML
    private JFXButton element105;
    @FXML
    private JFXButton element106;

    @FXML
    private JFXButton element107;
    @FXML
    private JFXButton element108;
    
    @FXML
    private JFXButton element109;

    @FXML
    private JFXButton element110;

    @FXML
    private JFXButton element111;
   
    @FXML
    private JFXButton element112;
    
    @FXML
    private JFXButton element113;
   
    @FXML
    private JFXButton element114;
    
     @FXML
    private JFXButton element115;
   
    @FXML
    private JFXButton element116;
    
    @FXML
    private JFXButton element117;
   
    @FXML
    private JFXButton element118;
    
    
    @FXML
    private Label textFamilie;
    
     @FXML
    private Label text;
     
     @FXML
    private Label protonNumber;
     
     
     
     @FXML
    private Label neutronNumber;

    @FXML
    private Label electronNumber;

    @FXML
    private Label nombreDeMasse;

    @FXML
    private Label mass;

    @FXML
    private Label massEnGramme;

    @FXML
    private Label massMolaire;

    @FXML
    private Label volumeMolaire;

    @FXML
    private Label quantiteDeMatiere;
    
    @FXML
    private Label nameView;
    
    @FXML
   private JFXButton clicMe;
    
     @FXML
    private JFXDrawer drawer;
     
     @FXML
    private JFXHamburger hamburger;   
     /**
      * cette methode qui affiche le contenu d'un element que on clic , pour affichage de centenu on récupére le nom de  button et on vérifie si le nom button est le meme avec un symbole de l'objet de Mandaleev_Table
      * 
      * @param e ActionEvent
      * @throws Exception .
      */ 
     public void textchanger(ActionEvent e) throws Exception{
     Mendeleev_Table x = new Mendeleev_Table();
   
     AtrributList attri = new AtrributList();
     attri.adder(element1);
     attri.adder(element2);
     attri.adder(element3);
     attri.adder(element4);
     attri.adder(element5);
     attri.adder(element6);
     attri.adder(element7);
     attri.adder(element8);
     attri.adder(element9);
     attri.adder(element10);
     attri.adder(element11);
     attri.adder(element12);
     attri.adder(element13);
     attri.adder(element14);
     attri.adder(element15);
     attri.adder(element16);
     attri.adder(element17);
     attri.adder(element18);
     attri.adder(element19);
     attri.adder(element20);
     attri.adder(element21);
     attri.adder(element22);
     attri.adder(element23);
     attri.adder(element24);
     attri.adder(element25);
     attri.adder(element26);
     attri.adder(element27);
     attri.adder(element28);
     attri.adder(element29);
     attri.adder(element30);
     attri.adder(element31);
     attri.adder(element32);
     attri.adder(element33);
     attri.adder(element34);
     attri.adder(element35);
     attri.adder(element36);
     attri.adder(element37);
     attri.adder(element38);
     attri.adder(element39);
     
     attri.adder(element40);
     attri.adder(element41);
     attri.adder(element42);
     attri.adder(element43);
     attri.adder(element44);
     attri.adder(element45);
     attri.adder(element46);
     attri.adder(element47);
     attri.adder(element48);
     attri.adder(element49);
     
     attri.adder(element50);
     attri.adder(element51);
     attri.adder(element52);
     attri.adder(element53);
     attri.adder(element54);
     attri.adder(element55);
     attri.adder(element56);
     attri.adder(element57);
     attri.adder(element58);
     attri.adder(element59);
     
     attri.adder(element60);
     attri.adder(element61);
     attri.adder(element62);
     attri.adder(element63);
     attri.adder(element64);
     attri.adder(element65);
     attri.adder(element66);
     attri.adder(element67);
     attri.adder(element68);
     attri.adder(element69);
     
     attri.adder(element70);
     attri.adder(element71);
     attri.adder(element72);
     attri.adder(element73);
     attri.adder(element74);
     attri.adder(element75);
     attri.adder(element76);
     attri.adder(element77);
     attri.adder(element78);
     attri.adder(element79);
     
     attri.adder(element80);
     attri.adder(element81);
     attri.adder(element82);
     attri.adder(element83);
     attri.adder(element84);
     attri.adder(element85);
     attri.adder(element86);
     attri.adder(element87);
     attri.adder(element88);
     attri.adder(element89);
     
     attri.adder(element90);
     attri.adder(element91);
     attri.adder(element92);
     attri.adder(element93);
     attri.adder(element94);
     attri.adder(element95);
     attri.adder(element96);
     attri.adder(element97);
     attri.adder(element98);
     attri.adder(element99);
     
     attri.adder(element100);
     attri.adder(element101);
     attri.adder(element102);
     attri.adder(element103);
     attri.adder(element104);
     attri.adder(element105);
     attri.adder(element106);
     attri.adder(element107);
     attri.adder(element108);
     attri.adder(element109);
     
     attri.adder(element110);
     attri.adder(element111);
     attri.adder(element112);
     attri.adder(element113);
     attri.adder(element114);
     attri.adder(element115);
     attri.adder(element116);
     attri.adder(element117);
     attri.adder(element118);
    
     
     
         
        String value = ((Button)e.getSource()).getText();
    
         for (int i = 0; i < 118; i++) {
         if (value.equals(x.getSymbo(i))){
            
             text.setText(x.getElements(i).getSymbole());        
             nameView.setText(x.getElements(i).getName().toUpperCase());
             textFamilie.setText(x.getElements(i).getFamily());
             protonNumber.setText(x.getElements(i).getNbProton_p()+"");        
             neutronNumber.setText(x.getElements(i).getNbNeutron_n()+"");   
             electronNumber.setText(x.getElements(i).getNbElectron_e()+"");         
             nombreDeMasse.setText(x.getElements(i).getnbMass_A()+"");         
             massEnGramme.setText(x.getElements(i).getMassOfElemnt_m()+" g");
             massMolaire.setText(x.getElements(i).getMassMolaire_M()+"  g/mol");
             volumeMolaire.setText(x.getElements(i).getVolumeMolaire_Vm() +"  cm^3/mol");
             quantiteDeMatiere.setText(x.getElements(i).getquantite_matiere_n()+"  mol");
            
             GuiCouche1 p = new GuiCouche1(i+1);
                  
         }


         
         }
        
        

     }
     

    @Override
    /**
     * cette methode ou on met les methodes pour aller au d'autre ihm graphique de de l'application 
     *  
     */
  
    public void initialize(URL url, ResourceBundle rb) {

        
        
        
        
        try {
           VBox box  =  FXMLLoader.load(getClass().getResource(("DrawerNavigation.fxml")));
           drawer.setSidePane(box);
           
           for (Node node : box.getChildren()){
           if (node.getAccessibleText() != null){
               node.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) ->   {
                   switch (node.getAccessibleText()){
                       case "couche" :    
                           GuiCouche c = new GuiCouche();       
                          
                       

                   
                   }
                   
               });
                   
           }
           
           }
           
           
           
           for (Node node : box.getChildren()){
           if (node.getAccessibleText() != null){
               node.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) ->   {
                   switch (node.getAccessibleText()){
                          case "ion" :
                            InterfaceIon window = new InterfaceIon();
                            window.initialize();
                            window.run();
                            
                   }                  
               });                  
           }
           }
     
           
           for (Node node : box.getChildren()){
           if (node.getAccessibleText() != null){
               node.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) ->   {
                   switch (node.getAccessibleText()){       
                       case "valide" : 
                           Gui_valide window3  = new Gui_valide();
                           window3.initialize3();
                           window3.run();
                              
                  
                   
                   }
                   
               });
                   
           }
           
           }
           
            for (Node node : box.getChildren()){
           if (node.getAccessibleText() != null){
               node.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) ->   {
                   switch (node.getAccessibleText()){
                          case "lewis" :
 
                              
                              GuiLewis window5 = new GuiLewis();    
                          
                            
                         
  
                   }                  
               });                  
           }
           }
            
            
            
            for (Node node : box.getChildren()){
           if (node.getAccessibleText() != null){
               node.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) ->   {
                   switch (node.getAccessibleText()){
                          case "devlope" :
                            
                              GuiDevloppé    window6  =  new GuiDevloppé();
                              
                         
                            
                         
  
                   }                  
               });                  
           }
           }
            
              for (Node node : box.getChildren()){
           if (node.getAccessibleText() != null){
               node.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) ->   {
                   switch (node.getAccessibleText()){
                          case "isomere" :
                            
                              GuiIsomere    window7  =  new GuiIsomere();
                              
                         
                            
                         
  
                   }                  
               });                  
           }
           }
                 for (Node node : box.getChildren()){
           if (node.getAccessibleText() != null){
               node.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) ->   {
                   switch (node.getAccessibleText()){
                          case "reaction" :
                            
                              
                              
                   Gui_reaction window8 = new Gui_reaction("Reaction chimique");
                              
                          
                            
                         
  
                   }                  
               });                  
           }
           }
            
            
            
           
           
           
           
           
           

           
           HamburgerBackArrowBasicTransition transition = new HamburgerBackArrowBasicTransition(hamburger);
           transition.setRate(-1);
           hamburger.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) -> {
               transition.setRate(transition.getRate() * -1);
               transition.play();
               
               if (drawer.isOpened()) {
                   drawer.close();
               } else {
                   drawer.open();
               }
           });
       } catch (IOException ex) {
           Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
       }

     
    
    }
    
    
    
    
 
    
    
    
    
    
    
    
}