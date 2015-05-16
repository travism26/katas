package org.travis.blogExample.Article;

import java.util.ArrayList;
import java.util.Iterator;

import org.travis.blogExample.Comment.Comment;

public class InMemoryArticleRepository implements ArticleRepositoryInterface {

	ArrayList<Article> articles;

	public InMemoryArticleRepository(ArrayList<Article> articles)
	{
		this.articles = articles;
	}

	@Override
	public Article getArticle(int id)
	{
		Article value = articles.get(id);
		return value;
	}

	@Override
	public void updateArticle(int id, Article updatedArticle)
	{
		if (isFound(id))
		{
			articles.get(id).updateArticle(updatedArticle);
		}
	}

	@Override
	public void deleteArticle(int id)
	{
		if (isFound(id))
		{
			articles.remove(findArticle(id));
		}
	}

	/*
	 * for my input i would like to have something similar to Laravel's Input
	 * class Input->getAll(); this would return a Map / Associative array of all
	 * my inputs. or if i wanted to get a specific input Input->get('username')
	 * this would only return the username.
	 */
	@Override
	public void createArticle(Article article)
	{
		// articles.
		articles.add(article);
	}

	@Override
	public Comment getComments(int articleId)
	{
		// TODO Auto-generated method stub
		return null;
	}

	// find where in the repo the article is.
	public int findArticle(int id)
	{
		for (Iterator iterator = articles.iterator(); iterator.hasNext();)
		{
			Article item = (Article) iterator.next();
			if (item.getId() == id)
			{
				return articles.indexOf(item);
			}
		}
		// THROW SOME EXCEPTION ITEM NOT FOUND.
		return -1;
	}

	public boolean isFound(int id)
	{
		if (findArticle(id) == -1)
		{
			return false;
		}
		return true;
	}

}
