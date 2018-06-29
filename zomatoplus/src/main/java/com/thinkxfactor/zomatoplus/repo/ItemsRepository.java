package com.thinkxfactor.zomatoplus.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.models.Items;
import com.thinkxfactor.zomatoplus.models.Restaurant;

public interface ItemsRepository extends JpaRepository<Items,Long>
{
	List<Restaurant> findAllByRestaurantId (long restaurantId);
}
