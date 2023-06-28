package com.example.demo.services;

import java.util.List;

import com.example.demo.payloads.PostDto;
import com.example.demo.payloads.PostResponse;

public interface PostService {

	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

	PostDto updatePost(PostDto postDto, Integer id);

	void deletePost(Integer id);

	PostResponse getAllPosts(Integer pageNumber, Integer pazeSize, String sortBy, String sortDir);

	PostDto getPostById(Integer postId);

	List<PostDto> getPostsByCategory(Integer catId);

	List<PostDto> getPostsByUser(Integer userId);
	
	// search post
	List<PostDto> searchPosts(String keyword);

}
