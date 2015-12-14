package com.zach.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.zach.model.UserProfile;

/***
 * @author Zach Bricker
 * @When Dec 14, 2015 9:33:10 AM
 * 
 * Purpose : Repository for User Profile
 * */
@Repository
public interface UserProfileRepository extends MongoRepository<UserProfile, String> {

}
