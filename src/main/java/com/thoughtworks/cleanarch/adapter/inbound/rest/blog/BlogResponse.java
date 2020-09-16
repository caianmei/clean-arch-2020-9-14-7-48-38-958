package com.thoughtworks.cleanarch.adapter.inbound.rest.blog;

import com.thoughtworks.cleanarch.domain.context.edit.Blog;

public class BlogResponse {

	private String id;	
	private String title;
	private String content;
	
	public BlogResponse(String id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public static BlogResponse of(Blog blog) {
		return new BlogResponse(blog.getId(),blog.getTitle(),blog.getContent());
	}
}
