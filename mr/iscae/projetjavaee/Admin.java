package mr.iscae.projetjavaee;

public class Admin {
	private String identifiant="admin";
	private String motDePasse="admin";

	public String getIdentifiant() {
		return identifiant;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
}
