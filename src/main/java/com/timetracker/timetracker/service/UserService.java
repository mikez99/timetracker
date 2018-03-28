/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.timetracker.timetracker.service;

import com.timetracker.timetracker.model.User;
import java.util.List;

/**
 *
 * @author mike
 */
public interface UserService {
  List<User> getAllUsers();
}
