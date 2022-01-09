package com.jhpark.tWine.service;


import java.util.List;
import java.util.Map;

import com.jhpark.tWine.dto.ArticleDTO;


public interface ArticleService {
	public List<ArticleDTO> getList();

	public void add(Map<String, Object> param);
}
