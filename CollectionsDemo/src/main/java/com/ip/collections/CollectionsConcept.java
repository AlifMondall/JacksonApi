package com.ip.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsConcept { 

	public static void main(String[] args) {
		
		Product door=new Product("Wooden Door",35);
		Product floorPanel=new Product("floor Panel",25);
		Product window= new Product ("Glass Window",10);
		
		Collection<Product>products=new ArrayList<>();
		
		products.add(door);
		products.add(floorPanel);
		products.add(window);
		
		//System.out.println(products);
		
		final Iterator <Product>productIterator=products.iterator();
		while(productIterator.hasNext()) {
			Product product=productIterator.next();
			System.out.println(product);
		}
		System.out.println(products.size());
		System.out.println(products.isEmpty());
		System.out.println(products.contains(window));
		
		
		Collection<Product> otherProduct=new ArrayList<>();
		
		otherProduct.add(window);
		otherProduct.add(door);
		
		products.removeAll(otherProduct);
		products.remove(window);
		System.out.println(otherProduct);

	}

}
