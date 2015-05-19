package org.travis.blogExample;

import java.util.ArrayList;

import org.travis.blogExample.Article.Article;
import org.travis.blogExample.Article.InMemoryArticleRepository;
import org.travis.blogExample.Comment.Comment;
import org.travis.blogExample.Comment.InMemoryCommentRepository;

public class blogrunner {
	
	public static void main(String[] args)
	{
		//repo list
		ArrayList<Article> articles = new ArrayList<>();
		
		//repo list
		ArrayList<Comment> comments = new ArrayList<>();
		
		InMemoryArticleRepository articleService = 
				new InMemoryArticleRepository(articles);
		
		InMemoryCommentRepository commentService = 
				new InMemoryCommentRepository(comments);
		
	}	
}