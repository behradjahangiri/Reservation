//package repository;
//
//import model.Day;
//import util.JpaUtil;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Query;
//import java.util.List;
//
//public class DayRepository {
//    EntityManager entityManager = JpaUtil.getInstance().getEntityManager();
//    public void save(Day day) {
//        EntityTransaction entityTransaction = entityManager.getTransaction();
//        try {
//            entityTransaction.begin();
//            entityManager.persist(day);
//            entityTransaction.commit();
//        }catch (Exception e) {
//            if (entityTransaction.isActive()) {
//                entityTransaction.rollback();
//            }
//        }finally {
//            entityManager.close();
//        }
//    }
//
//    public void update(Day day) {
//        EntityTransaction entityTransaction = entityManager.getTransaction();
//        try {
//            entityTransaction.begin();
//            entityManager.merge(day);
//            entityTransaction.commit();
//        }catch (Exception e) {
//            if (entityTransaction.isActive()) {
//                entityTransaction.rollback();
//            }
//        }finally {entityManager.close();}
//    }
//
//    public void delete(Day day) {
//        EntityTransaction entityTransaction = entityManager.getTransaction();
//        try {
//            entityTransaction.begin();
//            entityManager.remove(day);
//            entityTransaction.commit();
//        }catch (Exception e) {
//            if (entityTransaction.isActive()) {
//                entityTransaction.rollback();
//            }
//        }finally {entityManager.close();}
//    }
//
//    public List<Day> findAll() {
//        EntityTransaction entityTransaction = entityManager.getTransaction();
//        try {
//            Query query = entityManager.createNamedQuery(Day.FIND_ALL);
//            return query.getResultList();
//        }finally {
//            entityManager.close();}
//    }
//    public Day findById(int id) {return null;}
//}
