package com.bankmisr.tennis.repository.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.Objects;

/**
 * @author Aya Yasser
 */

@Entity
@Table(name = "participants")
public class ParticipantEntity {
    @Id
    @Column(name = "participants_id")
    private int participantId;

    private int staffId;

    private String username;

    private Date date;

    @Column(name = "staff_id")
    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        return Objects.hash(participantId, getStaffId(), getUsername(), getDate());
    }
}
