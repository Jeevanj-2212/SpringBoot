package com.sample.user;

import org.springframework.stereotype.Component;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDao {
    //Creating List of users asn of now for understanding
    private static List <User> users = new ArrayList<>();
    static {
        users.add(new User(1,"Peter", LocalDate.now().minusYears(30)));
        users.add(new User(2,"Farnando", LocalDate.now().minusYears(35)));
        users.add(new User(3,"John", LocalDate.now().minusYears(40)));

    }

    public List<User> findAll() {
        return users;
    }

    public User findById(int id) {
        return users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
    }
}
