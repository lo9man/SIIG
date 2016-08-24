package mpm.ig.mission.service.Interface;

import java.util.List;

import mpm.ig.mission.model.Entite;
import mpm.ig.mission.model.Ville;

public interface EntiteService {
	
			// Ajouter une nouvelle entite � la base de donn�e
				public void addEntite(Entite entite);
				
			// Modifier une mission dans la base de donn�e
				public void updateEntite(Entite entite);
							
			// Retourner la liste de toutes les missions
				public List<Entite> listEntiteVille(Ville ville);
				
			//retourner la liste 
				public List<Entite> listeEntite();
				
			// Supprimer une mission
				public void deleteEntite(Entite entite);

				


}
