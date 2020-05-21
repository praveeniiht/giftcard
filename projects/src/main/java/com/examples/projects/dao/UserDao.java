package com.examples.projects.dao;

import java.util.List;

import com.examples.projects.model.Buyer;

public interface UserDao {
	public List<Buyer> getAllBuyers();
	public void inserUser(Buyer buyer);
}
