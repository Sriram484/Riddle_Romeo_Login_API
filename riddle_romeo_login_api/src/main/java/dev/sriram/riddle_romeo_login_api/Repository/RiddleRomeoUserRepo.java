package dev.sriram.riddle_romeo_login_api.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import dev.sriram.riddle_romeo_login_api.Model.RiddleRomeoUserModel;

@Repository
public interface RiddleRomeoUserRepo extends MongoRepository<RiddleRomeoUserModel, String> {




}
