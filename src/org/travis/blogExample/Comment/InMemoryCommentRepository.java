package org.travis.blogExample.Comment;

import java.util.ArrayList;

public class InMemoryCommentRepository implements CommentRepoInterface {

	ArrayList<Comment> comments;

	public InMemoryCommentRepository(ArrayList<Comment> comments)
	{
		this.comments = comments;
	}

	@Override
	public void createComment(int id)
	{
		
	}

	@Override
	public Comment getComment(int id)
	{
		
		return null;
	}

	@Override
	public void updateComment(int id, String updatedComment)
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteComment(int id)
	{
		// TODO Auto-generated method stub
	}

	@Override
	public String getParentArticle(int ArticleId)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
