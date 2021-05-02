package com.bankmisr.tennis.service;

import com.bankmisr.tennis.api.model.Participant;
import com.bankmisr.tennis.common.model.MessageStatus;

/**
 * @author Aya Yasser
 */
public interface TennisService {
    MessageStatus addParticipant(Participant participant);
}
