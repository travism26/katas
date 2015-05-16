package org.travis.blogExample.Article;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.travis.blogExample.InputInterface;
import org.travis.blogExample.WriterInterface;

public class Article {
	private static final AtomicInteger count = new AtomicInteger(0);
	private int id;
	private String title;
	private String article;
	//prob best be an array of tags
	private String category;
	
	public Article(String title, String article, String category){
		this.id = count.incrementAndGet();
		this.title = title;
		this.article = article;
		this.category = category;
	}

	public int getId()
	{
		return id;
	}

	public String getArticle()
	{
		return article;
	}

	public void setArticle(String article)
	{
		this.article = article;
	}
	
	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getCategory()
	{
		return category;
	}

	public void setCategory(String category)
	{
		this.category = category;
	}

	public String postArticle(WriterInterface writing){
		return writing.writeFormat(this);
	}
	
	public void updateArticle(Article updatedArticle){
		// Validation here or nah?
		setTitle(updatedArticle.getTitle());
		setArticle(updatedArticle.getArticle());
		setCategory(updatedArticle.getCategory());
	}
	
	
	//this should not be in the model just used for testing.
	//middle layer should handle receiving the input note the innerlayer.
	public Article createArticle(InputInterface Input){
		Map<String, String> input;
		input = Input.getAll();
		String title = input.get("title");
		String article = input.get("article");
		String category = input.get("category");
		
		Article value = new Article(title, article, category);
		
		return value;
	}
}
