package com.pratik.UpdateListing.Repo;

import com.pratik.UpdateListing.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PeopleRepository extends MongoRepository<User,String>{
}
