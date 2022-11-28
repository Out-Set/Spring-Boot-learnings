package com.example.App1;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class SampleController {
    
    DBUser db = new DBUser();

    // http://localhost:8080/users   --> Get
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return db.getAllUsers();
    }

    // http://localhost:8080/users/(id)   --> Get
    @GetMapping("/users/{id}")
    public User getAUser(@PathVariable int id) {
        return db.getAUser(id);
    }
}
