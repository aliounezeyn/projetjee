package mr.iscae.projetjavaee;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/con")
@Produces("application/json")
public class Connexion {

	public static Admin admin = new Admin();
	
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getValue(@QueryParam("identifiant") String identifiant, @QueryParam("motdepasse") String motdepasse) {
		if (identifiant.equals(admin.getIdentifiant())) {
			if(motdepasse.equals(admin.getMotDePasse())){
				return "Bienvenue Admin, connexion avec succes";
			}else{
				return "Erreur de connexion. Mot de passe incorect";
			}
		}
		return "Erreur de connexion. verifier les informations";
	}
}
