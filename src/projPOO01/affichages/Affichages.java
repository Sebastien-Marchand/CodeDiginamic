package projPOO01.affichages;

import java.util.ArrayList;

import projPOO01.Programme;
import projPOO01.GestionPersonnes.Personne;
import projPOO01.Menu.Menus;
import projPOO01.saisie.Saisir;

/**
 * @author S�bastien MARCHAND
 * 
 * Classe qui repr�sente l'affichage des information enregistrer
 * 
 * 
 *
 */
public class Affichages {

	/**
	 * Permet l'affichage de toute les personne enregistr�
	 * Permet d'afficher les information d'une personne celon un choix donn�e
	 */
	/**
	 * 
	 */
	public static void Afficher() {
		
		
		
		int choix;
		ArrayList<Personne> listpatron = new ArrayList<Personne>();
		listpatron.add(Saisir.patron);
		
		System.out.println("Taper 1 pour afficher toutes les donn�es");
		System.out.println("Taper 2 pour afficher les salari�s");
		System.out.println("Taper 3 pour afficher les clients");
		System.out.println("Taper 4 pour afficher les fournisseur");
		System.out.println("Taper 5 pour afficher le patron");
		System.out.println("Taper 6 pour retourner au menu");
		
		choix=Menus.sc.nextInt();
		
		switch(choix) {
		case 1 : AfficherCommun(Affichages.GrouperAffichage());
		break;
		case 2 : AfficherCommun(Saisir.listsalarie);
		break;
		case 3 : AfficherCommun(Saisir.listclient);
		break;
		case 4 : AfficherCommun(Saisir.listfournisseur);
		break;
		case 5 : AfficherCommun(listpatron);
		break;
		case 6 : Menus.Menu();
		break;
		default : Afficher();
		break;
		}
	}
	
	
	/**
	 * Permet d'afficher un par un les personnes contenue dans la liste
	 * @param list repr�sente l'ensemble des personnes a afficher
	 */
	public static void AfficherCommun(ArrayList<Personne> list ) {
		for(Personne p:list) {
			System.out.println(p.toString());
		}
		//Menus.RetourMenu();
	}
	
	/**
	 * Permet de retourner une liste compl�te des personnes ( salari�, client, fournisseur, patron )
	 * @return ArrayList<Personne>
	 */
	public static ArrayList<Personne> GrouperAffichage() {
		ArrayList<Personne> list = new ArrayList<Personne>();
		list.addAll(Saisir.listsalarie);
		list.addAll(Saisir.listclient);
		list.addAll(Saisir.listfournisseur);
		list.add(Saisir.patron);
		
		return list;
	}
	
}
