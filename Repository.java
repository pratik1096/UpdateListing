package com.pratik.UpdateListing;

import com.pratik.UpdateListing.Model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface Repository extends MongoRepository<Post,String> {

}
