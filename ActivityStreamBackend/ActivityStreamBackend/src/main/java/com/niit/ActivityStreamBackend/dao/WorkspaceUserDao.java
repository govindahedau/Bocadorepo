package com.niit.ActivityStreamBackend.dao;
import java.util.List;
import com.niit.ActivityStreamBackend.model.WorkspaceUser;

public interface WorkspaceUserDao {
	boolean sendInvitation(String companyName, String userEmailId);
	boolean acceptInvitation(String companyName, String userEmailId);
	boolean rejectInvitation(String companyName, String userEmailId);
	boolean removeUserFromWorkspace(String companyName, String userEmailId);

}