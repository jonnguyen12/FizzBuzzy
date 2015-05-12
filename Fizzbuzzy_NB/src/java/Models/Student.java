package Models;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author phucnguyen
 */
@Entity
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private String password;
    private String email;
    private int score;

//    @OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
//    private Progress progress;

    public Student() {
        this.username = "";
        this.password = "";
        this.email = "" ;
        this.score = 0;
//        this.progress = null;
    }

    public Student(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.score = 0;
    }

    public int getScore()
    {
        return score;
    }
    
    public void setScore(int score)
    {
        this.score += score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public Progress getProgress() {
//        return progress;
//    }
//
//    public void setProgress(Progress progress) {
//        this.progress = progress;
//    }

 


    
}
