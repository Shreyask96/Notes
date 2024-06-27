package Servlets_Markscard.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Servlets_Studentsmarkscard.dto.Admindto;

public class Admindao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public void insert(Admindto a)
	{
		entityTransaction.begin();
		entityManager.persist(a);
		entityTransaction.commit();
		
	}
	

}
