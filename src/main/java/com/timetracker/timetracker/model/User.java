/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.timetracker.timetracker.model;

/**
 *
 * @author mike
 */
public class User {
  private Integer userid;  
  private String username;   
  public User(Integer userid, String username){
    this.userid = userid;
    this.username = username;
  }  
  // getter and setter methods 

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
