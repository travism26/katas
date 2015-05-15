package org.travis.blogExample;

public class Comment {
	private int id;
	private int articleId;
	private String comment;
	
	public Comment(int id, int articleId, String comment){
		this.setId(id);
		this.setArticleId(articleId);
		this.setComment(comment);
	}

	public String getComment()
	{
		return comment;
	}

	public void setComment(String comment)
	{
		this.comment = comment;
	}

	public int getArticleId()
	{
		return articleId;
	}

	public void setArticleId(int articleId)
	{
		this.articleId = articleId;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}
}
