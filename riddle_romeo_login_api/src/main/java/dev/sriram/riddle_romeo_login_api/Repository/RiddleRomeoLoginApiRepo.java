package dev.sriram.riddle_romeo_login_api.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.sriram.riddle_romeo_login_api.Model.RiddleRomeoLoginApiModel;

@Repository
public interface RiddleRomeoLoginApiRepo extends MongoRepository<RiddleRomeoLoginApiModel, ObjectId> {
    
}
