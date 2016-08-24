package mpm.ig.mission.service.Interface;

import java.util.List;

import mpm.ig.mission.model.Mission;

public interface MissionService {

	// Ajouter une nouvelle mission � la base de donn�e
	public void addMission(Mission mission);

	// Modifier une mission dans la base de donn�e
	public void updateMission(Mission mission);

	// Retourner la liste de toutes les missions
	public List<Mission> listMission();

	// Retourner la liste des mission selon titre
	public List<Mission> listMissionByTitre(Mission mission);

	// Retourner la liste des mission selon Date Debut
	public List<Mission> listMissionByDebut(Mission mission);

	// Retourner la liste des mission selon Date Fin
	public List<Mission> listMissionByFin(Mission mission);

	// Retourner la liste des mission selon type
	public List<Mission> listMissionByType(Mission mission);

	// Supprimer une mission
	public void deleteMission(Mission mission);

}
