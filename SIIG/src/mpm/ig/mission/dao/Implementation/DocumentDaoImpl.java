package mpm.ig.mission.dao.Implementation;

import mpm.ig.mission.dao.Interface.DocumentDao;
import mpm.ig.mission.model.Document;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository("DocumentDaoRepository")
@Transactional
public class DocumentDaoImpl implements DocumentDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveDocument(Document document) {
		sessionFactory.getCurrentSession().saveOrUpdate(document);
	}

}
