package com.niit.ActivityStreamBackend.dao;
import java.util.List;

import com.niit.ActivityStreamBackend.model.Message;

public interface MessageDao {
	boolean sendMessage(Message message);
	List<Message> getMyMessages(String emailId);

}