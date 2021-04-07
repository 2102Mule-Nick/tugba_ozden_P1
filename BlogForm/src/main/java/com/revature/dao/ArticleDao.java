package com.revature.dao;

import java.util.List;

import com.revature.pojo.Article;

public interface ArticleDao {
	
	public List<Article> getAllArticles();
	
	public List<Article> getArticlesByTitle(String title);
	
	public boolean addArticle(Article article);
	
	public boolean deleteArticleById(int id);	
	
	public boolean updateArticle(Article article);

}
