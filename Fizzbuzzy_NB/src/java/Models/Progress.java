package Models;

import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author phucnguyen
 */
@Entity
public class Progress implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private int totalScore;
    private int currentLessonID;
    
    @OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    private Student student;
    
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
