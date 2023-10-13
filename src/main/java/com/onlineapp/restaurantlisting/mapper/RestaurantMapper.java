package com.onlineapp.restaurantlisting.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.onlineapp.restaurantlisting.dto.RestaurantDTO;
import com.onlineapp.restaurantlisting.entity.Restaurant;

@Mapper
public interface RestaurantMapper {
	
	RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);
	
	Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDTO);
	
	RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant);

}
