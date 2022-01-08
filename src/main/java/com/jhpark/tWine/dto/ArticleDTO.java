package com.jhpark.tWine.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDTO {
	private long id;
 	private String regDate;
	private String title;
	private String contents;
}
