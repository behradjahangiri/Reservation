package repository;

import model.ClassInfo;
import util.JpaUtil;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

public class ClassInfoRepository {
    EntityManager entityManager = JpaUtil.getInstance().getEntityManager();
    public void save(ClassInfo classInfo) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        try {
            entityTransaction.begin();
            entityManager.persist(classInfo);
            entityTransaction.commit();
        }catch (Exception e) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
        }finally {
            entityManager.close();
        }
    }
    public void update(ClassInfo classInfo) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        try {
            entityTransaction.begin();
            entityManager.merge(classInfo);
            entityTransaction.commit();
        }catch (Exception e) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
        }finally {
            entityManager.close();
        }
    }
    public void delete(ClassInfo classInfo) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        try {
            entityTransaction.begin();
            entityManager.remove(classInfo);
            entityTransaction.commit();
        }catch (Exception e) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
        }finally {entityManager.close();}
    }
    public ClassInfo findById(int id) {
        return null;
    }
    public List<ClassInfo> findAll() {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        try {
            Query query = entityManager.createNamedQuery(ClassInfo.FIND_ALL);
            return query.getResultList();
        }finally {
            entityManager.close();
        }
    }
}
