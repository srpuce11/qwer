package com.baeldung.web.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.baeldung.persistence.dao.IMasterDBDao;
import com.baeldung.persistence.dao.RoleRepository;
import com.baeldung.persistence.dao.UserRepository;
import com.baeldung.persistence.model.MasterDB;
import com.baeldung.persistence.model.Privilege;
import com.baeldung.persistence.model.Role;
import com.baeldung.persistence.model.User;
import com.baeldung.security.LoggedUser;
import com.baeldung.service.UserService;
import com.baeldung.web.dto.UserDto;

@Controller
public class DashboardController {

	private final Logger LOGGER = LoggerFactory.getLogger(getClass());
	@Autowired
	private UserService userService;

	@Autowired
	private UserRepository userRepositroy;
	
	@Autowired
	private IMasterDBDao masterRepositroy;

	@Autowired
	private RoleRepository roleRepo;

	@RequestMapping(value = { "/", "/dashboard" }, method = RequestMethod.GET)
	public String dashboard(Locale locale, final ModelMap model, HttpServletRequest request, HttpServletResponse response,
			HttpSession session, final Authentication authentication) {
		LOGGER.debug("Welcome home! The client locale is {}.", locale);
// Auth check
		 boolean isUser = false;
	        boolean isAdmin = false;
	        final Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
	        for (final GrantedAuthority grantedAuthority : authorities) {
	            if (grantedAuthority.getAuthority().equals("READ_PRIVILEGE")) {
	                isUser = true;
	            } else if (grantedAuthority.getAuthority().equals("WRITE_PRIVILEGE")) {
	                isAdmin = true;
	                isUser = false;
	                break;
	            }
	        }
	        if (isUser) {
	        	 String userName;
	        	 String firstName = null;
	             if (authentication.getPrincipal() instanceof User) {
	            	 firstName = ((User)authentication.getPrincipal()).getFirstName();
	             	userName = ((User)authentication.getPrincipal()).getEmail();
	             }
	             else {
	            	 userName = authentication.getName();
	             }
	             model.addAttribute("firstName", firstName);
	             model.addAttribute("userName", userName);
	             return "/dashboardUser";// to userDashboard
	        } else if (isAdmin) {
				
	        	// All person Report
	        	List<MasterDB> userList = masterRepositroy.findAll();
	        	
				model.addAttribute("userList", userList);
				
				
	        	return "dashboardAdmin";  // to dashboardAdmin
	        } else {
	        	return "invalidSession";
	            
	        }
	}

    @RequestMapping("/products")
    public String products() {
    	LOGGER.debug("Products controller starts");
        return "products";
    }
    @RequestMapping("/about")
    public String about() {
    	LOGGER.debug("About controller starts");
        return "about";
    }
    @RequestMapping("/layout")
    public String layoutTest(Model model) {
    	LOGGER.debug("Layout function  starts");
    	model.addAttribute("title", "Test Layouts");
    	model.addAttribute("${otherStaticResources}", "${otherStaticResources}");
        return "layouts/main-layout";
    }

}
