package com.thoughtworks.cleanarch.domain.context.edit;

import com.thoughtworks.cleanarch.domain.core.concepts.DomainService;

public class BlogService implements DomainService{
	
	private BlogRepository repository;
	
	public BlogService(BlogRepository repository) {
		this.repository = repository;
	}
	
	public Blog create(String title,String content) {
		Blog blog = new Blog(title, content);		
		repository.save(blog);
		return blog;
	}
	
	public Blog getById(String id) {
		return repository.getById(id).orElseThrow(() -> new BlogNotFoundException("blog is not found"));
	}
	
	public Blog edit(String id,String title,String content){
		Blog editingBlog = repository.getById(id).orElseThrow(() -> new BlogNotFoundException("blog is not found"));
		editingBlog.saveDraft(title, content);
		repository.save(editingBlog);
		return editingBlog;
	}
}
