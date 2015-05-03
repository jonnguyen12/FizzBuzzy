package Models;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by phucnguyen on 4/30/15.
 */
@Entity
public class Lesson {
    private int id;
    private String title;
    private String authorName;
    private int score;
    private int totalStudents;

    public Lesson(String title, String authorName, int score) {
        this.title = title;
        this.authorName = authorName;
        this.score = score;
    }

    public Lesson() {
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
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "authorName")
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Basic
    @Column(name = "score")
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Basic
    @Column(name = "totalStudents")
    public int getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lesson lesson = (Lesson) o;

        if (id != lesson.id) return false;
        if (score != lesson.score) return false;
        if (totalStudents != lesson.totalStudents) return false;
        if (title != null ? !title.equals(lesson.title) : lesson.title != null) return false;
        if (authorName != null ? !authorName.equals(lesson.authorName) : lesson.authorName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (authorName != null ? authorName.hashCode() : 0);
        result = 31 * result + score;
        result = 31 * result + totalStudents;
        return result;
    }

    private Collection<Student> students;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "lessons")
    public Collection<Student> getStudents() {
        return students;
    }

    public void setStudents(Collection<Student> students) {
        this.students = students;
    }
}
