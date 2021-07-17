/* Project:  Project 1
 * Class:    ItemOrder.java
 * Author:   Navdeep Kaur
 * Date:     March 3, 2021
 * This class stores information about a particular item and the quantity ordered for that item.
 */ 

public class ItemOrder {
	private Item item;
	private int quantity;
	
	//---------------------------------------------------------------
	// A constructor that creates an item order for the given item and given quantity. Quantity is an integer. 
	public ItemOrder(Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}
	
	//---------------------------------------------------------------
	// A getter that returns the cost for this item order. 
	 public double getPrice() {
	       return item.priceFor(quantity);
	   }

	 //---------------------------------------------------------------
	// // Returns a reference to the item in this order.  
	public Item getItem() {
		return this.item;
	}
	
	}
