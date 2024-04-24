package dev.sriram.riddle_romeo_login_api.Model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;



@Document(collection = "users")
@Data
public class RiddleRomeoUserModel {

    public RiddleRomeoUserModel() {
    }
    @Id
    private String userId; 
    
    private String scoreId;; 
    private String userName;
    private String name;
    private String image;
    private String email;
    private String password;
    private String birthDay;
    private String country;
    private String phone;
    public RiddleRomeoUserModel(String userId, String scoreId, String userName, String name, String email,
        String password, String birthDay, String country, String phone,String image) {
        this.userId = userId;
        this.scoreId = scoreId;
        this.userName = userName;
        this.name = name;
        this.email = email;
        this.image = image;
        this.password = password;
        this.birthDay = birthDay;
        this.country = country;
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getScoreId() {
        return scoreId;
    }
    public void setScoreId(String scoreId) {
        this.scoreId = scoreId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

}
