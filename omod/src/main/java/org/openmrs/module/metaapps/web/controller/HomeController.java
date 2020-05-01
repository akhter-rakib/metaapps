package org.openmrs.module.metaapps.web.controller;

import org.openmrs.module.metaapps.entity.CoreDeveloper;
import org.openmrs.module.metaapps.service.CoreDeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.openmrs.module.webservices.rest.web.RestConstants;

@Controller
public class HomeController {
	
	CoreDeveloperService coreDeveloperService;
	
	public HomeController() {
		
	}
	
	@Autowired
	public HomeController(CoreDeveloperService coreDeveloperService) {
		this.coreDeveloperService = coreDeveloperService;
	}
	
	@ResponseBody
	@RequestMapping(value = "/module/metaapps/greeting", method = RequestMethod.GET)
	public String greeting() {
		return "Hello OpenMRS+ Developer";
	}
	
	@ResponseBody
	@RequestMapping(value = "/module/metaapps/saveDev", method = RequestMethod.GET)
	public String saveDeveloper() {
		CoreDeveloper coreDeveloper = new CoreDeveloper("Rakib", 1, "rakibccj@gmail.com");
		coreDeveloperService.saveDev(coreDeveloper);
		return "Save Successfully !";
	}
	
}
