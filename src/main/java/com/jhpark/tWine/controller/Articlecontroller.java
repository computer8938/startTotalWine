package com.jhpark.tWine.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Articlecontroller {
	
	@RequestMapping("/article/list")
	public String showList() {
		System.out.println("showListPage!!");
		return "article/list";
	}
	
	
}
