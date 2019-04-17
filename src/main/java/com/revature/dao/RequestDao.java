package com.revature.dao;

import java.util.List;

import com.revature.model.Request;

public interface RequestDao {

	List<Request> getAllRequests();
	Request getRequestById(int id);
	Request createRequest(Request request);
	Request updateRequest(Request toBeUpdated);
	long deleteRequest(Request... toBeDeleted);
	
}
