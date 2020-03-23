package com.technomaker.demohibernate;


import com.technomaker.demohibernate.service.GestionnaireFormation;
import com.technomaker.demohibernate.simple.Formation;
import org.hibernate.Hibernate;
import org.hibernate.Session;

public class DemoHibernate {

	public static void main(String[] args) {

		// 1 : instanciation objet couche service
		GestionnaireFormation serviceGestionnaire = new GestionnaireFormation();
		
		// 2 : Instanciation Objet couche métier
		Formation formation = new Formation("HibernateTest");
		Formation formation1 = new Formation("Java 8");
		Formation formation2 = new Formation("Spring");
		// 3 : Utilisation du service  (création de formation)
		serviceGestionnaire.creerFormation(formation);
		serviceGestionnaire.creerFormation(formation1);
		serviceGestionnaire.creerFormation(formation2);


	}

}
