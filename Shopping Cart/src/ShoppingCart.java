/* Project:  Project 1
 Class:    ShoppingCart.java
 * Author:   Navdeep Kaur
 * Date:     March 3, 2021
 * This class stores information about the overall order. 
 */ 

import java.util.ArrayList;

public class ShoppingCart {
	 ArrayList<ItemOrder> sCart = new ArrayList<ItemOrder>();
	 private double discount = 1.0;
	
	//---------------------------------------------------------------
	// A constructor that creates an empty list of item orders. 
	public ShoppingCart() {
		sCart = new ArrayList<ItemOrder>();
	}

	//---------------------------------------------------------------
	// This method adds an item order to the list, replacing any previous order for this item with the new order.
	public void add(ItemOrder itemOrder) {
		sCart.add(itemOrder);
		
		for(int i = 0; i < sCart.size() - 1 ; i++) {
			if(itemOrder.getItem() == (sCart.get(i).getItem())) {
				sCart.remove(i);
			}
		}
	}
	
	//---------------------------------------------------------------
	// This method sets whether or not this order gets a discount.
	public void setDiscount(boolean value) {
		if(value == true) {
			discount = 0.9;
			
			}
		if (value == false) {
			discount = 1.0;
		}
	} 
	
	//---------------------------------------------------------------
	//  This returns the total cost of the shopping cart.
	
	 public double getTotal() {
	       double total = 0;
	       for (ItemOrder order : sCart) {
	           total += order.getPrice();
	       }
	       return total * discount;
	   }
}