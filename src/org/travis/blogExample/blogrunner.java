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
		
		
		//repo list
		ArrayList<Article> articles = new ArrayList<>();
		
		//repo list
		ArrayList<Comment> comments = new ArrayList<>();
		
		ArticleRepositoryInterface articleService = 
				new InMemoryArticleRepository(articles);
		
		CommentRepoInterface commentService = 
				new InMemoryCommentRepository(comments);
		
		InputInterface input = new input();
		
		
	}	
}