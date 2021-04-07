package com.revature.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.revature.mapper.ArticleRowMapper;
import com.revature.pojo.Article;

@Repository
public class ArticleDaoJDBC implements ArticleDao{
	
	private JdbcTemplate jdbcTemplate;
	
	private ArticleRowMapper articleRowMapper;
	
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Autowired
	public void setArticleRowMapper(ArticleRowMapper articleRowMapper) {
		this.articleRowMapper = articleRowMapper;
	}

	@Override
	public List<Article> getAllArticles() {
		
		String sql="select aricle_id, title, publish_date from article";
		
		List<Article> articleList=jdbcTemplate.query(sql, articleRowMapper);
		
		return articleList;
	}

	@Override
	public List<Article> getArticlesByTitle(String title) {
		
		String sql="select aricle_id, title, publish_date from article where title like ?";
		
		List<Article> list=this.jdbcTemplate.query(sql, articleRowMapper, title);
		
		return list;
	}

	@Override
	public boolean addArticle(Article article) {
		
		return false;
	}

	@Override
	public boolean deleteArticleById(int id) {
		
		return false;
	}

	@Override
	public boolean updateArticle(Article article) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
