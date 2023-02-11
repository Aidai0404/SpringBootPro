package com.peaksoft.springbootpro.service.impl;

import com.peaksoft.springbootpro.entity.Role;
import com.peaksoft.springbootpro.entity.User;
import com.peaksoft.springbootpro.repository.RoleRepository;
import com.peaksoft.springbootpro.repository.UserRepository;
import com.peaksoft.springbootpro.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final RoleRepository roleRepository;

    @Override
    public void save(User user, String roleName) {
        User user1 = new User();
        user1.setUsername(user.getUsername());
        user1.setLastname(user.getLastname());
        user1.setEmail(user.getEmail());
        user1.setPassword(passwordEncoder.encode(user.getPassword()));
        Role role = roleRepository.findByRoleName(roleName);
        Set<Role>roles = new HashSet<>();
        roles.add(role);
        user1.setRoles(roles);
        userRepository.save(user1);
    }

    @Override
    public void update(Long id, User user, String roleName) {
     User user1 = userRepository.getById(id);
     user1.setUsername(user.getUsername());
     user1.setLastname(user.getLastname());
     user1.setEmail(user.getEmail());
     user1.setPassword(passwordEncoder.encode(user.getPassword()));
     Role role = roleRepository.findByRoleName(roleName);
     Set<Role>roles = new HashSet<>();
     roles.add(role);
     user1.setRoles(roles);
     userRepository.saveAndFlush(user1);
    }

    @Override
    public User getById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.getUserByUsername(username);
    }
}
