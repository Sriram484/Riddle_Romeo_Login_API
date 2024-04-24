package dev.sriram.riddle_romeo_login_api.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.sriram.riddle_romeo_login_api.Model.RiddleRomeoScoreModel;
import dev.sriram.riddle_romeo_login_api.Repository.RiddleRomeoScoreRepository;

@Service
public class RiddleRomeoScoreService {

    @Autowired
    private RiddleRomeoScoreRepository repo;

    public void saveorUpdate(RiddleRomeoScoreModel user) {

        repo.save(user);
    }

    public Iterable<RiddleRomeoScoreModel> listAll() {

        return this.repo.findAll();
    }

    public void deleteUser(String id) {

        repo.deleteById(id);
    }

    public RiddleRomeoScoreModel getUserByID(String userid) {

        return repo.findById(userid).get();
    }

}