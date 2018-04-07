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
public class TimeEntry {
    private long timeEntryId;
    private long categoryId;
    private String title;
    private String description;
    private long timeSpent;
    private long userId;

    public TimeEntry(long timeEntryId, String title, String description, long timeSpent, long userId) {
        this.timeEntryId = timeEntryId;
        this.title = title;
        this.description = description;
        this.timeSpent = timeSpent;
        this.userId = userId;
    }

    public long getTimeEntryId() {
        return timeEntryId;
    }

    public void setTimeEntryId(long timeEntryId) {
        this.timeEntryId = timeEntryId;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(long timeSpent) {
        this.timeSpent = timeSpent;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
