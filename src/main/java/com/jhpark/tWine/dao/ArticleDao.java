package com.jhpark.tWine.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.jhpark.tWine.dto.ArticleDTO;

/**Dao INTERFACE
 * Discription : @Mapper를 통해 직접 myBatis와 통신중.
 * @author jhpark
 *
 */
@Mapper // Dao의 구현체를 Mybatis가 구현해준다. DaoImpl을 삭제해도 된다. 주석 처리하겠다.
public interface ArticleDao {
	
	/**
	 * 게시물의 리스트를 반환하기 위해 선언
	 * @return
	 */
	public List<ArticleDTO> getList();

	/**
	 * 단건 게시물의 등록을 위해 선언
	 * @param param
	 */
	public void add(Map<String, Object> param);

	/**
	 * 총 게시물의 개수를 반환하기 위해 선언
	 * @return
	 */
	public int getTotCnt();

	/**
	 * 리스트 페이지에서 INSERT후 Detail페이지로 가기위해 id값을 알고 같이 가져가기 위해 선언. 
	 * @return
	 */
	public ArticleDTO getPk(long id);

	/**
	 * detail페이지에서 게시물을 삭제 위해 선언. 
	 * @return
	 */
	public void delete(long id);
	
}
