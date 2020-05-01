package org.openmrs.module.metaapps.web.controller;

import org.openmrs.module.metaapps.entity.CoreDeveloper;
import org.openmrs.module.metaapps.service.CoreDeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.openmrs.module.webservices.rest.web.RestConstants;

import java.util.List;

@Controller
public class HomeController {

    CoreDeveloperService coreDeveloperService;

    public HomeController() {

    }

    @Autowired
    public HomeController(CoreDeveloperService coreDeveloperService) {
        this.coreDeveloperService = coreDeveloperService;
    }

    @RequestMapping(value = "/module/metaapps/greeting", method = RequestMethod.GET)
    @ResponseBody
    public String greeting() {
        return "Hello OpenMRS+ Developer";
    }

    @RequestMapping(value = "/module/metaapps/saveDev", method = RequestMethod.POST)
    @ResponseBody
    public String saveDeveloper(@RequestBody CoreDeveloper coreDeveloper) {
        coreDeveloperService.saveDev(coreDeveloper);
        return "Save Successfully !";
    }

    @RequestMapping(value = "/module/metaapps/getAllCoreDeveloper", method = RequestMethod.GET)
    @ResponseBody
    public List<CoreDeveloper> getAllCoreDeveloper() {
        return coreDeveloperService.getAllCoreDeveloper();
    }

    @RequestMapping(value = "/module/metaapps/getCoreDeveloper/{coreDeveloperId}", method = RequestMethod.GET)
    @ResponseBody
    public CoreDeveloper getCoreDeveloper(@PathVariable("coreDeveloperId") Integer coreDeveloperId) {
        if (coreDeveloperId == null) {
            return null;
        }
        return coreDeveloperService.getCoreDeveloper(coreDeveloperId);
    }

    @ResponseBody
    @RequestMapping(value = "/module/metaapps/updateCoreDeveloper", method = RequestMethod.POST)
    public void updateCoreDeveloper(@RequestBody CoreDeveloper coreDeveloper) {
        coreDeveloperService.updateCoreDeveloper(coreDeveloper);
    }

}
