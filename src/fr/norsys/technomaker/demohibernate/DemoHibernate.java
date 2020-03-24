package fr.norsys.technomaker.demohibernate;


import fr.norsys.technomaker.demohibernate.service.GestionnaireService;
import fr.norsys.technomaker.demohibernate.simple.Formation;
import fr.norsys.technomaker.demohibernate.simple.Participant;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DemoHibernate {

    public static void main(String[] args) {

        GestionnaireService gestionnaireService = new GestionnaireService();
        ArrayList<Participant> participants = new ArrayList<>();

        Formation formation = new Formation("HibernateTest");
        Participant karim = new Participant("karim", "razouk", "karim@razouk");
        Long formationId = gestionnaireService.creerFormation(formation);
        Long karimId = gestionnaireService.creerParticipant(karim);

        formation.setId(formationId);
        karim.setId(karimId);

        participants.add(karim);
        gestionnaireService.creerParticipant(karim);
        gestionnaireService.creerFormation(formation);


    }

}
