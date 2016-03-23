package org.ndt.training.dao;

//import java.util.List;

import java.util.List;

import org.ndt.training.beans.User;

public interface UserDAO {
	public boolean insert(User u);

	public List<User> getUserList();

	

}
