package com.springtest.services;

import com.springtest.model.User;
import java.util.List;

public interface UserService {

    User getUser(Long id);
    List<User>findAll();
    User addUser(User user);
    void delete(Long id);
    User update(User user);
    User findByName(String name);

}
