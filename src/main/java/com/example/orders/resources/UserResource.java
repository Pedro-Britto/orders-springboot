package com.example.orders.resources;

import com.example.orders.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Pedro", "pedro@gmail.com", "9977-1970", "secret");
        return ResponseEntity.ok().body(u);
    }
}
