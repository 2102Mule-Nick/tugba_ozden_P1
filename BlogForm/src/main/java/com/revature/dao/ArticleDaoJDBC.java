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
		
		String sql="select * from article";
		
		List<Article> articleList=jdbcTemplate.query(sql, articleRowMapper);
		
		return articleList;
	}

	@Override
	public List<Article> getArticlesByTitle(String title) {
		
		String sql="select * from article where title like ?";
		
		List<Article> list=this.jdbcTemplate.query(sql, articleRowMapper, title);
		
		return list;
	}
	
	/*
	 * 
	 * String query = "insert into employee(first_name, last_name, email, phone, hiredate,job_id,department_id)values(?,?,?,?,?,?,?)";
		// jdbcTemplate.update(query, employeeRowMapper);

		this.jdbcTemplate.update(query,
				new Object[] { employee.getFirstName(), employee.getLastName(), employee.getEmail(),
						employee.getPhoneNumber(), employee.getHireDate(), employee.getJobId(),
						employee.getDepartmentId() });*/

	@Override
	public void addArticle(Article article) {
		
		String sql="insert into article(title, publish_date,content) values (?,?,?)";
		
		this.jdbcTemplate.update(sql,
				
				new Object[] {article.getTitle(),article.getPublishDate(),article.getContent()}
				);	
		
		System.out.println("The article is added.");
		
	}	
	

	@Override
	public boolean deleteArticle(Article article) {
		
		String sql = "delete from article where aricle_id=?";

		if (this.jdbcTemplate.update(sql,article.getArticleId() ) == 0) {
			return false;
		}

		return true;
		
		
	}
	
	/*
	 * @Override
	public boolean updateItemStatus(int itemId, boolean discontinued) {

		String sql = "update item set discontinued = ? where product_id = ?";

		if (jdbcTemplate.update(sql, discontinued, itemId) == 0) {
			return false;
		}

		return true;
	}
	 * 
	 * */

	@Override
	public void updateArticle(int articleId, String title, String content) {
		String sql = "update article set title=?, publis_date=?, content=? where aricle_id=? ";

		if(this.jdbcTemplate.update(sql, articleId,title, content)==0) {
			
			System.out.println("Something went wrong.");
		}

		// this.jdbcTemplate.up;
		System.out.println("Article content updated.");
		
	}
	
	

}
