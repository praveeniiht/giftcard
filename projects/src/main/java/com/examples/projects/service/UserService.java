package com.examples.projects.service;

import java.util.List;

import com.examples.projects.model.Buyer;

public interface UserService {
public List<Buyer> getAllBuyers();
public void inserUser(Buyer buyer);
}
