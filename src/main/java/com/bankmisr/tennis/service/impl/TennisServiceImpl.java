package com.bankmisr.tennis.service.impl;

import com.bankmisr.tennis.api.model.Participant;
import com.bankmisr.tennis.common.helper.Helper;
import com.bankmisr.tennis.common.model.ConfigurationConstants;
import com.bankmisr.tennis.common.model.MessageStatus;
import com.bankmisr.tennis.repository.model.ParticipantEntity;
import com.bankmisr.tennis.repository.repo.ParticipantRepo;
import com.bankmisr.tennis.service.TennisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author Aya Yasser
 */
@Service
public class TennisServiceImpl implements TennisService {

    @Autowired
    ParticipantRepo participantRepo;

    @Autowired
    Helper helper;

    @Override
    public MessageStatus addParticipant(Participant participant) {
        MessageStatus messageStatus=MessageStatus.FAILED;
        try{

            if(participantRepo.getNoParticipantsPerDay(helper.convertStringToDate(new Date(), ConfigurationConstants.DB_DATE_FORMAT))
              <ConfigurationConstants.PARTICIPANT_TOTAL_NO){
                ParticipantEntity participantEntity=new ParticipantEntity();
                participantEntity.setDate(new Date());
                participantEntity.setStaffId(participant.getStaffId());

                participantEntity.setUsername(participant.getUsername());
                participantRepo.save(participantEntity);
                messageStatus=MessageStatus.SUCCESS;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return messageStatus;
    }
}
