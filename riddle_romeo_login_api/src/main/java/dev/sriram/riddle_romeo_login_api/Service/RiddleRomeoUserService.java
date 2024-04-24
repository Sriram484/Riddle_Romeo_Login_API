package dev.sriram.riddle_romeo_login_api.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.sriram.riddle_romeo_login_api.Model.RiddleRomeoUserModel;
import dev.sriram.riddle_romeo_login_api.Repository.RiddleRomeoUserRepo;

@Service
public class RiddleRomeoUserService {
    
    @Autowired
    private RiddleRomeoUserRepo repo;

    public void saveorUpdate(RiddleRomeoUserModel user) {

        repo.save(user);
    }

    public Iterable<RiddleRomeoUserModel> listAll() {

        return this.repo.findAll();
    }


    public void deleteUser(String id) {

        repo.deleteById(id);
    }

    public RiddleRomeoUserModel getUserByID(String userid) {
        Optional<RiddleRomeoUserModel> userOptional = repo.findById(userid);
        return userOptional.orElse(null);
    }


 
}
