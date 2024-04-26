package dev.sriram.riddle_romeo_login_api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.sriram.riddle_romeo_login_api.Model.RiddleRomeoUserModel;
import dev.sriram.riddle_romeo_login_api.Service.RiddleRomeoUserService;

@RestController
@CrossOrigin(origins = "https://classy-croissant-1db161.netlify.app/")
@RequestMapping("/api/v1/userData")
public class RiddleRomeoUserController {
    
    @Autowired
    private RiddleRomeoUserService riddleService;

    @PostMapping(value = "/save")
    private String saveStudent(@RequestBody RiddleRomeoUserModel user) {

        riddleService.saveorUpdate(user);
        return user.getUserId();
    }

    @GetMapping(value = "/getall")
    public Iterable<RiddleRomeoUserModel> getStudents() {
        return riddleService.listAll();
    }

    @PutMapping(value = "/edit/{id}")
    private RiddleRomeoUserModel update(@RequestBody RiddleRomeoUserModel user, @PathVariable(name = "id") String userid) {
        user.setUserId(userid);
        riddleService.saveorUpdate(user);
        return user;
    }

    @DeleteMapping("/delete/{id}")
    private void deleteStudent(@PathVariable("id") String _id) {
        riddleService.deleteUser(_id);
    }
    @GetMapping("/search/{id}")
    private RiddleRomeoUserModel getStudents(@PathVariable(name = "id") String userid) {
        return riddleService.getUserByID(userid);
    }


}
