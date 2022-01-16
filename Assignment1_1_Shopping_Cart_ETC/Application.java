/*********************************************************************
// Application.java   Data Structures
//
/* Testing methods for the item and shopping cart classesß
* @author Ethan Craycroft
* @version 1.0
* Assignment 1.1
* CS-215-ON Spring 2022
//********************************************************************
*/
public class Application 
{

	static ShoppingCart cart = new ShoppingCart();
	
	/**
	 * @param ShoppingCart
	 */
	public static void displayCart(ShoppingCart cart)
	{
		System.out.println("The cart contains the following items:");		
		Object[] bagArray = cart.toArray();
		for (int index = 0; index < bagArray.length; index++)
		{
			Item toDisplay = new Item();
			toDisplay = (Item) bagArray[index];
			System.out.print("[" + toDisplay.itemColor + " " + toDisplay.getItemName() + "] ");
		} // end for
		
		System.out.println();
	}//end displayCart

	public static void main(String [] args)
	{
		//CREATING ITEMS TO ADD TO THE CART
		Item grayShirt = new Item();
		
		//CHECKING METHODS OF THE ITEM CLASS
		grayShirt.price = 15.50;
		grayShirt.name = "T-Shirt";
		grayShirt.setColor("Gray");
		grayShirt.setQuantity(1);
		grayShirt.setSize("XL");
		
		Item greenSweatshirt = new Item(30.00, "Sweatshirt", 1, "XXL", "Green");
		Item blueJeans = new Item(45.00, "Jeans", 1, "38x30", "Blue");
		Item blackScarf = new Item(10.00, "Scarf", 1, "N/A", "Black");
		Item whiteShoes = new Item(75.00, "Shoes", 1, "13", "White");
		Item whiteSocks = new Item(15.00, "Socks", 1, "L", "White");
		Item blueUnderwear = new Item(15.00, "Underwear", 1, "XL", "Blue");
		
		//CHECKING TO SEE IF THE CART IS EMPTY
		System.out.println("Cart is empty: ");
		System.out.println(cart.isEmpty());
		displayCart(cart);
		System.out.println();
		
		/*
		 * ================================================================================================
		 * 								Testing ADD Method
		 * ================================================================================================
		 */
		
		//ADDING AN ITEM TO THE CART
		System.out.println("Adding a gray shirt to the cart: ");
		cart.addItem(grayShirt);
		displayCart(cart);
		System.out.println();
		
		//ADDING AN ITEM TO THE CART
		System.out.println("Adding a green sweatshirt to the cart: ");
		cart.addItem(greenSweatshirt);
		displayCart(cart);
		System.out.println();
		
		//ADDING AN ITEM TO THE CART
		System.out.println("Adding a pair of blue jeans to the cart: ");
		cart.addItem(blueJeans);
		displayCart(cart);
		System.out.println();
		
		//ADDING AN ITEM TO THE CART
		System.out.println("Adding a black scarf to the cart: ");
		cart.addItem(blackScarf);
		displayCart(cart);
		System.out.println();
		
		//ADDING AN ITEM TO THE CART
		System.out.println("Adding white shoes to the cart: ");
		cart.addItem(whiteShoes);
		displayCart(cart);
		System.out.println();
		
		//ADDING AN ITEM TO THE CART
		System.out.println("Adding white socks to the cart: ");
		cart.addItem(whiteSocks);
		displayCart(cart);
		System.out.println();
		
		//ADDING AN ITEM TO THE CART
		System.out.println("Adding blue underwear to the cart: ");
		cart.addItem(blueUnderwear);
		displayCart(cart);
		System.out.println();
		
		//ADDING AN ITEM TO THE CART
		System.out.println("Adding a pair of blue jeans to the cart: ");
		cart.addItem(blueJeans);
		displayCart(cart);
		System.out.println();
	
		
		/*
		 * ================================================================================================
		 * 								Testing Other Methods After Adding
		 * ================================================================================================
		 */
		
		//GETTING THE TOTAL NUMBER OF ITEMS IN THE CART
		System.out.println("Current number of items in the cart: ");
		System.out.println(cart.getCartCount());
		System.out.println();
		
		//GETTING THE TOTAL NUMBER OF A SPECIFIC ITEM IN THE CART
		System.out.println("Current number of gray shirts in the cart: ");
		System.out.println(cart.getFrequencyOf(grayShirt));
		System.out.println();
		
		//GETTING THE TOTAL NUMBER OF A SPECIFIC ITEM IN THE CART
		System.out.println("Current number of blue jeans in the cart: ");
		System.out.println(cart.getFrequencyOf(blueJeans));
		System.out.println();
		
		//CHECKING TO SEE IF THE CART IS EMPTY
		System.out.print("Cart Empty: ");
		System.out.println(cart.isEmpty());
		System.out.println();
		
		//CHECKING TO SEE IF A SPECIFIC ITEM IS IN THE CART
		System.out.print("Gray Shirt is in the cart: ");
		System.out.println(cart.contains(grayShirt));
		System.out.println();
		
		//CHECKING TO SEE IF A SPECIFIC ITEM IS IN THE CART
		System.out.print("Black Scarf is in the cart: ");
		System.out.println(cart.contains(blackScarf));
		System.out.println();
		
		//GETTING THE TOTAL PRICE OF ALL ITEMS IN THE CART
		System.out.print("Total Price of shopping cart: ");
		System.out.println("$" + cart.getTotalPrice());
		System.out.println();
		
		//GETTING THE ITEM THAT COSTS THE MOST FROM THE CART
		System.out.print("Most Expensive Item: ");
		System.out.println(cart.getMostExpensiveItem().itemColor + " " + cart.getMostExpensiveItem().getItemName());
		System.out.println();
		
		//GETTING THE ITEM THAT COSTS THE LEAST FROM THE CART
		System.out.print("Least Expensive Item: ");
		System.out.println(cart.getLeastExpensiveItem().itemColor + " " + cart.getLeastExpensiveItem().getItemName());
		System.out.println();

		
		/*
		 * ================================================================================================
		 * 								Testing REMOVE Methods
		 * ================================================================================================
		 */
	
		//REMOVING 1 SPECIFIC ITEM FROM THE CART
		System.out.println("Removing green sweatshirt from the cart: ");
		cart.removeThisItem(greenSweatshirt);
		displayCart(cart);
		System.out.println();
		
		//REMOVING 1 SPECIFIC ITEM FROM THE CART
		System.out.println("Removing white socks from the cart: ");
		cart.removeThisItem(whiteSocks);
		displayCart(cart);
		System.out.println();
		
		
		//REMOVING 1 UNSPECIFIC ITEM FROM THE CART
		System.out.println("Removing 1 item: ");
		cart.removeItem();
		displayCart(cart);
		System.out.println();
		
		//REMOVING 1 UNSPECIFIC ITEM FROM THE CART
		System.out.println("Removing 1 item: ");
		cart.removeItem();
		displayCart(cart);
		System.out.println();	
		
		//REMOVING 1 UNSPECIFIC ITEM FROM THE CART
		System.out.println("Removing 1 item: ");
		cart.removeItem();
		displayCart(cart);
		System.out.println();
		
		//REMOVING 1 UNSPECIFIC ITEM FROM THE CART
		System.out.println("Removing 1 item: ");
		cart.removeItem();
		displayCart(cart);
		System.out.println();
		
		//REMOVING 1 UNSPECIFIC ITEM FROM THE CART
		System.out.println("Removing 1 item: ");
		cart.removeItem();
		displayCart(cart);
		System.out.println();
		
		
		/*
		 * ================================================================================================
		 * 								Testing Other Methods After Removing
		 * ================================================================================================
		 */
		
		//GETTING THE TOTAL NUMBER OF ITEMS IN THE CART
		System.out.println("Current number of items in the cart: ");
		System.out.println(cart.getCartCount());
		System.out.println();
		
		//GETTING THE TOTAL NUMBER OF A SPECIFIC ITEM IN THE CART
		System.out.println("Current number of gray shirts in the cart: ");
		System.out.println(cart.getFrequencyOf(grayShirt));
		System.out.println();
		
		//GETTING THE TOTAL NUMBER OF A SPECIFIC ITEM IN THE CART
		System.out.println("Current number of blue jeans in the cart: ");
		System.out.println(cart.getFrequencyOf(blueJeans));
		System.out.println();
		
		//CHECKING TO SEE IF THE CART IS EMPTY
		System.out.print("Cart Empty: ");
		System.out.println(cart.isEmpty());
		System.out.println();
		
		//CHECKING TO SEE IF A SPECIFIC ITEM IS IN THE CART
		System.out.print("Gray Shirt is in the cart: ");
		System.out.println(cart.contains(grayShirt));
		System.out.println();
		
		//CHECKING TO SEE IF A SPECIFIC ITEM IS IN THE CART
		System.out.print("Black Scarf is in the cart: ");
		System.out.println(cart.contains(blackScarf));
		System.out.println();
		
		//GETTING THE TOTAL PRICE OF ALL ITEMS IN THE CART
		System.out.print("Total Price of shopping cart: ");
		System.out.println("$" + cart.getTotalPrice());
		System.out.println();
		
		//GETTING THE ITEM THAT COSTS THE MOST FROM THE CART
		System.out.print("Most Expensive Item: ");
		System.out.println(cart.getMostExpensiveItem().itemColor + " " + cart.getMostExpensiveItem().getItemName());
		System.out.println();
		
		//GETTING THE ITEM THAT COSTS THE LEAST FROM THE CART
		System.out.print("Least Expensive Item: ");
		System.out.println(cart.getLeastExpensiveItem().itemColor + " " + cart.getLeastExpensiveItem().getItemName());
		System.out.println();
		
		/*
		 * ================================================================================================
		 * 								Testing Clear Method
		 * ================================================================================================
		 */

		//CLEARING THE CART OF ALL ITEMS
		cart.clearCart();
		
		//GETTING THE TOTAL NUMBER OF ITEMS IN THE CART

		System.out.println("Current number of items in the cart: ");
		System.out.println(cart.getCartCount());
		System.out.println();
		
		//CHECKING TO SEE IF THE CART IS EMPTY
		System.out.print("Cart Empty: ");
		System.out.println(cart.isEmpty());
		System.out.println();
		
	}//end main

}//end class
