package com.jhpark.tWine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Homecontroller {
	@RequestMapping("/home/main")
	@ResponseBody
	public String showMain() {
		System.out.println("showMainPage!!");
		return "메인화면";
	}
	
	
}
