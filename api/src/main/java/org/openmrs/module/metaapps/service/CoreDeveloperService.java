package org.openmrs.module.metaapps.service;

import org.openmrs.api.APIException;
import org.openmrs.module.metaapps.entity.CoreDeveloper;
import org.springframework.transaction.annotation.Transactional;

public interface CoreDeveloperService {
	
	@Transactional
	public void saveDev(CoreDeveloper coreDeveloper) throws APIException;;
}
