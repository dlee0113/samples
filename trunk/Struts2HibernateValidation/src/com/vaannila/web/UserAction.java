package com.vaannila.web;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.Valid;

import com.opensymphony.xwork2.ActionSupport;
import com.vaannila.dao.UserDAO;
import com.vaannila.dao.UserDAOImpl;
import com.vaannila.domain.User;

public class UserAction extends ActionSupport {

	private static final long serialVersionUID = -6659925652584240539L;

	@Valid
	private User user;
	private List<User> userList = new ArrayList<User>();
	private UserDAO userDAO = new UserDAOImpl();
		
	public String add()
	{		
		userDAO.saveUser(user);
		return SUCCESS;
	}
	
	public String list()
	{
		userList = userDAO.listUser();
		return SUCCESS;
	}
		
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

}
