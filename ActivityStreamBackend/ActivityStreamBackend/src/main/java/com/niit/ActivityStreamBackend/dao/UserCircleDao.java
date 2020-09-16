package com.niit.ActivityStreamBackend.dao;
import java.util.List;
import com.niit.ActivityStreamBackend.model.UserCircle;
public interface UserCircleDao {
	boolean addUserToCircle(String emailId, String circleName);
	boolean deleteUserfromCircle(String emailId, String circleName);
	List <String> getUsersofCircle(String circleName);
}