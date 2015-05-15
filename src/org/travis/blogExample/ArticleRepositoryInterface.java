package org.travis.blogExample;

interface ArticleRepositoryInterface {
	
	public String getArticle(int id);
	
	public boolean updateArticle(int id, String updatedArticle);
	
	public void deleteArticle(int id);
	
	public String createArticle(String article);
	
	public String getComments(int articleId);
	
}
