package projPOO01.Menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import projPOO01.actions.Effectuer;
import projPOO01.affichages.Affichages;
import projPOO01.saisie.Saisir;



/**
 * @author S�bastien MARCHAND
 * 
 * Classe qui repr�sente le menue afficher pour l'utilisateur
 * Permet de r�cup�rer les saisies de l'utilisateur et de les traiter
 *
 */
public class Menus {
	public static Scanner sc =null;
	public static int choixmenu;
	
	private static String choix = null;
	
	public static void quitter() {
		System.exit(0);
	}
			
	/**
	 * M�thode qui permet d'afficher les possibilit� de l'application
	 * pour l'utilisateur
	 */
	public static void Menu() {
		Map<String, iExecute> im1 = new HashMap<String,iExecute>();

		im1.put("1 Saisir des donn�es",Menus::Saisir);
		im1.put("2 Afficher des donn�es",Affichages::Afficher);
		im1.put("3 Saisir des achats",Effectuer::EffectuerAchat);
		im1.put("4 Saisir des commandes",Effectuer::EffectuerCommande);
		im1.put("5 Quitter",Menus::quitter);
		im1.keySet().stream().sorted().forEach(System.out::println);
		
		while(true) {
		
		choix = sc.next();
		
		im1.entrySet().stream().filter(e->e.getKey().charAt(0) == choix.charAt(0)).
		forEach(e->e.getValue().apply());
					
		}
		
		
	}

	
	/**
	 * Permet de sp�cifier qu'elle donn�e l'utilisateur souhaite enregistrer
	 */
	public static void Saisir() {
				
		Map<String, iExecute> im1 = new HashMap<String,iExecute>();

		im1.put("1 pour saisir toutes les donn�es", Saisir::SaisirAll);
		im1.put("2 pour saisir les salari�s",Saisir::SaisirSalarie);
		im1.put("3 pour saisir les clients", Saisir::SaisirClient);
		im1.put("4 pour saisir les fournisseur",Saisir::SaisirFournisseur);
		im1.put("5 pour saisir le patron",Saisir::SaisirPatron);
		im1.put("6 pour retourner au menu",Menus::Menu);
		im1.put("7 pour saisir interimaire",Saisir::SaisirInterimaire);

		im1.keySet().stream().sorted().forEach(System.out::println);
		
		while(true) {
			
			choix = sc.next();
			
			im1.entrySet().stream().filter(e->e.getKey().charAt(0) == choix.charAt(0)).
			forEach(e->e.getValue().apply());
						
			}

	}
}
