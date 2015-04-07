package Models;

import java.io.Serializable;

/**
 *
 * @author phucnguyen
 */
public class Student implements Serializable {
    private int id;
    private String username;
    private String password;
    private String email;
    private int progressID;

    public Student() {
        this.id = 0;
        this.username = "";
        this.password = "";
        this.email = "" ;
        this.progressID = 0;
        
    }
    
    public Student(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
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

    public int getProgressID() {
        return progressID;
    }

    public void setProgressID(int progressID) {
        this.progressID = progressID;
    }

    

    
}
