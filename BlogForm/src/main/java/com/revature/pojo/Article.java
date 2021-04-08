package com.revature.pojo;

import java.time.LocalDate;
import java.util.Arrays;

public class Article {
	
	private int articleId;
	private String title;
	private LocalDate publishDate;
	private String content;
	public Article() {
		
		this.articleId=0;
		this.title=null;
		this.publishDate=LocalDate.now();
		this.content=null;		
	}
	public Article(int articleId, String title, LocalDate publishDate, String content) {
		super();
		this.articleId = articleId;
		this.title = title;
		this.publishDate = publishDate;
		this.content = content;
	}
	public Article(int articleId, String title, String content) {
		super();
		this.articleId = articleId;
		this.title = title;
		this.content = content;
	}
	public Article(String title, LocalDate publishDate, String content) {
		super();
		this.title = title;
		this.publishDate = publishDate;
		this.content = content;
	}
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", title=" + title + ", publishDate=" + publishDate + ", content="
				+ content + "]";
	}
	
	
	
	
	
	

}
