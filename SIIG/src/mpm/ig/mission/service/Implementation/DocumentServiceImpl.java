package mpm.ig.mission.service.Implementation;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mpm.ig.mission.dao.Interface.DocumentDao;
import mpm.ig.mission.model.Document;
import mpm.ig.mission.service.Interface.DocumentService;

@Service("documentService")
public class DocumentServiceImpl implements DocumentService {

	@Autowired
	DocumentDao documentDao;

	@Override
	public void enregistrerDoc(Document document) {
		
		documentDao.saveDocument(document);
	}



}
