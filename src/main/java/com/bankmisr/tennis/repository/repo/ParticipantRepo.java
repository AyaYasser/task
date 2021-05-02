package com.bankmisr.tennis.repository.repo;

import com.bankmisr.tennis.repository.model.MatchEntity;
import com.bankmisr.tennis.repository.model.ParticipantEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author Aya Yasser
 */

@Repository
public interface ParticipantRepo  extends CrudRepository<ParticipantEntity, Integer>,
        QueryByExampleExecutor<ParticipantEntity> {

    @Query(value="select count(*) from participants where date = ?1 ",nativeQuery = true)
    int getNoParticipantsPerDay(String date);
}
