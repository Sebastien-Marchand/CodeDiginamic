package projPOO01;

import java.util.Scanner;

import projPOO01.Menu.Menus;


/**
 * @author S�bastien MARCHAND
 * 
 * Classe Programme qui repr�sente la classe principale du lancement de l'application.
 * Elle permet de lancer l'application et le menue de selection pour l'utilisateur
 *
 */
public class Programme {

	
	private static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Menus.sc = Programme.sc;
		
		Menus.Menu();

	}
	

}
