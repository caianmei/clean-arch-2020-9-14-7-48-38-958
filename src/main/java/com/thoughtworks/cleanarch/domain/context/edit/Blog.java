package com.thoughtworks.cleanarch.domain.context.edit;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.thoughtworks.cleanarch.domain.core.concepts.AggregateRoot;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Blog implements AggregateRoot{

	private String id;	
	private String title;
	private String content;
	private List<HistroyBlog> histroyBlogs;
	
	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public List<HistroyBlog> getHistroyBlogs() {
		return histroyBlogs;
	}

	public Blog(String title,String content) {
		this.id = UUID.randomUUID().toString();
		this.title = title;
		this.content = content;		
	}
	
	public Blog(String id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;	
	}

	public void saveDraft(String title,String content) {
		this.content = content;
		this.title = title;
		HistroyBlog histroyBlog = new HistroyBlog(this.id,title,content,new Date());
		this.histroyBlogs.add(histroyBlog);		
	}
	
	
}
