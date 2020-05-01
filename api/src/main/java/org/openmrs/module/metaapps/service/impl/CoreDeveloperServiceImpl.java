package org.openmrs.module.metaapps.service.impl;

import org.openmrs.api.APIException;
import org.openmrs.module.metaapps.api.dao.CoreDeveloperDao;
import org.openmrs.module.metaapps.api.dao.MetaappsDao;
import org.openmrs.module.metaapps.entity.CoreDeveloper;
import org.openmrs.module.metaapps.service.CoreDeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoreDeveloperServiceImpl implements CoreDeveloperService {
	
	@Autowired
	MetaappsDao dao;
	
	@Autowired
	CoreDeveloperDao coreDeveloperDao;
	
	@Override
	public void saveDev(CoreDeveloper coreDeveloper) {
		coreDeveloperDao.saveDev(coreDeveloper);
	}
	
	@Override
	public List<CoreDeveloper> getAllCoreDeveloper() throws APIException {
		return coreDeveloperDao.getAllCoreDeveloper();
	}
	
	@Override
	public CoreDeveloper getCoreDeveloper(Integer coreDeveloperId) throws APIException {
		return coreDeveloperDao.getCoreDeveloper(coreDeveloperId);
	}
	
	@Override
	public void updateCoreDeveloper(CoreDeveloper coreDeveloper) throws APIException {
		coreDeveloperDao.updateCoreDeveloper(coreDeveloper);
	}
	
}
