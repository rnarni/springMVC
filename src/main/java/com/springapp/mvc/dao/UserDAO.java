package com.springapp.mvc.dao;

import com.springapp.mvc.modal.User;

/**
 * Created by raghuramn on 6/9/16.
 */
public class UserDAO {
	public User getUserWithName(String userName, String password){
		User user = new User();
		return user;
	}
	
	public User getUserWithId(Long userId){
		User user = new User();
		return user;
	}
}
