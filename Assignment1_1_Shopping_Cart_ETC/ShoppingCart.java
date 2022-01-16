
/*********************************************************************
// ShoppingCart.java   Data Structures
//
/* Creates a shopping cart object that can hold items in an ArrayBag
* @author Ethan Craycroft
* @version 1.0
* Assignment 1.1
* CS-215-ON Spring 2022
//********************************************************************
*/
public class ShoppingCart implements ShoppingCartInterface<Object>
{
	ResizableArrayBag<Item> cart = new ResizableArrayBag<Item>();
	Item lowest;
	Item highest;
	double total = 0;
	
	@Override
	/**
	 * @return boolean - true if successful; false if unsuccessful
	 * @param newEntry - the item to be added to the ArrayBag
	 */
	public boolean addItem(Object newEntry) 
	{
		Item cartObject = new Item();
		cartObject = (Item) newEntry;
		total += cartObject.getItemPrice();
		return cart.add(cartObject);
	}//end addItem

	@Override
	/**
	 * @return int - total number of items in the cart
	 */
	public int getCartCount() 
	{
		// TODO Auto-generated method stub
		return cart.getCurrentSize();
	}//end getCartCount

	@Override
	/**
	 * @return double - the total price of the cart
	 */
	public double getTotalPrice() 
	{
		// TODO Auto-generated method stub
		return total;
	}//end getTotalPrice

	@Override
	/**
	 * @return boolean - true if the cart is empty; false if the cart is not empty
	 */
	public boolean isEmpty() 
	{
		// TODO Auto-generated method stub
		return cart.isEmpty();
	}//end isEmpty

	@Override
	/**
	 * @return Object - the item that is removed from the cart
	 */
	public Object removeItem() 
	{
		Object[] bagArray = cart.toArray();
		Item deduction = (Item) bagArray[bagArray.length-1];
		total -= deduction.getItemPrice();
		return cart.remove();
	}//end removeItem

	@Override
	/**
	 * @return boolean - true if successful; false if unsuccessful
	 * @param Entry - the specific item to be removed
	 */
	public boolean removeThisItem(Object Entry) 
	{
		// TODO Auto-generated method stub

		Item cartObject = (Item) Entry;
		total -= cartObject.getItemPrice();
		return cart.remove(cartObject);
	}//end removeThisItem

	@Override
	public void clearCart() 
	{
		// TODO Auto-generated method stub
		cart.clear();
	}//end clearCart

	@Override
	/**
	 * @return int - frequency of a given item in the cart
	 * @param Object - the item to be counted in the cart
	 */
	public int getFrequencyOf(Object Entry) 
	{
		Item cartObject = new Item();
		cartObject = (Item) Entry;
		cart.getFrequencyOf(cartObject);
		return cart.getFrequencyOf(cartObject);
	}//end getFrequencyOf

	@Override
	/**
	 * @return boolean - true if successful; false if unsuccessful
	 * @param Object - the item to be checked for in the cart
	 */
	public boolean contains(Object Entry) 
	{
		// TODO Auto-generated method stub
		Item cartObject = new Item();
		cartObject = (Item) Entry;
		return cart.contains(cartObject);
	}//end contains

	@Override
	/**
	 * @return Object Array - an array of all items in the cart
	 */
	public Object[] toArray() 
	{
		// TODO Auto-generated method stub
		return cart.toArray();
	}//end toArray

	@Override
	/**
	 * @return Item - returns the item with the highest price
	 */
	public Item getMostExpensiveItem() 
	{
		Object[] bagArray = cart.toArray();
		highest = (Item) bagArray[0];
		for (int index = 0; index < bagArray.length; index++)
		{
			Item toCompare = (Item) bagArray[index];
			if(toCompare.getItemPrice() > highest.getItemPrice())
			{
				highest = toCompare;
			}

		}
		return highest;
	}//end getMostExpensiveItem

	@Override
	/**
	 * @return Item - returns the least expensive item
	 */
	public Item getLeastExpensiveItem() 
	{
		Object[] bagArray = cart.toArray();
		lowest = (Item) bagArray[0];
		for (int index = 0; index < bagArray.length; index++)
		{
			Item toCompare = (Item) bagArray[index];
			if(toCompare.getItemPrice() < lowest.getItemPrice())
			{
				lowest = toCompare;
			}

		}
		return lowest;
	}//end getLeastExpensiveItem
	
}//end class
