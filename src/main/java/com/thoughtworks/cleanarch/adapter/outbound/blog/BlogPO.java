package com.thoughtworks.cleanarch.adapter.outbound.blog;

import com.thoughtworks.cleanarch.domain.context.edit.Blog;

public class BlogPO {

	private String id;	
	private String title;
	private String content;
	
	public Blog to() {
		return new Blog(id,title, content);
	}
}
