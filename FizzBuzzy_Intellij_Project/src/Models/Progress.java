package Models;

import javax.persistence.*;

/**
 * Created by phucnguyen on 4/30/15.
 */
@Entity
public class Progress {
    private int id;
    private int totalScore;

    public Progress(int totalScore, Student student) {
        this.totalScore = totalScore;
        this.student = student;
    }

    public Progress() {
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "totalScore")
    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Progress progress = (Progress) o;

        if (id != progress.id) return false;
        if (totalScore != progress.totalScore) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + totalScore;
        return result;
    }

    private Student student;

    @OneToOne(mappedBy = "progress", optional = false)
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
