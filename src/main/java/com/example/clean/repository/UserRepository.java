package com.example.clean.repository;

import com.example.clean.entity.User;

public interface UserRepository {

	void insert(User user);
	
	User selectByUserId(String userId);

}
