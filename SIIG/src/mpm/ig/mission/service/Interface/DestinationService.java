package mpm.ig.mission.service.Interface;

import java.util.List;

import mpm.ig.mission.model.Destination;
import mpm.ig.mission.model.Mission;

public interface DestinationService {

	// Ajouter une nouvelle mission � la base de donn�e
			public void addDestination(Destination destination);
			
		// Modifier une mission dans la base de donn�e
			public void updateDestination(Destination destination);
						
		// Retourner la liste de toutes les missions
			public List<Destination> listDestination();
			
		// Retourner la liste des destination pour une mission donn�e
			public List<Destination> listDestinationMission(Mission mission);
			
		// Supprimer une mission
			public void deleteDestination(Destination destination);


}
