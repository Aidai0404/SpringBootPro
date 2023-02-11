package com.peaksoft.springbootpro.service;

import com.peaksoft.springbootpro.entity.User;

import java.util.List;

public interface UserService {
    void save(User user, String roleName);
    void update(Long id, User user,  String roleName);
    User getById(Long id);
    List<User>getAll();
    void delete(User user);
    User getUserByUsername(String username);
}
