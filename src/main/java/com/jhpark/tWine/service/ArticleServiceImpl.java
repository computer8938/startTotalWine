package com.jhpark.tWine.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jhpark.tWine.dto.ArticleDTO;

@Service
public class ArticleServiceImpl implements ArticleService {
	public List<ArticleDTO> getList(){
		//1차적으로, DB에서 데이터를 가져오지 말고 가짜데이터를 뿌려본다.
		ArticleDTO article1 = new ArticleDTO(1, "2022-01-09 03:12:40", "제목1", "내용1");
		ArticleDTO article2 = new ArticleDTO(2, "2022-01-09 03:12:40", "제목2", "내용2");
		ArticleDTO article3 = new ArticleDTO(3, "2022-01-09 03:12:40", "제목3", "내용3");
		
		
		List<ArticleDTO> list = new ArrayList<>();
		list.add(article1);
		list.add(article2);
		list.add(article3);
		
		return list;
	}
}
