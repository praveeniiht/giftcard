package com.examples.projects.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examples.projects.dao.UserDao;
import com.examples.projects.model.Buyer;

@Service
@Transactional
public class UserServiceImple implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<Buyer> getAllBuyers() {
		// TODO Auto-generated method stub
		return userDao.getAllBuyers();
	}

	@Override
	public void inserUser(Buyer buyer) {
		// TODO Auto-generated method stub
		userDao.inserUser(buyer);
		
	}

}
