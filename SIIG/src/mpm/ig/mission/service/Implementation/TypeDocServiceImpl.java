package mpm.ig.mission.service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mpm.ig.mission.dao.Interface.TypeDocDao;
import mpm.ig.mission.model.Typedoc;
import mpm.ig.mission.service.Interface.TypeDocService;

public class TypeDocServiceImpl implements TypeDocService {

	@Autowired
	TypeDocDao typedocDao;

	@Override
	public void addType(Typedoc type) {
		typedocDao.saveTypeDoc(type);
	}

	@Override
	public void updateType(Typedoc type) {
		typedocDao.updateTypeDoc(type);
	}

	@Override
	public List<Typedoc> listType() {
		return typedocDao.findAll();
	}

	@Override
	public void deleteType(Typedoc type) {
		typedocDao.deleteTypeDoc(type);
	}

}
