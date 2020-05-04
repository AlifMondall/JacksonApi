package com.ip.collections;

import org.junit.experimental.categories.Category;

public class Enquiry {

	private final Customer customer;
	private Catagory category;
	
	public Enquiry(final Customer customer,final Catagory category)
	{
		
		this.customer=customer;
		this.category=category;
	}
	public Customer getCustomer() {
		return customer;
	}
	public Catagory getCategory() {
		return category;
	}
	public String toString() {
		return "Enquiry{" + "customer='"+customer +""+ "catagory"+category;
		
	}
}
