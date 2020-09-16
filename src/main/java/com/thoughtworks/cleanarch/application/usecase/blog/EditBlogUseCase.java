package com.thoughtworks.cleanarch.application.usecase.blog;

import org.springframework.stereotype.Component;

import com.thoughtworks.cleanarch.application.concepts.UseCase;
import com.thoughtworks.cleanarch.domain.context.edit.Blog;
import com.thoughtworks.cleanarch.domain.context.edit.BlogRepository;
import com.thoughtworks.cleanarch.domain.context.edit.BlogService;

@Component
public class EditBlogUseCase implements UseCase {

	private BlogService blogService;
	
	public EditBlogUseCase(BlogRepository repository) {
		this.blogService = new BlogService(repository);
	}
	
	public Blog	editBlog(String id,String title,String content) {
		return blogService.edit(id, title, content);
	}

	public Blog createBlog(String title, String content) {
		return blogService.create(title, content);
	}
}
