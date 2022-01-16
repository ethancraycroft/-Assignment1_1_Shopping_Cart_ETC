
/*********************************************************************
// ItemInterface   Data Structures
//
/* An interface that describes the operations of an item. 
* @author Ethan Craycroft
* @version 1.0
* Assignment 1.1
* CS-215-ON Spring 2022
//********************************************************************
*/
public interface ItemInterface 
{	
	/** Gets the price of the item.
	 @return  double - the price of the item to be purchased/put in shopping cart */
	public double getItemPrice();

	/** Gets the name of the item.
	 @return  String - the name of the item to be purchased/put in shopping cart */
	public String getItemName();
	
	/** Sets the price of the item.
	 @param  int - the quantity of the item to be purchased/put in the shopping cart */
	public void setQuantity(int quantity);
	
	/** Sets the size of the item.
	 @param  String - the size of the item to be purchased/put in the shopping cart */
	public void setSize(String size);
	
	/** Sets the color of the item.
	 @param  String - the color of the item to be purchased/put in the shopping cart */
	public void setColor(String color);
	
}//end ItemInterface
