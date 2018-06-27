package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_items")
public class Items implements Serializable 
{
	
	@Id
	@GeneratedValue
	@Column(name="item_id")
	private long Id;
	
	@Column(name="restaurant_id")
	private long restaurantId;
	
	@Column(name="name")
	private long name;
	
	@Column(name="price")
	private long price;
	
	@Column(name="description")
	private long description;
	
	
	public Items() 
	{
		super();
		
	}


	public Items(long id, long restaurantId, long name, long price, long description) {
		super();
		Id = id;
		this.restaurantId = restaurantId;
		this.name = name;
		this.price = price;
		this.description = description;
	}


	public long getId() {
		return Id;
	}


	public void setId(long id) {
		Id = id;
	}


	public long getRestaurantId() {
		return restaurantId;
	}


	public void setRestaurantId(long restaurantId) {
		this.restaurantId = restaurantId;
	}


	public long getName() {
		return name;
	}


	public void setName(long name) {
		this.name = name;
	}


	public long getPrice() {
		return price;
	}


	public void setPrice(long price) {
		this.price = price;
	}


	public long getDescription() {
		return description;
	}


	public void setDescription(long description) {
		this.description = description;
	}
	
}