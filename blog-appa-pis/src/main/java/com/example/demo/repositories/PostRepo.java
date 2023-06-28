package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Category;
import com.example.demo.entities.Post;
import com.example.demo.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer>{

	
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	// @Query(select p from Post where p.title like:key)
	//List<Post> findByTitle(@Param("key") String title);
	List<Post> findByTitleContaining(String title);
}
