package org.travis.blogExample;

public interface CommentRepoInterface {
	
	public String getParentArticle(int ArticleId);

	public String createComment(String comment);

	public String getComment(int id);
	
	public String updateComment(int id, String updatedComment);
	
	public String deleteComment(int id);
	
}

//side notes:
//each comment belongs to a Article
//1 to many relationship. aka an article can have many comments
//AND a comment can only belong to 1 Article (not necessarily but lets keep it simple)