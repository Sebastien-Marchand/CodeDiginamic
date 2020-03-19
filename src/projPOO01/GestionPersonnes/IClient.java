package projPOO01.GestionPersonnes;

import java.util.List;

import projPOO01.GestionAchat.Achat;

public interface IClient {
	public void achete(List<Achat> listachat);
	public default boolean paie() {
		return false;
	}
	public default boolean isClient() {
		return false;
	}
}
