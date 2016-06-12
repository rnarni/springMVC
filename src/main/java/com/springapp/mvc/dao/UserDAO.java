package com.springapp.mvc.dao;

import com.springapp.mvc.modal.User;
import org.hibernate.Query;

import java.util.List;

/**
 * Created by raghuramn on 6/9/16.
 */
public class UserDAO {
	public User getUserWithName(String userName, String password){

		String hql = "FROM User u WHERE u.userName = :userName";
		Query query = DBService.initDBSession().createQuery(hql);
		query.setParameter("userName", userName);
		List results = query.list();
		return (User) results.get(0);
	}
	
	public User getUserWithId(Long userId){
		User user = new User();
		return user;
	}
}
