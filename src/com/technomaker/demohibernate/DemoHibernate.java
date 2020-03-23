package com.technomaker.demohibernate;


import com.technomaker.demohibernate.service.GestionnaireFormation;
import com.technomaker.demohibernate.simple.Formation;

public class DemoHibernate {

	public static void main(String[] args) {
		
		// 1 : instanciation objet couche service
		GestionnaireFormation serviceGestionnaire = new GestionnaireFormation();
		
		// 2 : Instanciation Objet couche m�tier
		Formation formation = new Formation("Hibernate");
		
		// 3 : Utilisation du service  (cr�ation de formation)
		serviceGestionnaire.creerFormation(formation);
		
	}

}
