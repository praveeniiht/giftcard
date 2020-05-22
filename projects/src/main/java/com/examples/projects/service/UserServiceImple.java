package com.examples.projects.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examples.projects.dao.UserDao;

import com.examples.projects.model.Buyer;
import com.examples.projects.model.GiftCardOrderDetails;

@Service
@Transactional
public class UserServiceImple implements UserService{
	
	@Autowired
	private UserDao userDao;

	
	@Override
	public List<Buyer> getAllBuyers() {
		// TODO Auto-generated method stub
		return userDao.getAllBuyers();
	}

	@Override
	public int inserUser(Buyer buyer) {
		// TODO Auto-generated method stub
		return userDao.inserUser(buyer);
		
	}

	@Override
	public int  placeNewOrder(GiftCardOrderDetails giftCardOrderDetails) {
		// TODO Auto-generated method stub
		return userDao.placeNewOrder(giftCardOrderDetails);
		
	}

	@Override
	public List<GiftCardOrderDetails> getAllOrders() {
		// TODO Auto-generated method stub
		return userDao.getAllOrders();
	}

	@Override
	public List<GiftCardOrderDetails> getAllOrdersByName(String buyerFirstName) {
		// TODO Auto-generated method stub
		return userDao.getAllOrdersByName(buyerFirstName);
	}

}
