package dev.sriram.riddle_romeo_login_api.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.sriram.riddle_romeo_login_api.Model.RiddleRomeoScoreModel;

@Repository
public interface RiddleRomeoScoreRepository  extends MongoRepository<RiddleRomeoScoreModel, String>{

    
} 