package com.niit.ActivityStreamBackend.dao;
import java.util.List;

import com.niit.ActivityStreamBackend.model.Circle;

public interface CircleDao {
	boolean addCircle(Circle circle);
	boolean deleteCircle(String emailId, String circleName);
	List <Circle> getAllCircles();
	List <Circle> getCircleByUser(String emailId);
	Circle getCircleByName(String CircleName);
}