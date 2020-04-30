package org.openmrs.module.metaapps.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@ResponseBody
	@RequestMapping(value = "module/metaapps/greeting", method = RequestMethod.GET)
	public String greeting() {
		return "Hello OpenMRS+ Developer";
	}
}
