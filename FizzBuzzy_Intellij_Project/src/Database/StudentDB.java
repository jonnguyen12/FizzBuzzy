package Database;

import Models.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by phucnguyen on 4/30/15.
 */
public class StudentDB {
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("NewPersistanceUnit");

    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }


    public static void showAllStudents() {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        String query = "SELECT u FROM Student u";
        List<Student> list = entityManager.createQuery(query, Student.class).getResultList();

        System.out.println(list);
        entityManager.close();
    }

    public static void insert(Student student) {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        try {
            entityManager.persist(student);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e);
            transaction.rollback();
        } finally {
            entityManager.close();
        }
    }


}
