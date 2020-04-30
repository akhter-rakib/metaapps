package org.openmrs.module.metaapps.service.impl;

import org.openmrs.module.metaapps.api.dao.CoreDeveloperDao;
import org.openmrs.module.metaapps.api.dao.MetaappsDao;
import org.openmrs.module.metaapps.entity.CoreDeveloper;
import org.openmrs.module.metaapps.service.CoreDeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
