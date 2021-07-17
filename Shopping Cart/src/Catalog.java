/* Project:  Project 1
 * Class:    Catalog.java
 * Author:   Navdeep Kaur
 * Date:     March 3, 2021
 * This class stores information about a collection of these items. 
 */ 

import java.util.ArrayList;

public class Catalog  { 
	
	private String Name;
	//int index;
	
	ArrayList<Item> Catalog_List = new ArrayList<Item>();
	
	//---------------------------------------------------------------
	// Constructor that takes the name of this catalog as a parameter. Name is a string. 
	public Catalog(String name) {
		this.Name = name; 
	}
	
	//---------------------------------------------------------------
	// This adds an Item at the end of this list.
	public void add(Item item) {
		Catalog_List.add(item);
	}
	
	//---------------------------------------------------------------
	// This returns the number of items in list. 
	public int size() {
		return Catalog_List.size();
	}
	
	//---------------------------------------------------------------
	// This returns the Item with the given index (0-based).
	public Item get(int index) {
		Item x = Catalog_List.get(index);
		return x;
	}
	
	//---------------------------------------------------------------
	// This returns the name of this catalog.
	public String getName() {
		return Name;
	}

	
	



	
}
