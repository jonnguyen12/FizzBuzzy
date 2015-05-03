package Database;

import Models.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

/**
 * Created by phucnguyen on 4/30/15.
 */
public class StudentDB {

    public static void showAllStudents() {
        EntityManager entityManager = DBUtil.getEntityManagerFactory().createEntityManager();
        String query = "SELECT u FROM Student u";
        List<Student> list = entityManager.createQuery(query, Student.class).getResultList();

        System.out.println(list);
        entityManager.close();
    }

    public static void insert(Student student) {
        EntityManager entityManager = DBUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        try {
            entityManager.persist(student);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            entityManager.close();
        }
    }


}
