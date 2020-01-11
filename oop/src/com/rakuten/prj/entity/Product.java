/**
 * 
 */
package com.rakuten.prj.entity;

/**
 * @author kannan
 *
 */
public abstract class Product 
{

	/**
	 * This has business data that represents product information.
	 * @param args
	 */
	private int id;
	private String name;
	private double price;
	public Product() {
	}
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * 
	 * This method is to find if the product is expensive or not. Return true if expensive
	 */
	public abstract boolean isExpensive();
	
}
