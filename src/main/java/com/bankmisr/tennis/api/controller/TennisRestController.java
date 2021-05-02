package com.bankmisr.tennis.api.controller;

import com.bankmisr.tennis.api.model.GroupParticipantRequest;
import com.bankmisr.tennis.api.model.GroupParticipantResult;
import com.bankmisr.tennis.api.model.Participant;
import com.bankmisr.tennis.api.model.ResponseHeader;
import com.bankmisr.tennis.common.model.MessageStatus;
import com.bankmisr.tennis.service.TennisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author Aya Yasser
 */

@RestController
@RequestMapping("/tennis")
public class TennisRestController {

    @Autowired
    TennisService tennisService;

    @RequestMapping(value = "/add/participant",method = RequestMethod.POST)
    @ResponseBody
    public ResponseHeader saveParticipant(@RequestBody Participant participant){
        MessageStatus messageStatus=tennisService.addParticipant(participant);
        ResponseHeader responseHeader=new ResponseHeader();
        responseHeader.setMessageCode(messageStatus.getStatusId());
        responseHeader.setMessageDescr(messageStatus.name());
        return responseHeader;
    }


    @RequestMapping(value = "/group/participant",method = RequestMethod.POST)
    @ResponseBody
    public GroupParticipantResult getAllParticipantsPerGroup(GroupParticipantRequest groupParticipantRequest){
        GroupParticipantResult groupParticipantResult=new GroupParticipantResult();
        return groupParticipantResult;
    }
    @RequestMapping(value = "/update/result",method = RequestMethod.PUT)
    @ResponseBody
    public GroupParticipantResult updateResults(Date date,Integer groupId){
        GroupParticipantResult groupParticipantResult=new GroupParticipantResult();
        return groupParticipantResult;
    }
}
