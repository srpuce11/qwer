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

import com.baeldung.persistence.dao.RoleRepository;
import com.baeldung.persistence.dao.UserRepository;
import com.baeldung.persistence.model.Privilege;
import com.baeldung.persistence.model.Role;
import com.baeldung.persistence.model.User;
import com.baeldung.security.LoggedUser;
import com.baeldung.service.UserService;
import com.baeldung.web.dto.UserDto;

@Controller
public class DashboardUser {

	private final Logger LOGGER = LoggerFactory.getLogger(getClass());
	@Autowired
	private UserService userService;

	@Autowired
	private UserRepository userRepositroy;

	@Autowired
	private RoleRepository roleRepo;

	@RequestMapping(value = { "/", "/dashboardUser" }, method = RequestMethod.GET)
	public ModelAndView dashboardUser(Locale locale, final ModelMap model, HttpServletRequest request, HttpServletResponse response,
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
	        	 String username;
	             if (authentication.getPrincipal() instanceof User) {
	             	username = ((User)authentication.getPrincipal()).getEmail();
	             }
	             else {
	             	username = authentication.getName();
	             }
	             return new ModelAndView("redirect:/dashboardUser", model); // to userDashboard
	        } else if (isAdmin) {
	        	return new ModelAndView("redirect:/dashboardAdmin", model);  // to dashboardAdmin
	        } else {
	            throw new IllegalStateException();
	        }
//				List<User> userList =userRepositroy.findAll(); 
//				model.addAttribute("userList", userList);
	}

  

}
