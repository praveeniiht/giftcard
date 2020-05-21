package com.examples.projects.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.examples.projects.model.Buyer;


@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public List<Buyer> getAllBuyers() {
		
		 return sessionFactory.getCurrentSession().createQuery("from Buyer").getResultList();
	}

	@Override
	public void inserUser(Buyer buyer) {
		sessionFactory.getCurrentSession().save(buyer);
		
	}

}
