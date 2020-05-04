package com.ip.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Supplier;

public class ProductCatalogue implements Iterable<Product> {
	
	private final Set<Product> products=new HashSet<>();
	
	public void IsSupplierBy(Supplier supplier) {
		
		products.addAll(supplier.products());
	}
	public Iterator<Product>itetator(){
		return products.iterator();
	}
	@Override
	public Iterator<Product> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
