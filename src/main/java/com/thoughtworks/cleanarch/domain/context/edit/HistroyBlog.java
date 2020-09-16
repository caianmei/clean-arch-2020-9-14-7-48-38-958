package com.thoughtworks.cleanarch.domain.context.edit;

import java.util.Date;

import com.thoughtworks.cleanarch.domain.core.concepts.ValueObject;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HistroyBlog implements ValueObject{

	private String blogId;	
	private String title;
	private String content;
	private Date updateTime;	
	
	public HistroyBlog(String blogId, String title, String content, Date date) {
		this.blogId = blogId;
		this.title = title;
		this.content = content;
		this.updateTime =date;
	}

}
