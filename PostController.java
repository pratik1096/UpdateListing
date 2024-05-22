package com.pratik.UpdateListing.Controller;

import com.pratik.UpdateListing.Model.Post;
import com.pratik.UpdateListing.Repository;
import com.pratik.UpdateListing.GetUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//import static org.springframework.ejb.config.AbstractJndiLocatingBeanDefinitionParser.ENVIRONMENT;

@RestController
public class PostController {


    @Autowired
    Repository repo;

    @Autowired
    GetUpdate getUpdate;

    @ApiIgnore
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse res) throws IOException {
        res.sendRedirect("swagger-ui.html");
    }

    @PostMapping(value = "add")
    public Post addUpdate(@RequestBody Post post) {
        return repo.save(post);
    }

    @PostMapping(value = "getUpdate")
    public List<Post> getItems(String string1, String string2, String string3, String string4) {
        return getUpdate.findByFourStrings(string1, string2, string3, string4);
    }

}