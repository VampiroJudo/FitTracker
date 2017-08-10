package com.vampiroTech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MinuteController {
	
	@RequestMapping(value= "/addMinutes")
	public String addMinutes() {
		return "addMinutes";
	}

}
