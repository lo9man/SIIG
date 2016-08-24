package mpm.ig.mission.dao.Implementation;

import java.util.Calendar;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mpm.ig.mission.dao.Interface.MissionDao;
import mpm.ig.mission.model.Mission;

@Repository("MissionDaoRepository")
@Transactional
public class MissionDaoImpl implements MissionDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Mission findMission(Mission mission) {
		Query query = sessionFactory.getCurrentSession().createQuery(
				"from mission m where m.idMission = " + mission.getIdMission());
		if (query.list().size() == 0)
			return null;
		else
			return (Mission) query.list().get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Mission> findMissionByTitre(Mission mission) {
		Calendar calDebut = Calendar.getInstance();
		calDebut.setTime(mission.getDebut());
		int annee = calDebut.get(Calendar.YEAR);
		int mois = calDebut.get(Calendar.MONTH);
		int jour = calDebut.get(Calendar.DAY_OF_MONTH);

		boolean premiereClause = true;
		StringBuffer query = new StringBuffer("from Mission m where ");
		if (mission.getTitre() != null) {
			query.append("m.titre = '" + mission.getTitre() + "'");
			query.append(premiereClause ? " " : " and ");
			premiereClause = false;
		}
		// if (mission.getDebut() != null) {
		// query.append(premiereClause ? " " : " and ");
		// //query.append("m.debut = '" + mission.getDebut()+"'");
		// query.append("m.debut = '" + annee+"-"+mois+"-"+jour+"'");
		// premiereClause = false;
		// }
		String requeteHql = query.toString();
		System.out.println("La requete est :" + requeteHql);
		return sessionFactory.getCurrentSession().createQuery(requeteHql)
				.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Mission> findMissionByDebut(Mission mission) {
		return sessionFactory
				.getCurrentSession()
				.createQuery(
						"from mission m where m.debut =" + mission.getDebut())
				.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Mission> findMissionByFin(Mission mission) {
		return sessionFactory.getCurrentSession()
				.createQuery("from mission m where m.fin =" + mission.getFin())
				.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Mission> findMissionByType(Mission mission) {
		return sessionFactory
				.getCurrentSession()
				.createQuery(
						"from mission m where m.typemission ="
								+ mission.getTypemission()).list();
	}

	@Override
	public void saveMission(Mission mission) {
		sessionFactory.getCurrentSession().saveOrUpdate(mission);
	}

	@Override
	public void deleteMission(Mission mission) {
		sessionFactory.getCurrentSession().delete(mission);
		System.out.println("aprés requete");
	}

	@Override
	public void updateMission(Mission mission) {
		sessionFactory.getCurrentSession().saveOrUpdate(mission);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Mission> findAll() {
		return sessionFactory.getCurrentSession().createQuery("From Mission")
				.list();
	}

}
