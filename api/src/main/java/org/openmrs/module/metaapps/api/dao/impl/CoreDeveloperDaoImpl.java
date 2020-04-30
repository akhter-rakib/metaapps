package org.openmrs.module.metaapps.api.dao.impl;

import org.openmrs.api.APIException;
import org.openmrs.api.db.hibernate.DbSession;
import org.openmrs.api.db.hibernate.DbSessionFactory;
import org.openmrs.module.metaapps.api.dao.CoreDeveloperDao;
import org.openmrs.module.metaapps.entity.CoreDeveloper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CoreDeveloperDaoImpl implements CoreDeveloperDao {
	
	@Autowired
	DbSessionFactory sessionFactory;
	
	private DbSession getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void saveDev(CoreDeveloper coreDeveloper) throws APIException {
		sessionFactory.getCurrentSession().saveOrUpdate(coreDeveloper);
	}
}
