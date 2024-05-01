package dev.sriram.riddle_romeo_login_api.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.sriram.riddle_romeo_login_api.Model.RiddleRomeoScoreModel;
import dev.sriram.riddle_romeo_login_api.Service.RiddleRomeoScoreService;


@RestController
@CrossOrigin(origins = "https://riddle-romeo.netlify.app/")
@RequestMapping("/api/v1/score")
public class RiddleRomeoScoreController {
    
    @Autowired
    private RiddleRomeoScoreService riddleService;

  
    @PostMapping(value = "/save")
    private String saveStudent(@RequestBody RiddleRomeoScoreModel user) {

        riddleService.saveorUpdate(user);
        return user.getScoreId();
    }

    @GetMapping(value = "/getall")
    public Iterable<RiddleRomeoScoreModel> getStudents() {
        return riddleService.listAll();
    }

    @PutMapping(value = "/edit/{id}")
    private RiddleRomeoScoreModel update(@RequestBody RiddleRomeoScoreModel user, @PathVariable(name = "id") String scoreid) {
        user.setScoreId(scoreid);
        riddleService.saveorUpdate(user);
        return user;
    }

    @DeleteMapping("/delete/{id}")
    private void deleteStudent(@PathVariable("id") String _id) {
        riddleService.deleteUser(_id);
    }
    @RequestMapping("/search/{id}")
    private RiddleRomeoScoreModel getStudents(@PathVariable(name = "id") String userid) {
        return riddleService.getUserByID(userid);
    }
    private static final Logger logger=LoggerFactory.getLogger(RiddleRomeoScoreController.class);
    @GetMapping("/")
    public String hello()
    { 
        logger.info("Info is printed");
        return "Hello all good morning :)";
    }
}
