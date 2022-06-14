package com.baeldung.web.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.baeldung.persistence.model.User;
import com.baeldung.requestvo.PersonAddressDetailVo;
import com.baeldung.requestvo.PersonalDetailForCustomerVo;
import com.baeldung.service.IMasterDBService;



@Controller
public class PopulationRegController {

	
	@Autowired
	IMasterDBService masterDBService;
	
	@RequestMapping(value = "/registrationForm" , method = RequestMethod.GET)
	public String registrationForm(ModelMap model, HttpSession session, final Authentication authentication) {
		
		PersonalDetailForCustomerVo personalDetailVo = new PersonalDetailForCustomerVo();
		// Get User Basic Details from SIGNUP Table starts
		 boolean isUser = false;
	        boolean isAdmin = false;
	        String userName = null;
       	 String firstName = null;
       	 Long userId = null;
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
        	
             if (authentication.getPrincipal() instanceof User) {
            	 firstName = ((User)authentication.getPrincipal()).getFirstName();
             	userName = ((User)authentication.getPrincipal()).getEmail();
             	userId = ((User)authentication.getPrincipal()).getId();
             }
             else {
            	 userName = authentication.getName();
             }
             model.addAttribute("firstName", firstName);
             model.addAttribute("userName", userName);
        }
		// Get User Basic Details from SIGNUP Table Ends
		personalDetailVo.setId(userId);
        personalDetailVo.setEmail(userName);
        personalDetailVo.setFirstName(firstName);
		model.addAttribute("personalDetailVo", personalDetailVo);
		model.addAttribute("formFlag", "1");
		return "registrationForm";
	}
	
	@RequestMapping(value = "/personDetailSave")
	public String personDetailSave(
			@ModelAttribute("personalDetailVo") PersonalDetailForCustomerVo personalDetailForCustomerVo,
			HttpServletRequest request, RedirectAttributes ru, Model model, HttpSession session) {

		
		
		try {
			session.setAttribute("personalDetailForPersonVo", personalDetailForCustomerVo);
			} catch (Exception e) {
			}
			
			System.out.println("\n personalDetailForCustomerVo => " + personalDetailForCustomerVo);
		
			PersonAddressDetailVo addressDetailVo = new PersonAddressDetailVo();
			model.addAttribute("addressDetailVo", addressDetailVo);
			model.addAttribute("formFlag", "2");
		return "registrationForm";
	
}
	
	@RequestMapping(value = "/addressDetailSave")
	public String addressDetailSave(
			@ModelAttribute("addressDetailVo") PersonAddressDetailVo addressDetailForPersonVo,
			HttpServletRequest request, RedirectAttributes ru, Model model, HttpSession session) {
		PersonalDetailForCustomerVo personalDetails = null;
		
		try {
			personalDetails = (PersonalDetailForCustomerVo) session.getAttribute("personalDetailForPersonVo");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		masterDBService.saveByVo(personalDetails);
		
		model.addAttribute("formFlag", "3");
		return "registrationForm";
	}
	
}