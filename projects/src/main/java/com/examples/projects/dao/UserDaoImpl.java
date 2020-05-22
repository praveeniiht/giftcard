package com.examples.projects.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.examples.projects.model.Buyer;
import com.examples.projects.model.GiftCardOrderDetails;


@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public List<Buyer> getAllBuyers() {
		
		 return sessionFactory.getCurrentSession().createQuery("from Buyer").getResultList();
	}

	@Override
	public int  inserUser(Buyer buyer) {
		return (int) sessionFactory.getCurrentSession().save(buyer);
		
	}

	@Override
	public int placeNewOrder(GiftCardOrderDetails giftCardOrderDetails) {
		// TODO Auto-generated method stub
		return (int) sessionFactory.getCurrentSession().save(giftCardOrderDetails);
		
	}

	@Override
	public List<GiftCardOrderDetails> getAllOrders() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from GiftCardOrderDetails").getResultList();
	}

	@Override
	public List<GiftCardOrderDetails> getAllOrdersByName(String buyerFirstName) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from GiftCardOrderDetails").getResultList();
	}

}
