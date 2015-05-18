package org.travis.blogExample;

import java.time.LocalTime;
import java.util.ArrayList;

import org.travis.blogExample.Article.Article;
import org.travis.blogExample.Comment.Comment;

import org.travis.build.*;
//import org.joda.time.LocalTime;
public class blogrunner {
	
	public static void main(String[] args)
	{
		ArrayList<Article> articles;
		ArrayList<Comment> comments;
		LocalTime currentTime = new LocalTime();
	    System.out.println("The current local time is: " + currentTime);

	    Greeter greeter = new Greeter();
	    System.out.println(greeter.sayHello());
		//DataFactory df = new DataFactory();  
		//Populator populator = new PopulatorBuilder().build();
		//Person person = populator.populateBean(Person.class);
	}	
}
/*
 * I HATE GRADLE :(
 */
class Greeter{
	
	public String sayHello(){
		return "Hello";
	}
}
