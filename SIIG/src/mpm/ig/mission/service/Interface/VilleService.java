package mpm.ig.mission.service.Interface;

import java.util.List;

import mpm.ig.mission.model.Ville;

public interface VilleService {
	
			// Ajouter une nouvelle ville � la base de donn�e
				public void addVille(Ville ville);
				
			// Modifier une ville dans la base de donn�e
				public void updateVille(Ville ville);
							
			// Retourner la liste de toutes les villes
				public List<Ville> listVille();
				
			// Supprimer une ville
				public void deleteVille(Ville ville);


}
