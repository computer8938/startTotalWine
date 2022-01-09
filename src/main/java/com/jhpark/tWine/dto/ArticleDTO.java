package com.jhpark.tWine.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO클래스
 * usingTableName : article
 * Discription : article의 Entity를 선언하고, 
 * 				 이 것들을 접근권한자 depth에 맞게 의존성을 주입받아서 사용되게 함.
 * @author jhpark
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDTO {
	private long id;
 	private String regDate;
	private String title;
	private String contents;
}
