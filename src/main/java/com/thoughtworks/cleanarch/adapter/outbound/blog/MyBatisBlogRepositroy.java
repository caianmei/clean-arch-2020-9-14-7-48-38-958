package com.thoughtworks.cleanarch.adapter.outbound.blog;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.thoughtworks.cleanarch.domain.context.edit.Blog;
import com.thoughtworks.cleanarch.domain.context.edit.BlogRepository;
import com.thoughtworks.cleanarch.domain.context.edit.HistroyBlog;

@Repository
public class MyBatisBlogRepositroy implements BlogRepository{

	@Autowired
	private BlogMapper blogMapper;
	
	@Override
	public void save(Blog blog) {
		List<HistroyBlog> histroyBlogs = blog.getHistroyBlogs();
		//插入历史记录数据
		//插入博客信息
		blogMapper.save(blog);		
	}

	@Override
	public Optional<Blog> getById(String id) {
		return Optional.of(blogMapper.getById(id).to());
	}

}
