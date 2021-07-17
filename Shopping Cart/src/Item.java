/* Project:  Project 1
 * Class:    Item.java
 * Author:   Navdeep Kaur
 * Date:     March 3, 2021
 * This class stores information about the individual items. 
 */ 

import java.text.*;

public class Item {
	private String name;
	private double price;
	private int bulkQuantity;
	private double bulkPrice;
	
	//---------------------------------------------------------------
	// A constructor that takes a name and a price as arguments.  
	public Item (String name, double price) {
		this.name = name;
		this.price = price;
		
		if(this.price < 0) {
			throw new IllegalArgumentException(" No negative is acceptable ");
		}
		}
	
	//---------------------------------------------------------------
	// A constructor that takes name, a single-item price,a bulk quantity, and a bulk price as arguments.
	public Item(String name, double price, int bulkQuantity, double bulkPrice ) {
		this.name = name;
		this.price = price;
		this.bulkQuantity = bulkQuantity;
		this.bulkPrice = bulkPrice;
		
		if(this.price < 0 || this.bulkQuantity < 0 || this.bulkPrice < 0) {
			throw new IllegalArgumentException(" No negative is acceptable ");
		}
		}
	
	//---------------------------------------------------------------
	// This returns the price for a given quantity of the item. 
	public double priceFor(int quantity) {
	       
	       int remainingItems;
	       int amountofBulk;
	       
	       if(bulkQuantity > 0) {
	    	  
	    	   if(quantity == bulkQuantity) {
	    		   price = bulkPrice/quantity;
	    		   return price * quantity;
	    		   
	    	   }
	    	  else if (quantity > bulkQuantity) {
	    		   remainingItems  = quantity % bulkQuantity;
	    		   amountofBulk = (quantity - remainingItems) / bulkQuantity;
	    		   return bulkPrice * amountofBulk + (price * remainingItems);
	    		  }
	    	   }
	       
	       return price * quantity ;
	       
	  
		}

	//---------------------------------------------------------------
	// This returns a String representation of this item. 
	
	public String toString() {
	       NumberFormat format = (NumberFormat) NumberFormat.getCurrencyInstance();

	       String str = "";
	       str = name + ", " + format.format(price);
	       
	       
	       if (bulkPrice != 0) {
	          str += " ( " + bulkQuantity + " for " + format.format(bulkPrice)
	                   + " )";
	       }
	       return str;
	   }
	}
	

