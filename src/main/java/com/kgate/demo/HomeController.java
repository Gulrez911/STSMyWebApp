package com.kgate.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("home")

	public ModelAndView home(Student student) {

		ModelAndView view = new ModelAndView();
		view.addObject("obj", student);

		return view;
	}
}
