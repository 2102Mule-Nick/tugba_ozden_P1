package com.revature.dao;

import java.util.List;

import com.revature.pojo.Article;

public interface ArticleDao {
	
	public List<Article> getAllArticles();
	
	public List<Article> getArticlesByTitle(String title);
	
	public void addArticle(Article article);
	
	public boolean deleteArticle(Article article);	
	
	public void updateArticle(Article article);

}
