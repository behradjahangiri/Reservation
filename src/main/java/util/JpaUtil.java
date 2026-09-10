package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class JpaUtil {
    private final static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("reservation");
    private final static JpaUtil JPA_UTIL = new JpaUtil();

    private JpaUtil() {
    }

    public static JpaUtil getInstance() {return JPA_UTIL;}

    public EntityManager getEntityManager() {return ENTITY_MANAGER_FACTORY.createEntityManager();}

    public static void closeEntityManager(){
        if(ENTITY_MANAGER_FACTORY.isOpen()){
            ENTITY_MANAGER_FACTORY.close();
        }
    }
}

