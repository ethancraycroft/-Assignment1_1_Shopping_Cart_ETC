
/*********************************************************************
// ShoppingCartInterface   Data Structures
//
/* An interface that describes the operations of a bag (shopping cart) of items. 
* @author Ethan Craycroft
* @version 1.0
* Assignment 1.1
* CS-215-ON Spring 2022
//********************************************************************
*/

public interface ShoppingCartInterface<T>
{
	/** Adds a new entry to this bag.
    @param newEntry  The item to be added as a new entry.
    @return  True if the addition is successful, or false if not. */
	public boolean addItem(T newEntry);
	
	/** Gets the total number of items in the shopping cart.
		 @return  int - the number of items currently in the shopping cart. */
	public int getCartCount();
	
	/** Gets the total price of all items in the shopping cart combined
	 	@return double - the total price of the shopping cart. */
	public double getTotalPrice();
	
	/** Sees if the shopping cart is empty or not
		 @return  True if the shopping cart is empty, false if not. */
	public boolean isEmpty();
	
	/** Removes any item from the shopping cart, if possible.
       @return  Either the removed item, if the removal was successful, or null. */
	public T removeItem();
	
	/** Removes a specific item from the shopping cart, if possible.
    @param Entry  The item to be removed.
    @return  True if the removal was successful, or false if not. */
	public boolean removeThisItem(T Entry);
	
	/** Removes all items from the shopping cart. */
	public void clearCart();
	
	/** Count how many of a specific item is in the shopping cart/
		 @param Entry  The item to be counted.
		 @return  The number of times Entry appears in the bag. */
	public int getFrequencyOf(T Entry);
	
	/**	See if the shopping cart is holding a specific item/
		 @param Entry  The entry to find.
		 @return  True if the bag contains Entry, or false if not. */
	public boolean contains(T Entry);

	/** Loot at every item in the shopping cart
		 @return  A new array of all the entries in the bag.
             Note: If the bag is empty, the returned array is empty. */
	public T[] toArray();
	
	/** Gets the item that costs the most in the shopping cart.
	 @return  T - the item in the shopping car that costs the most. */
	public T getMostExpensiveItem();
	
	/** Gets the item that costs the least in the shopping cart.
	 @return  T - the item in the shopping car that costs the least. */
	public T getLeastExpensiveItem();
	
} // end ShoppingCartInterface
