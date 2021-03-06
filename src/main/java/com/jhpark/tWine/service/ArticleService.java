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

	/**
	 * Title : 리스트 페이지에서 INSERT후 Detail페이지로 이동하기 위해 id(PK)값을 알고 같이 가져가기 위해 선언 
	 * Discription : 
	 * @return
	 */
	public ArticleDTO getPk(long id);

	/**
	 * Title : detail페이지에서 게시물을 삭제
	 * Discription : 
	 * @return
	 */
	public void delete(long id);


	

	/**
	 * Title : modify페이지에서 게시물을 수정
	 * Discription : 
	 * @return
	 */
	public long modify(Map<String, Object> param);

	//상세 페이지 노출시 1씩 카운트 증가.
	public void detailHitUp(long id);
}
