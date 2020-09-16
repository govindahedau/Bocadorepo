package com.niit.ActivityStreamBackend.dao;
import com.niit.ActivityStreamBackend.model.User;

import java.util.List;

public interface UserDao {
	public boolean save(User user);
	public boolean update(User user);
	public User get(String id);
	public List<User> list();
	public User validate(String id, String password);
}