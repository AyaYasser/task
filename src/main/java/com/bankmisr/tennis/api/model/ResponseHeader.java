package com.bankmisr.tennis.api.model;

/**
 * @author Aya Yasser
 */
public class ResponseHeader {
    int messageCode;
    String messageDescr;

    public int getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(int messageCode) {
        this.messageCode = messageCode;
    }

    public String getMessageDescr() {
        return messageDescr;
    }

    public void setMessageDescr(String messageDescr) {
        this.messageDescr = messageDescr;
    }
}
