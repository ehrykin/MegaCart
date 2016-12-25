package com.megacart.contoller.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.assertj.core.util.Strings;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriComponentsBuilder;

import com.megacart.repository.ConfigRepository;
import com.megacart.repository.UserRepository;
import com.megacart.util.Collection;
import com.megacart.util.Localization;
import com.megacart.util.Pagination;
import com.megacart.util.UrlUtils;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	Localization localization;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	ConfigRepository configRepository;
	
	@Autowired
	UrlUtils urlUtils;
	@Autowired
	Collection collection;
	
	Map<String, String> commonMessages;
	Map<String, String> columnLeftMessages;
	Map<String, String> dashboardMessages;
	Map<String, String> filemanagerMessages;
	Map<String, String> footerMessages;
	Map<String, String> forgottenMessages;
	Map<String, String> headerMessages;
	Map<String, String> loginMessages;
	Map<String, String> resetMessages;
	Map<String, String> userMessages;
	
	@PostConstruct
	void init(){
		commonMessages = localization.getResources("common.common");
		columnLeftMessages = localization.getResources("common.column_left");
		dashboardMessages = localization.getResources("common.dashboard");
		filemanagerMessages = localization.getResources("common.filemanager");
		footerMessages = localization.getResources("common.footer");
		forgottenMessages = localization.getResources("common.forgotten");
		headerMessages = localization.getResources("common.header");
		loginMessages = localization.getResources("common.login");
		resetMessages = localization.getResources("common.reset");
		userMessages = localization.getResources("user.user");
	}
	
	@ModelAttribute
	void loadLocalizationMessages(Model model) {
	    model.addAllAttributes(commonMessages);
	    model.addAllAttributes(columnLeftMessages);
	    model.addAllAttributes(dashboardMessages);
	    model.addAllAttributes(filemanagerMessages);
	    model.addAllAttributes(footerMessages);
	    model.addAllAttributes(forgottenMessages);
	    model.addAllAttributes(headerMessages);
	    model.addAllAttributes(loginMessages);
	    model.addAllAttributes(resetMessages);
	    model.addAllAttributes(userMessages);
	}
	
	@RequestMapping({"/", ""})
	public String index(
			@RequestParam(defaultValue = "username") String sort, 
			@RequestParam(defaultValue = "ASC") String order, 
			@RequestParam(defaultValue = "1") Integer page, 
			@RequestParam(defaultValue = "") Integer[] selected,
			Model model){
		
		model.addAttribute("sort", sort);
		model.addAttribute("order", order);
		model.addAttribute("page", page);
		model.addAttribute("selected", selected);
				
		model.addAttribute("breadcrumbs", Arrays.asList(
				urlUtils.createBreadCrumb("common.common.text_home", "/common/dashboard", null),
				urlUtils.createBreadCrumb("user.user.heading_title", "/user", 
						urlUtils.arrayAsUrlParam("selected", selected), "sort", sort, "order", order, "page", String.valueOf(page))
		));
		
		model.addAttribute("add", urlUtils.createUrl("/user/add", 
				urlUtils.arrayAsUrlParam("selected", selected), "sort", sort, "order", order, "page", String.valueOf(page)));
		model.addAttribute("delete", urlUtils.createUrl("/user/delete",  
				urlUtils.arrayAsUrlParam("selected", selected), "sort", sort, "order", order, "page", String.valueOf(page)));
		
		int rowsLimit = Integer.parseInt(configRepository.findByKey("config_limit_admin").getValue());
		
		model.addAttribute("users", userRepository.findAll(
				new PageRequest(page - 1, rowsLimit, new Sort(Direction.fromString(order.toUpperCase()), sort))));
		
		model.addAttribute("sort_username", urlUtils.createUrl("/user", 
				urlUtils.arrayAsUrlParam("selected", selected), "sort", "username", "order", order.equals("ASC") ? "DESC" : "ASC"));
		model.addAttribute("sort_status", urlUtils.createUrl("/user",  
				urlUtils.arrayAsUrlParam("selected", selected), "sort", "status", "order", order.equals("ASC") ? "DESC" : "ASC"));
		model.addAttribute("sort_date_added", urlUtils.createUrl("/user",  
				urlUtils.arrayAsUrlParam("selected", selected), "sort", "dateAdded", "order", order.equals("ASC") ? "DESC" : "ASC"));
		
		int totalUsersCount = (int) userRepository.count();
		
		model.addAttribute("pagination", new Pagination().setTotal(totalUsersCount).setPage(page)
				.setLimit(rowsLimit).setUrl(urlUtils.createUrl("/user", null, "page", "{page}")).render());
		
		model.addAttribute("results", String.format(commonMessages.get("text_pagination"), 
				totalUsersCount != 0 ? ((page - 1) * rowsLimit) + 1 : 0, 
				(((page - 1) * rowsLimit) > (totalUsersCount - rowsLimit)) ? totalUsersCount : (((page - 1) * rowsLimit) + rowsLimit), 
				totalUsersCount, (int) Math.ceil(totalUsersCount / rowsLimit)));
		
		return "user/user_list";
	}
}
