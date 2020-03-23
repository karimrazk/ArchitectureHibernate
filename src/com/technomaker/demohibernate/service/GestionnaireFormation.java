package com.technomaker.demohibernate.service;

import com.technomaker.demohibernate.dao.FormationDao;
import com.technomaker.demohibernate.simple.Formation;

public class GestionnaireFormation {

    FormationDao formationDao;

    // Rendre persistant une formation : déléguer à couche Dao !

    public GestionnaireFormation() {
        this.formationDao = new FormationDao();
    }

    public Long creerFormation(Formation formation) {
        return this.formationDao.creerFormation(formation);
    }
}
