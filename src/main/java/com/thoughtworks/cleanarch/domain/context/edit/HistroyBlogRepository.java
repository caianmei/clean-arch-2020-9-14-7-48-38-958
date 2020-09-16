package com.thoughtworks.cleanarch.domain.context.edit;

import java.util.List;
import java.util.Optional;

public interface HistroyBlogRepository {

	void save(HistroyBlog historyBlog);
	
	Optional<List<HistroyBlog>> getById(String blogId);

}
