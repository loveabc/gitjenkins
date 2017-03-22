package com.imooc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ProcessMessageController {

	@RequestMapping("/index")
	public ModelAndView getIndex(ModelAndView mad) {
		System.out.println("...");
		mad.setViewName("index");
		return mad;
	}

}
