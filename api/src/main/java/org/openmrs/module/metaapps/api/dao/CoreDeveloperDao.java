package org.openmrs.module.metaapps.api.dao;

import org.openmrs.api.APIException;
import org.openmrs.module.metaapps.entity.CoreDeveloper;
import org.springframework.transaction.annotation.Transactional;

public interface CoreDeveloperDao {
	
	@Transactional
	public void saveDev(CoreDeveloper coreDeveloper) throws APIException;
}
