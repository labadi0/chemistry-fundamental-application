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


public class Ion {
	
	Mendeleev_Table tab = new Mendeleev_Table();
	//tab.getElements();
	
	public Ion() {
		
	}
	
	/**
	 * 
	 * @param index indice d'un atome dans le tableau périodique de Mendeleiev
	 * @return renvoi la charge de l'ion correspondant
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
				return -3;
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
				return -3;
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
				return -2;
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
				return -1;
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
	
}

