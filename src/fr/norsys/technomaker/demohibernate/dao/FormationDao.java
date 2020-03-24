package fr.norsys.technomaker.demohibernate.dao;

import fr.norsys.technomaker.demohibernate.simple.Formation;
import fr.norsys.technomaker.demohibernate.simple.util.HibernateUtil;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.stat.Statistics;

public class FormationDao {

    public Long save(Formation formation) {

        Statistics stats = HibernateUtil.getSessionFactory().getStatistics();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Long formationId = null;
        try {
            session.saveOrUpdate(formation);
            tx.commit();
            formationId = formation.getId();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            session.close();
        }

        stats.logSummary();
        return formationId;
    }


}
