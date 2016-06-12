package com.springapp.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springapp.mvc.dao.DBService;
import com.springapp.mvc.dao.UserDAO;
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
	    String userName = request.getParameter("userName");
	    String password = request.getParameter("password");
	    User user = (new UserDAO()).getUserWithName(userName, password);
	    request.getSession().setAttribute("user", user);
		ModelAndView mv = new ModelAndView("forward:/user/profile");
		return mv;
	  }

	@RequestMapping("/logOut")
	public ModelAndView logOut(HttpServletRequest request, HttpServletResponse response) {
		request.getSession().removeAttribute("user");
		ModelAndView mv = new ModelAndView("forward:/");
		return mv;
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
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		User user = new User(firstName, lastName, userName, password);
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
		request.getSession().setAttribute("user", user);
		ModelAndView profileView = new ModelAndView("profile");
		return profileView;
	}
}
