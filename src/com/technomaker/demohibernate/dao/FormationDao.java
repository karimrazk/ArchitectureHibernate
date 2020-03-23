package com.technomaker.demohibernate.dao;


import com.technomaker.demohibernate.simple.Formation;
import com.technomaker.demohibernate.simple.util.HibernateUtil;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.stat.Statistics;

public class FormationDao {

	// Rendre persistant une formation 
	// Tous le code 'technique' liés aux exceptions et gestion Session est ici

    public Long creerFormation(Formation formation) {

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
