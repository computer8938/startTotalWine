package com.jhpark.tWine.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jhpark.tWine.dto.ArticleDTO;
import com.jhpark.tWine.service.ArticleService;

import lombok.extern.slf4j.Slf4j;


/**
 * 
 * @author jhpark
 *
 */
@Controller
@Slf4j
public class Articlecontroller {
	
	@Autowired
	ArticleService articleService;
	
	/**
	 * article/list.jsp 페이지를 반환하며 article테이블의 데이터 리스트를 반환한다.
	 * @param model
	 * @return
	 */
	@RequestMapping("/article/list")
	public String showList(Model model) {
		System.out.println("showList   =============================");
		List<ArticleDTO> list = articleService.getList();
		
		model.addAttribute("list",list);
		
		//log.info("list : "+ list);
		
		
		return "article/list";
	}
	/**
	 * article/add.jsp 페이지를 반환,
	 * @param model
	 * @return
	 */
	@RequestMapping("/article/add")
	public String showAdd() {
		System.out.println("showAdd   =============================");
		
		return "article/add";
	}
	/**
	 * @return
	 */
	@RequestMapping("/article/doAdd")
	@ResponseBody
	public String doAdd(@RequestParam Map<String, Object> param) {
		System.out.println("doAdd   =============================");
//		param.get("title");
//		param.get("contents");
//		param.put("title1", title);   
		
		articleService.add(param);
		return "게시물이 추가 되었습니다.";
	}
	
	
}
