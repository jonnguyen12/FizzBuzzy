package Models;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.*;
/**
 *
 * @author phucnguyen
 */
@Entity
public class Lesson implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String title;
    private String authorName;
    private int score;
    private int totalStudents;
    private ArrayList<String> htmlPages;
    
    public Lesson() {
        this.id = 0;
        this.title = "";
        this.authorName = "";
        this.score = 0;
        this.totalStudents = 0;
        htmlPages = new ArrayList<String>();
    }

  
    public Lesson(String title, String authorName, int score) {
        this.title = title;
        this.authorName = authorName;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }
}
