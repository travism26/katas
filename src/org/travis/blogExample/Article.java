package org.travis.blogExample;

public class Article {
	private int id;
	private String article;
	
	public Article(int id, String article){
		this.id = id;
		this.article = article;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getArticle()
	{
		return article;
	}

	public void setArticle(String article)
	{
		this.article = article;
	}
}
