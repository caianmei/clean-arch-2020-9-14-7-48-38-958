package com.thoughtworks.cleanarch.application.usecase.blog;

import org.springframework.stereotype.Component;

import com.thoughtworks.cleanarch.application.concepts.UseCase;
import com.thoughtworks.cleanarch.domain.context.edit.Blog;
import com.thoughtworks.cleanarch.domain.context.edit.BlogRepository;
import com.thoughtworks.cleanarch.domain.context.edit.BlogService;

@Component
public class QueryBlogUseCase implements UseCase {
	
	private	BlogService blogService;
	
	public QueryBlogUseCase(BlogRepository repository) {
		this.blogService = new BlogService(repository);
	}
	
	public Blog findBlogById(String id) {		
		return blogService.getById(id);
	}
}
