package com.revature.ws;

import java.util.List;

import javax.jws.WebService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.ArticleDao;
import com.revature.pojo.Article;

@Service
public class ArticleServiceImpl implements ArticleService{
	
	
	private ArticleDao articleDao;
	
	
	@Autowired
	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	@Override
	public List<Article> getAllArticles() {			
		
	return articleDao.getAllArticles();		
		
	}

	@Override
	public List<Article> getArticlesByTitle(String title) {
		
		return articleDao.getArticlesByTitle(title);
	}

	@Override
	public void addArticle(Article article) {
		
		articleDao.addArticle(article);
	}

	@Override
	public void deleteArticle(Article article) {
		if(articleDao.deleteArticle(article)) {
			System.out.println("The article is deleted..");
		}
		
	}

	@Override
	public void updateArticle(int articleId, String title, String content){
		articleDao.updateArticle(articleId,title,content);
		
	}

}
