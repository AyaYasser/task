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
@Table(name = "MATCH")
public class MatchEntity {
    @Id
    @Column(name = "match_id")
    private int matchId;

    @Column(name = "staff_id_1")
    private Integer staffId1;

    @Column(name = "staff_id_2")
    private Integer staffId2;

    @Column(name = "group_no")
    private Integer groupNo;

    @Column(name = "user1_points")
    private Integer user1Points;

    @Column(name = "user2_points")
    private Integer user2Points;

    @Column(name = "status")
    private Integer status;

    @Column(name = "date")
    private Date date;

    public Integer getStaffId1() {
        return staffId1;
    }

    public void setStaffId1(Integer staffId1) {
        this.staffId1 = staffId1;
    }

    public Integer getStaffId2() {
        return staffId2;
    }

    public void setStaffId2(Integer staffId2) {
        this.staffId2 = staffId2;
    }

    public Integer getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(Integer groupNo) {
        this.groupNo = groupNo;
    }

    public Integer getUser1Points() {
        return user1Points;
    }

    public void setUser1Points(Integer user1Points) {
        this.user1Points = user1Points;
    }

    public Integer getUser2Points() {
        return user2Points;
    }

    public void setUser2Points(Integer user2Points) {
        this.user2Points = user2Points;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MatchEntity)) return false;
        MatchEntity that = (MatchEntity) o;
        return matchId == that.matchId && getStaffId1().equals(that.getStaffId1()) && getStaffId2().equals(that.getStaffId2()) && getGroupNo().equals(that.getGroupNo()) && getUser1Points().equals(that.getUser1Points()) && getUser2Points().equals(that.getUser2Points()) && getStatus().equals(that.getStatus()) && getDate().equals(that.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(matchId, getStaffId1(), getStaffId2(), getGroupNo(), getUser1Points(), getUser2Points(), getStatus(), getDate());
    }

    @Override
    public String toString() {
        return "MatchEntity{" +
                "matchId=" + matchId +
                ", staffId1=" + staffId1 +
                ", staffId2=" + staffId2 +
                ", groupNo=" + groupNo +
                ", user1Points=" + user1Points +
                ", user2Points=" + user2Points +
                ", status=" + status +
                ", date=" + date +
                '}';
    }
}
