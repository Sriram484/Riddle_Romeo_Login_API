package dev.sriram.riddle_romeo_login_api.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.sriram.riddle_romeo_login_api.Model.RiddleRomeoLoginApiModel;
import dev.sriram.riddle_romeo_login_api.Repository.RiddleRomeoLoginApiRepo;

@Service
public class RiddleRomeoLoginApiService {
    
    @Autowired
    private RiddleRomeoLoginApiRepo riddleRepo;

    public List<RiddleRomeoLoginApiModel>allUserData()
    {
        return riddleRepo.findAll();
    }
}
