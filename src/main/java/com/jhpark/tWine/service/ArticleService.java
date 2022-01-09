package com.jhpark.tWine.service;


import java.util.List;
import java.util.Map;

import com.jhpark.tWine.dto.ArticleDTO;


/**
 * Service INTERFACE
 * 
 * @author jhpark
 *
 */
public interface ArticleService {
	
	/**
	 * Title : List 가져오기 위해 선언.
	 * Discription :현재 리스트 전체를 반환한다.
	 * @return
	 */
	public List<ArticleDTO> getList();

	/**
	 * Title : 단건 데이터 입력을 위해 선언
	 * Discription : 1. 처음엔 id값을 반환시키지 않았다(void)
	 *  			 2. id값을 반환하기 위해 long타입의 규격으로 선언.
	 * @return
	 */
	//public void add(Map<String, Object> param);
	public long add(Map<String, Object> param);

	/**
	 * Title : 리스트 페이지에서 게시물 개수 반환을 위해 선언
	 * Discription : 
	 * @return
	 */
	public int getTotCnt();
}
