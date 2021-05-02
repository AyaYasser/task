package com.bankmisr.tennis.common.model;

/**
 * @author Aya Yasser
 */
public enum MessageStatus {
    SUCCESS(0),
    FAILED(1)
    ;

    private int statusId;

    MessageStatus(int statusId) {
        this.statusId = statusId;
    }

    public int getStatusId() {
        return statusId;
    }
}
