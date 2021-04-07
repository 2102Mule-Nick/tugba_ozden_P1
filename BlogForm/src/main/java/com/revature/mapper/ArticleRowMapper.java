package com.revature.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.revature.pojo.Article;

@Component
public class ArticleRowMapper implements RowMapper<Article>{
	
	private ArticleExtractor  articleExtractor;
	
	@Autowired
	public void setArticleExtractor(ArticleExtractor articleExtractor) {
		this.articleExtractor = articleExtractor;
	}

	@Override
	public Article mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		return articleExtractor.extractData(rs);
		
	}
	
	
	

}
