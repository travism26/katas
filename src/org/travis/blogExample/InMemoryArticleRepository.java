package org.travis.blogExample;

import java.util.Map;

public class InMemoryArticleRepository implements ArticleRepositoryInterface {
	
	Map<Integer, String> articles;
			
	public InMemoryArticleRepository(Map<Integer, String> articles)
	{
		this.articles = articles;
	}
	@Override
	public String getArticle(int id)
	{
		String value = articles.get(id);
		return value;
	}

	@Override
	public boolean updateArticle(int id, String article)
	{
		if(containsKey(id)){
			articles.put(id, article);
			return true;
		}
		return false;
	}

	@Override
	public void deleteArticle(int id)
	{
		if(containsKey(id))
			articles.remove(id);
		else
			System.out.print("ARTICLE DOES NOT EXIST");
		
	}

	@Override
	public String createArticle(String article)
	{
		//articles.
		return null;
	}

	@Override
	public String getComments(int articleId)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean containsKey(int key){
		if(articles.containsKey(key)){
			return true;
		}
		return false;
	}
	
}
