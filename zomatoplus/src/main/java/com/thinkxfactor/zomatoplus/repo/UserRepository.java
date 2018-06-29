package com.thinkxfactor.zomatoplus.repo;

import java.util.List;

import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.models.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>
{
	User findByNameAndPassword(String name,String password);
}
