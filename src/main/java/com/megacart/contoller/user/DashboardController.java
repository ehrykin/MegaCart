package com.megacart.contoller.user;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.megacart.util.Localization;

@Controller
@RequestMapping("common")
public class DashboardController {
	@Autowired
	Localization localization;
	
	Map<String, String> commonMessages;
	
	@PostConstruct
	void init(){
		commonMessages = localization.getResources("common.common");
	}
	
	@ModelAttribute
	void loadLocalizationMessages(Model model) {
	    model.addAllAttributes(commonMessages);
	}
	
	@RequestMapping({"dashboard/", "dashboard"})
	public String index(
			@RequestParam(defaultValue = "username") String sort, 
			@RequestParam(defaultValue = "ASC") String order, 
			@RequestParam(defaultValue = "1") Integer page, 
			@RequestParam(defaultValue = "") Integer[] selected,
			Model model){
		
		return "common/dashboard";
	}
}
