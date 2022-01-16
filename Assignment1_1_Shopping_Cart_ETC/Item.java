
/*********************************************************************
// Item.java   Data Structures
//
/* Creates an Item object used to fill a shopping cart ArrayBag
* @author Ethan Craycroft
* @version 1.0
* Assignment 1.1
* CS-215-ON Spring 2022
//********************************************************************
*/
public class Item implements ItemInterface
{
	double price;
	String name;
	int itemQuantity;
	String itemSize;
	String itemColor;
		
	public Item()
	{
		price = 0;
		name = "";
		itemQuantity = 0;
		itemSize = "";
		itemColor = "";
	}//end empty-argument constructor
	
	public Item(double price, String name, int itemQuantity, String itemSize, String itemColor)
	{
		this.price = price;
		this.name = name;
		this.itemColor = itemColor;
		this.itemQuantity = itemQuantity;
		this.itemSize = itemSize;
	}//end preferred constructor
	
	
	@Override
	/**
	 * @return the price
	 */
	public double getItemPrice() 
	{
		return price;
	}// end getItemPrice
	
	@Override
	/**
	 * @return the name of the item
	 */
	public String getItemName() 
	{
		// TODO Auto-generated method stub
		return name;
	}//end getItemName
	
	@Override
	/**
	 * @param quantity of items to be set
	 */
	public void setQuantity(int quantity) 
	{
		// TODO Auto-generated method stub
		this.itemQuantity = quantity;
	}//end setQuantity
	
	@Override
	/**
	 * @param the size of the item to be set
	 */
	public void setSize(String size) 
	{
		// TODO Auto-generated method stub
		this.itemSize = size;
	}//end setSize
	
	@Override
	/**
	 * @param the color of the item to be set
	 */
	public void setColor(String color) 
	{
		// TODO Auto-generated method stub
		this.itemColor = color;
	}//end setColor
	
}//end class
