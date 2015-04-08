package Models;

import java.io.Serializable;

/**
 *
 * @author phucnguyen
 */
public class Progress implements Serializable {
    private int id;
    private int totalScore;
    private int currentLessonID;
    
    public Progress() {
        this.id = 0;
        this.totalScore = 0;
        this.currentLessonID = 0;
    }

    public Progress(int id, int totalScore, int currentLessonID) {
        this.id = id;
        this.totalScore = totalScore;
        this.currentLessonID = currentLessonID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getCurrentLessonID() {
        return currentLessonID;
    }

    public void setCurrentLessonID(int currentLessonID) {
        this.currentLessonID = currentLessonID;
    }
}
