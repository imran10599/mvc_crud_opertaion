package com.imran.ashu.dao;

import java.util.List;

import com.imran.ashu.entity.Customer;

public interface CustomerDAO {

	 public List < Customer > getCustomers();

	    public void saveCustomer(Customer theCustomer);

	    public Customer getCustomer(int theId);

	    public void deleteCustomer(int theId);
}
