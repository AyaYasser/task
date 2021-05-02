package com.bankmisr.tennis.api.model;

/**
 * @author Aya Yasser
 */
public class GroupParticipantResult {
    private ResponseHeader responseHeader;
    private ParticipantGroup participantGroup;

    public ResponseHeader getResponseHeader() {
        return responseHeader;
    }

    public void setResponseHeader(ResponseHeader responseHeader) {
        this.responseHeader = responseHeader;
    }

    public ParticipantGroup getParticipantGroup() {
        return participantGroup;
    }

    public void setParticipantGroup(ParticipantGroup participantGroup) {
        this.participantGroup = participantGroup;
    }
}
