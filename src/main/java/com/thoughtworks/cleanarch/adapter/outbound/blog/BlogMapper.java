package com.thoughtworks.cleanarch.adapter.outbound.blog;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.thoughtworks.cleanarch.domain.context.edit.Blog;

@Mapper
public interface BlogMapper {

	@Insert("insert into blog values (#{blog.id},#{blog.title},#{blog.content})")
	void save(@Param("blog")Blog blog);

	@Select("select * from blog where id = #{id}")
	BlogPO getById(@Param("blog")String id);

	
}
