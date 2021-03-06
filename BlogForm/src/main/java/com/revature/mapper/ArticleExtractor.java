package com.revature.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.revature.pojo.Article;

@Component
public class ArticleExtractor implements ResultSetExtractor<Article>{

	@Override
	public Article extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		//java.sql.Date publishDateSQL= rs.getDate("publish_date");
		//LocalDate publishDate = publishDateSQL.toLocalDate();
		
		Article article =new Article();
		
		article.setArticleId(rs.getInt("aricle_id"));
		article.setTitle(rs.getString("title"));//("%"+title+"%") How to use?
		article.setPublishDate("publish_date");
		article.setContent(rs.getString("content"));				
		return article;
	}

}
