package com.jhpark.tWine.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.jhpark.tWine.dto.ArticleDTO;

@Mapper // Dao의 구현체를 Mybatis가 구현해준다. DaoImpl을 삭제해도 된다. 주석 처리하겠다.
public interface ArticleDao {
	public List<ArticleDTO> getList();

	public void add(Map<String, Object> param);
	
}
