package com.revature.ws;
 
   import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.revature.pojo.Article;
    
    
 	@WebService
	public interface ArticleService {
	 
	 
	@WebMethod
	public List<Article> getAllArticles();
	
	@WebMethod
	public List<Article> getArticlesByTitle(String title);
	
	@WebMethod
	public void addArticle(Article article);

	@WebMethod
	public void deleteArticle(Article article);
	
	@WebMethod
	public void updateArticle(Article article);

}
