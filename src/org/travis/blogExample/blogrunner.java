package org.travis.blogExample;

import java.util.ArrayList;
import java.util.HashMap;

import org.travis.blogExample.Article.*;
import org.travis.blogExample.Comment.Comment;
import org.travis.blogExample.Comment.CommentRepoInterface;
import org.travis.blogExample.Comment.InMemoryCommentRepository;


public class blogrunner {
	
	public static void main(String[] args)
	{
		
		//represent some input view / front end stuff not important ATM.
		HashMap<String, String> inputValues = new HashMap();
		
		// repo list
		ArrayList<Article> articles = new ArrayList<>();
		
		// repo list
		ArrayList<Comment> comments = new ArrayList<>();
		
		// 
		articles.add(new Article("Title of the comment", "this is where my article", "Article"));
		articles.add(new Article("Travis Post", "this is the body", "travis poly"));
		
		ArticleRepositoryInterface articleService = 
				new InMemoryArticleRepository(articles);
		
		CommentRepoInterface commentService = 
				new InMemoryCommentRepository(comments);
		
		InputInterface input = new input();
		input.put("title", "GET MY TITLE FROM THE INPUT CLASS");
		input.put("article", "the article body was taken from the input class");
		input.put("category", "php, input, java");
		
		articles.add(new Article(input.get("title").toString(), input.get("article").toString(), input.get("category").toString()));
		
		
		
	}	
}