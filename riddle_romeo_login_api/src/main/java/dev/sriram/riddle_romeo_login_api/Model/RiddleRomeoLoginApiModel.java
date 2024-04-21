package dev.sriram.riddle_romeo_login_api.Model;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;



@Document(collection = "users")
@Data
public class RiddleRomeoLoginApiModel {
    
    @Id
    private ObjectId id;
    
    private String name;
    
    private String email;
    
    private Long rank;
    
    private Long level;
    
    private Long noOfDaysActive;
    
    private List<String> skills;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RiddleRomeoLoginApiModel() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getExp() {
        return exp;
    }

    public void setExp(Long exp) {
        this.exp = exp;
    }

    public Long getRank() {
        return rank;
    }

    public void setRank(Long rank) {
        this.rank = rank;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public Long getNoOfDaysActive() {
        return noOfDaysActive;
    }

    public void setNoOfDaysActive(Long noOfDaysActive) {
        this.noOfDaysActive = noOfDaysActive;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    private String password;

    private Long exp;

    public RiddleRomeoLoginApiModel(ObjectId id, String name, String email, String password, Long exp, Long rank,
            Long level, Long noOfDaysActive, List<String> skills) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.exp = exp;
        this.rank = rank;
        this.level = level;
        this.noOfDaysActive = noOfDaysActive;
        this.skills = skills;
    }
}
