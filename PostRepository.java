package com.pratik.UpdateListing.Repo;

import com.pratik.UpdateListing.Model.Post;

import java.util.List;

public interface PostRepository {
        List<Post> findByFourStrings(String string1, String string2, String string3, String string4);
}
