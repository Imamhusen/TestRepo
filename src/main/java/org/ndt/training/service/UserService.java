package org.ndt.training.service;

//import java.util.List;

import java.util.List;

import org.ndt.training.beans.User;
import org.ndt.training.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
@Service
public class UserService {

	@Autowired  
	 private UserDAO userDao;  
	   
	   
	 public void addUser(User user) {  
	  userDao.insert(user);  

	 }
	 
	public List<User> listusers() {  
		  return userDao.getUserList();  
		}  
}
