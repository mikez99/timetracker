/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.timetracker.timetracker.service;
import com.timetracker.timetracker.model.User;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
  @Override
  public List<User> getAllUsers() {    
    return this.users;
  }  
  // Dummy users
  public static List<User> users; 
  public UserServiceImpl() {
    users = new LinkedList<>();   
    users.add(new User(100, "David"));
    users.add(new User(101, "Peter"));
    users.add(new User(102, "John"));
  }
}