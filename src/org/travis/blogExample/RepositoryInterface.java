package org.travis.blogExample;

interface RepositoryInterface {
	
	public String getArticle(int id);
	
	public String updateArticle(int id, String article);
	
	public String deleteArticle(int id, String article);
	
	public String createArticle(int id, String article);
	
}
