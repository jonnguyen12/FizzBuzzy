package Database;

import org.hibernate.jpa.HibernatePersistenceProvider;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.spi.PersistenceProvider;
import java.util.HashMap;

/**
 * Created by phucnguyen on 5/1/15.
 */
public class DBUtil {
    private static final  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("NewPersistanceUnit");

    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }
}
