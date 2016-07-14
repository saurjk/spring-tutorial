package com.test.spring.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.spring.web.dao.Offer;
import com.test.spring.web.service.OffersService;

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

	private OffersService offersService;

	@Autowired
	public void setOffersService(OffersService offersService) {
		this.offersService = offersService;
	}

	@RequestMapping("/")
	public String showHome(Model model) {

		List<Offer> offers = offersService.getCurrent();
		model.addAttribute("offers", offers);

		return "home";
	}
}
