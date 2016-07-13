package com.test.spring.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OffersController {

	// @RequestMapping("/")
	// public ModelAndView showHome(){ //HttpSession httpSession) {
	//
	//// httpSession.setAttribute("name", "Jack");
	//
	// ModelAndView view = new ModelAndView("home");
	//
	// Map<String, Object> model = view.getModel();
	//
	// model.put("name", "John");
	//
	// return view;
	// }

	@RequestMapping("/")
	public String showHome(Model model) {

		model.addAttribute("name", "<b>Kage</b>");

		return "home";
	}
}
