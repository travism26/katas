package org.travis.blogExample.Article;

import org.travis.blogExample.Comment.Comment;

public interface ArticleRepositoryInterface {
	
	public Article getArticle(int id);
	
	public void updateArticle(int id, Article updatedArticle);
	
	public void deleteArticle(int id);
	
	public void createArticle(Article article);
	
	public Comment getComments(int articleId);
	
}
