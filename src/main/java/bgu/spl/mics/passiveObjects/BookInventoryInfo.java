package bgu.spl.mics.application.passiveObjects;

import java.io.Serializable;
import java.util.concurrent.Semaphore;

/**
 * Passive data-object representing a information about a certain book in the inventory.
 * You must not alter any of the given public methods of this class. 
 * <p>
 * You may add fields and methods to this class as you see fit (including public methods).
 */
public class BookInventoryInfo implements Serializable {

	private String bookTitle;
	private int amount;
	private int price;
	private Semaphore semaphore;

	public BookInventoryInfo(String title, int amount, int price) {
		this.bookTitle = title;
		this.amount= amount;
		this.price = price;
		this.semaphore = new Semaphore(this.amount);
	}

	/**
     * Retrieves the title of this book.
     * <p>
     * @return The title of this book.   
     */
	public String getBookTitle() {
		return this.bookTitle;
	}

	/**
     * Retrieves the amount of books of this type in the inventory.
     * <p>
     * @return amount of available books.      
     */
	public int getAmountInInventory() {
		return this.amount;
	}

	/**
     * Retrieves the price for  book.
     * <p>
     * @return the price of the book.
     */
	public int getPrice() {
		return this.price;
	}

	public void setAmountInInventory(int amount){
		this.amount = amount;
	}
	
	public Semaphore getSemaphore(){
		return this.semaphore;
	}

	
}
