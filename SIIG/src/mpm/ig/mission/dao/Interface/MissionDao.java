package mpm.ig.mission.dao.Interface;

import java.util.List;

import mpm.ig.mission.model.Mission;

public interface MissionDao {
	
	public Mission findMission(Mission mission);

	public List<Mission> findMissionByTitre(Mission mission);

	public List<Mission> findMissionByDebut(Mission mission);

	public List<Mission> findMissionByFin(Mission mission);

	public List<Mission> findMissionByType(Mission mission);

	public void saveMission(Mission mission);

	public void deleteMission(Mission mission);

	public void updateMission(Mission mission);

	public List<Mission> findAll();

}
