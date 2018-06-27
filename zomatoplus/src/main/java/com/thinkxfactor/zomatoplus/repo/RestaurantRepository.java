package com.thinkxfactor.zomatoplus.repo;

import java.util.List;

import com.thinkxfactor.zomatoplus.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long>
{
	//List<Restaurant> findByCity (String cityName);
}
