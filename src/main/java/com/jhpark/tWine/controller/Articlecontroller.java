package com.jhpark.tWine.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jhpark.tWine.dto.ArticleDTO;
import com.jhpark.tWine.service.ArticleService;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
public class Articlecontroller {
	
	@Autowired
	ArticleService articleService;
	
	@RequestMapping("/article/list")
	public String showList() {
		System.out.println("showListPage!!=============================");
		List<ArticleDTO> list = articleService.getList();
		
		log.info("list : "+ list);
		
		return "article/list";
	}
	
	
}
