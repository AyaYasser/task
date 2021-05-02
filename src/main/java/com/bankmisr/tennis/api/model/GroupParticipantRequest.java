package com.bankmisr.tennis.api.model;


import java.util.Date;

/**
 * @author Aya Yasser
 */
public class GroupParticipantRequest {
    private Integer groupId;
    private Date date;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
