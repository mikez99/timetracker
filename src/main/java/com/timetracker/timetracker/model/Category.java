/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packetpub.model;

/**
 *
 * @author Mike
 */
public class Category {
    private long categoryId;
    private long parentId;
    private String name;
    private long userId;
    private boolean complete;

    public Category(long categoryId, long parentId, String name, long userId) {
        this.categoryId = categoryId;
        this.parentId = parentId;
        this.name = name;
        this.userId = userId;
    }
    
    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
    
    
}
