package com.jhpark.tWine.service;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhpark.tWine.dao.ArticleDao;
import com.jhpark.tWine.dto.ArticleDTO;

/**
 * INTERFACE - ArticleService의 구현체 클래스.
 * @author jhpark
 *
 */
@Service
public class ArticleServiceImpl implements ArticleService {
	
	@Autowired
	ArticleDao articleDao;
	// 2자적 본론으로, ArticleService에서 데이터 관련은 모두 Dao에서 처리하자

	/*
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
	/**
	 * Title : 모든 List 가져오기 위해 Overriding(구현).
	 * Discription :리스트 전체를 반환한다.
	 * @return articleDao.getList();
	 */
	@Override
	public List<ArticleDTO> getList(){
		return articleDao.getList();
	}
	
	/**
	 * Title : 단건 데이터 입력을 위해 Overriding(구현).
	 * Discription : 1. 처음엔 id값을 반환하지 않았다(void)
	 *  			 2. id값을 반환하기 위해 long타입으로 선언.
	 *  			 3. id값을 String에 담고 long으로 바꿔 반환.
	 * @return (long)newId
	 */
	@Override
	public long add(Map<String, Object> param) {
		articleDao.add(param);
		
		long newId = Integer.parseInt(String.valueOf(param.get("id")));
		
//		BigInteger bigIntId = (BigInteger)param.get("id"); 
//		long newId = bigIntId.longValue();
		return newId;
	}

	/**
	 * Title : 리스트 페이지에서 게시물 개수 반환을 위해 Overriding(구현).
	 * Discription : 
	 * @return articleDao.getTotCnt();
	 */
	@Override
	public int getTotCnt() {
		return articleDao.getTotCnt();
	}
	
	/**
	 * Title : 리스트 페이지에서 INSERT후 Detail페이지로 가기위해 id값을 알고 같이 가져가기 위해 Overriding(구현).
	 * Discription : 
	 * @return articleDao.getId();
	 */
	@Override
	public ArticleDTO getPk(long id) {
		return articleDao.getPk(id);
	}
	
	/**
	 * Title : detail페이지에서 게시물을 삭제하기 위해 Overriding(구현).
	 * Discription : 
	 * @return articleDao.delete(id);
	 */
	@Override
	public void delete(long id) {
		articleDao.delete(id);
	}
	 
	/**
	 * Title : modify페이지에서 게시물을 수정하기 위해 Overriding(구현).
	 * Discription : 
	 * @return articleDao.modify(param);
	 */
	@Override
	public long modify(Map<String, Object> param) {
		System.out.println("==========  ServiceImpl param =========="+param);
		
		long getId = Integer.parseInt(String.valueOf(param.get("id")));
		articleDao.modify(param);
		
		return getId;
	}
	//상세 페이지 노출시 1씩 카운트 증가.
	@Override
	public void detailHitUp(long id) {
		articleDao.detailHitUp(id);
	}
	
}