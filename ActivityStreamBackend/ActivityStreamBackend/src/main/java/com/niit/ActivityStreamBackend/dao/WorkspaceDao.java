package com.niit.ActivityStreamBackend.dao;
import java.util.List;

import com.niit.ActivityStreamBackend.model.Workspace;

public interface WorkspaceDao {
       boolean createWorkspace(Workspace workspace); 
       List<Workspace> getWorkspaceByAdminEmailId (String emailId);
       
}