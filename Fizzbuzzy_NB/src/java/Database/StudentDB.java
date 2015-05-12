package Database;

import Models.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

public class StudentDB {

    public static void insert(Student student) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();

        try {
            trans.begin();
            em.persist(student);
            trans.commit();
        } catch (Exception e) {
            trans.rollback();
        } finally {
            em.close();
        }
    }

    public static Student getStudentById (int studentId) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        try {
            Student student = em.find(Student.class, studentId);
            return student;
        } finally {
            em.close();
        }
    }

    public static Student selectStudent(String email) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        String qString = "SELECT s FROM Student s " + "WHERE s.email = :email";
        TypedQuery<Student> q = em.createQuery(qString, Student.class);
        q.setParameter("email", email);

        Student student = null;

        try {
            student = q.getSingleResult();
        } catch (NoResultException e) {
            System.out.println(e);
        } finally {
            em.close();
        }
        return student;
    }
    
    public static void updateScore (Student student)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();

        try {
            trans.begin();
            em.merge(student);
            trans.commit();
        } catch (Exception e) {
            trans.rollback();
        } finally {
            em.close();
        }        
    }
}
