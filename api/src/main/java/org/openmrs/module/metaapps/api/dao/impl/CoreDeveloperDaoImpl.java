package org.openmrs.module.metaapps.api.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.openmrs.api.APIException;
import org.openmrs.api.db.hibernate.DbSession;
import org.openmrs.api.db.hibernate.DbSessionFactory;
import org.openmrs.module.metaapps.api.dao.CoreDeveloperDao;
import org.openmrs.module.metaapps.entity.CoreDeveloper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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
	
	@Override
	public List<CoreDeveloper> getAllCoreDeveloper() throws APIException {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(CoreDeveloper.class);
		return criteria.list();
	}
	
	@Override
	public CoreDeveloper getCoreDeveloper(Integer coreDeveloperId) throws APIException {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(CoreDeveloper.class);
		criteria.add(Restrictions.eq("id", coreDeveloperId));
		return (CoreDeveloper) criteria.uniqueResult();
	}
	
	@Override
	public void updateCoreDeveloper(CoreDeveloper coreDeveloper) throws APIException {
		sessionFactory.getCurrentSession().saveOrUpdate(coreDeveloper);
	}
	
}
