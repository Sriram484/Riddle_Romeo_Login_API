package dev.sriram.riddle_romeo_login_api.Model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Document(collection = "scores")
@Data
public class RiddleRomeoScoreModel {
    @Id
    public String scoreId;

    public String userId;
    public long overAllScore;
    public long weeklyScore;
    public long eventScore;
    public long rank;

    // Constructor
    public RiddleRomeoScoreModel(String scoreId,String userId, long overAllScore, long weeklyScore, long eventScore, long rank) {
        this.scoreId = scoreId;
        this.userId = userId;
        this.overAllScore = overAllScore;
        this.weeklyScore = weeklyScore;
        this.eventScore = eventScore;
        this.rank = rank;

    }

    // Empty constructor
    public RiddleRomeoScoreModel() {
    }

    // Getters and setters
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

    public long getOverAllScore() {
        return overAllScore;
    }

    public void setOverAllScore(long overAllScore) {
        this.overAllScore = overAllScore;
    }

    public long getWeeklyScore() {
        return weeklyScore;
    }

    public void setWeeklyScore(long weeklyScore) {
        this.weeklyScore = weeklyScore;
    }

    public long getEventScore() {
        return eventScore;
    }

    public void setEventScore(long eventScore) {
        this.eventScore = eventScore;
    }

    public long getRank() {
        return rank;
    }

    public void setRank(long rank) {
        this.rank = rank;
    }
}
