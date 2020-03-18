package projPOO01.GestionPersonnes;

import java.text.DecimalFormat;

public class Interimaire extends Salarie{

	String contratAgence;
	int duree;
	
	public Interimaire(String nom, String prenom, String adresse, String ville, String codepostal, String secu,String contratAgence, int duree,
			double salaire)
	{
		super(nom, prenom, adresse, ville, codepostal, secu, salaire);

	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return super.toString()+ " [secu=" + getSecu() + ", salaire=" + df.format(getSalaire()) + ", agence="+this.contratAgence+", durée contrat=" + this.duree + "]";
	}

}
