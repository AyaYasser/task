package com.bankmisr.tennis.repository.repo;

import com.bankmisr.tennis.repository.model.MatchEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author Aya Yasser
 */
@Repository
public interface MatchRepo extends CrudRepository<MatchEntity, Integer>,
        QueryByExampleExecutor<MatchEntity> {
}
