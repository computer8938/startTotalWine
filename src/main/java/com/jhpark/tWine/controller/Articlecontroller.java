package com.jhpark.tWine.controller;


import java.util.HashMap;
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
 * Controller CLASS
 * Articlecontroller
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
		System.out.println("============== showList Start  =============================");
		List<ArticleDTO> list = articleService.getList();
		int totCnt = articleService.getTotCnt();
		
		
		model.addAttribute("list",list);
		model.addAttribute("totCnt",totCnt);
		
		//log.info("list : "+ list);
		
		
		return "article/list";
	}
	
	/**
	 * 리스트 페이지에서 INSERT후 Detail페이지로 이동하기 위해 id(PK)값과 같이 가져가기 위해 선언.
	 * @param model
	 * @param id
	 * @return (String)"article/detail"
	 */
	@RequestMapping("/article/detail")
	public String showDetail(Model model, long id) {
		System.out.println("============== showDetail Start  =============================");
		
		ArticleDTO article = articleService.getPk(id);
		model.addAttribute("article", article);
		
		return "article/detail";
	}
	
	/**
	 * article/add.jsp 페이지를 반환,
	 * @return (String) "article/add"
	 */
	@RequestMapping("/article/add")
	public String showAdd() {
		System.out.println("============== showAdd  Start  =============================");
		
		return "article/add";
	}
	/**게시물 저장 후 detail화면으로 이동.
	 * Param @RequestParam Map<String, Object> param
	 * 
	 * @return <String> (newId+params) + "text"
	 */
	@RequestMapping("/article/doAdd")
	//@ResponseBody
	public String doAdd(@RequestParam Map<String, Object> param) {
		System.out.println("============== doAdd  Start  =============================");

System.out.println("========= 매개변수 Map의 param ========="+param);
		long newId = articleService.add(param);
System.out.println("========= newId ========="+newId);
		return "redirect:/article/detail?id="+newId; 
	}
	
//	@RequestMapping("/article/doAdd")
//	@ResponseBody
//	public String doAdd(@RequestParam Map<String, Object> param) {
//		System.out.println("doAdd   =============================");
//		
//		long newId = articleService.add(param);
//		String msg = newId + "번 게시물이 추가되었습니다.";
//		StringBuilder sb = new StringBuilder();
//		sb.append("alert('" +msg+ "');" );
//		sb.append("location.replace('./detail?id=" + newId+ "');");
//		
//		sb.insert(0, "<script>");
//		sb.append("</script>");
//		
//		return sb.toString();
//	}
	
	/**
	 * detail페이지에서 게시물 삭제
	 * @param long id
	 * @return (String)"redirect:/article/list"
	 */	
	@RequestMapping("/article/doDelete")
	public String doDelete(long id) {
		System.out.println("============== doDelete  Start  =============================");

//		long newId = articleService.add(param);
		articleService.delete(id);
//		return newId + "번 게시물이 추가되었습니다.";
//		return "redirect:/article/detail?id="+newId; 
		return "redirect:/article/list"; 
	}
	
	
	
	
	
	
	
	
	/**
	 * detail페이지에서 게시물 수정 페이지로 이동
	 * @param model
	 * @param id
	 * @return (String)"article/modify"
	 */
	@RequestMapping("/article/modify")
	public String showModify(Model model, long id) {
		System.out.println("============== showModify  Start  =============================");		
		ArticleDTO article = articleService.getPk(id);

		model.addAttribute("article", article);

		return "article/modify";
	} 
	/**
	 * detail페이지에서 게시물 수정 페이지로 이동
	 * @param model
	 * @param id
	 * @return (String)"article/modify"
	 */
	@RequestMapping("/article/doModify")
	public String doModify(@RequestParam Map<String, Object> param) {
		System.out.println("============== doModify  Start  =============================");
		System.out.println("============== doModify  Start  =============================");
		System.out.println("====== param  ======>"+param);
		//====== param  ======>{id=53, title=세번째 제목(수정1-5), contents=세번째 내용(수정1-5)}
		System.out.println("========================================>");


long getId = articleService.modify(param);



System.out.println("====== getId  ======>"+getId);
System.out.println("========================================>");

//articleService.modify(param);
		
		
		return "redirect:/article/detail?id="+getId;
	}
	
}