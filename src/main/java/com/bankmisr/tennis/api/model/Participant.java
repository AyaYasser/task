package com.bankmisr.tennis.api.model;


import javax.persistence.criteria.CriteriaBuilder;

/**
 * @author Aya Yasser
 */
public class Participant {
    private int staffId;
    private String username;

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
