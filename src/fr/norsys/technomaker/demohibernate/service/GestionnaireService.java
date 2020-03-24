package fr.norsys.technomaker.demohibernate.service;

import fr.norsys.technomaker.demohibernate.dao.FormationDao;
import fr.norsys.technomaker.demohibernate.dao.ParticipantDao;
import fr.norsys.technomaker.demohibernate.simple.Formation;
import fr.norsys.technomaker.demohibernate.simple.Participant;

import java.util.ArrayList;


public class GestionnaireService {

    FormationDao formationDao;
    ParticipantDao participantDao;

    public GestionnaireService() {
        this.formationDao = new FormationDao();
        this.participantDao = new ParticipantDao();
    }

    public Long creerFormation(Formation formation) {
        return this.formationDao.save(formation);
    }

    public Long creerParticipant(Participant participant) {
        return this.participantDao.save(participant);
    }


}
