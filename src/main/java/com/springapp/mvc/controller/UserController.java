package com.springapp.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springapp.mvc.dao.DBService;
import com.springapp.mvc.modal.User;

/**
 * Created by raghuramn on 6/9/16.
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/logIn")
	public ModelAndView getLogInPage(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView model = new ModelAndView();
	    return null;
	  }
	
	@RequestMapping("/enrollment")
	public ModelAndView getEnrollment(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView enrollmentview = new ModelAndView("enrollment");
		return enrollmentview;
	}
	
	@RequestMapping("/saveMember")
	public ModelAndView getCaptureEnrollment(HttpServletRequest request,
			HttpServletResponse response) {
		User user = new User();
		Session session = DBService.initDBSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		request.getSession().setAttribute("user", user);
		ModelAndView mv = new ModelAndView("forward:/user/profile");
		return mv;
	}
	
	@RequestMapping("/profile")
	public ModelAndView getProfile(HttpServletRequest request,
			HttpServletResponse response) {
		User user = (User) request.getSession().getAttribute("user");
		ModelAndView enrollmentview = new ModelAndView("profile");
		return enrollmentview;
	}
}
