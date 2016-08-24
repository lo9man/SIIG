package mpm.ig.mission.service.Interface;

import java.util.List;

import mpm.ig.mission.model.Typemission;

public interface TypeMissionService {
	
		// Ajouter un nouveau type de mission � la base de donn�e
			public void addType(Typemission type);
				
		// Modifier un type de mission dans la base de donn�e
			public void updateType(Typemission type);
							
		// Retourner la liste de tous les types de missions
			public List<Typemission> listType();
				
		// Supprimer un type de mission
			public void deleteType(Typemission type);

}
