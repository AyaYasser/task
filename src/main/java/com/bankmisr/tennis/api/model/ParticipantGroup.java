package com.bankmisr.tennis.api.model;

import java.util.Date;
import java.util.List;

/**
 * @author Aya Yasser
 */
public class ParticipantGroup {
    private Integer groupId;
    private List<Participant> participants;
    private Date date;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
