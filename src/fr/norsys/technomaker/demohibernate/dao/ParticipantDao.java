package fr.norsys.technomaker.demohibernate.dao;

import fr.norsys.technomaker.demohibernate.simple.Participant;
import fr.norsys.technomaker.demohibernate.simple.util.HibernateUtil;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.stat.Statistics;

public class ParticipantDao {

    public Long save(Participant participant) {

        Statistics stats1 = HibernateUtil.getSessionFactory().getStatistics();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Long participantId = null;
        try {
            session.saveOrUpdate(participant);
            tx.commit();
            participantId = participant.getId();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            session.close();
        }

        stats1.logSummary();
        return participantId;
    }


}
