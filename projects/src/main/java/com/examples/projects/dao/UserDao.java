package com.examples.projects.dao;

import java.util.List;

import com.examples.projects.model.Buyer;
import com.examples.projects.model.GiftCardOrderDetails;

public interface UserDao {
	public List<Buyer> getAllBuyers();
	public int inserUser(Buyer buyer);
	public int placeNewOrder(GiftCardOrderDetails giftCardOrderDetails);
	public List<GiftCardOrderDetails> getAllOrders();
	public List<GiftCardOrderDetails> getAllOrdersByName(String buyerFirstName);
}
