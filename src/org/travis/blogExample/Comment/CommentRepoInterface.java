package org.travis.blogExample.Comment;

public interface CommentRepoInterface {
	
	public String getParentArticle(int ArticleId);

	public Comment getComment(int id);

	public void createComment(int id);
	
	public void updateComment(int id, String updatedComment);
	
	public void deleteComment(int id);
	
}

//side notes:
//each comment belongs to a Article
//1 to many relationship. aka an article can have many comments
//AND a comment can only belong to 1 Article (not necessarily but lets keep it simple)