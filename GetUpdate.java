package com.pratik.UpdateListing;

import com.pratik.UpdateListing.Model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GetUpdate implements PostRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Post> findByFourStrings(String string1, String string2, String string3, String string4) {
        Query query = new Query();
        Criteria criteria = new Criteria();

        if (string1 != null && !string1.isEmpty()) {
            criteria = criteria.and("region").is(string1);
        }
        if (string2 != null && !string2.isEmpty()) {
            criteria = criteria.and("country").is(string2);
        }
        if (string3 != null && !string3.isEmpty()) {
            criteria = criteria.and("location").is(string3);
        }
        if (string4 != null && !string4.isEmpty()) {
            criteria = criteria.and("topic").is(string4);
        }

        query.addCriteria(criteria);
        return mongoTemplate.find(query, Post.class);
    }
}
