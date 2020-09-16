package com.thoughtworks.cleanarch.adapter.inbound.rest.blog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtworks.cleanarch.application.usecase.blog.EditBlogUseCase;
import com.thoughtworks.cleanarch.application.usecase.blog.QueryBlogUseCase;
import com.thoughtworks.cleanarch.domain.context.edit.Blog;

@RestController
@RequestMapping("/blog")
public class BlogController {

	private QueryBlogUseCase queryBlogUseCase;
	private EditBlogUseCase editBlogUseCase;

	private BlogController(QueryBlogUseCase queryBlogUseCase,EditBlogUseCase editBlogUseCase) {
		this.queryBlogUseCase = queryBlogUseCase;
		this.editBlogUseCase = editBlogUseCase;
	}
	
	@GetMapping("/{id}")
	public BlogResponse get(@PathVariable String id) {
		Blog blog = queryBlogUseCase.findBlogById(id);
		return BlogResponse.of(blog);
	}
	
	@PostMapping
	public BlogResponse create(@RequestBody BlogRequest blogRequst) {
		Blog blog = editBlogUseCase.createBlog(blogRequst.getTitle(),blogRequst.getContent());
		return BlogResponse.of(blog);
	}
}
