package com.thinkxfactor.zomatoplus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Items;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repo.ItemsRepository;
import com.thinkxfactor.zomatoplus.repo.RestaurantRepository;
import com.thinkxfactor.zomatoplus.repo.UserRepository;

@RestController
@RequestMapping("/restaurant")

public class RestaurantController 
{

	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@PostMapping("/add")
	public Restaurant addRestaurant(@RequestBody Restaurant restaurant)
	{
		Restaurant persistedRestaurant=restaurantRepository.save(restaurant);
		return persistedRestaurant;
	}
	
	
	@Autowired
	private ItemsRepository itemsRepository;
	
	@PostMapping("/addItem")
	public Items addItems(@RequestBody Items items)
	{
		itemsRepository.saveAndFlush(items);
		return items;
	}
	
}
