package dev.sriram.riddle_romeo_login_api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.sriram.riddle_romeo_login_api.Model.RiddleRomeoLoginApiModel;
import dev.sriram.riddle_romeo_login_api.Service.RiddleRomeoLoginApiService;

@RestController
@RequestMapping("/api/v1/loginData")
public class RiddleRomeoLoginApiController {
    
    @Autowired
    private RiddleRomeoLoginApiService riddleService;

    @GetMapping
    public ResponseEntity<List<RiddleRomeoLoginApiModel>> getAllUserData()
    {
        return new ResponseEntity<>(riddleService.allUserData(),HttpStatus.OK);
    }

}
