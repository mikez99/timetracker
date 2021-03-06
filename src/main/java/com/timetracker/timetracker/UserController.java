/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.timetracker.timetracker;

import com.timetracker.timetracker.model.User;
import com.timetracker.timetracker.service.UserService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userSevice;

    @ResponseBody
    @RequestMapping("")
    public List<User> getAllUsers() {
        return userSevice.getAllUsers();
    }

    @ResponseBody
    @RequestMapping("/{id}")
    public Map<String, Object> getUser(@PathVariable("id") Integer id) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("result", "Get User Implementation");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Map<String, Object> createUser() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("result", "Create User Implementation");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public Map<String, Object> updateUser() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("result", "Update User Implementation");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public Map<String, Object> deleteUser() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("result", "Delete User Implementation");
        return map;
    }
}
