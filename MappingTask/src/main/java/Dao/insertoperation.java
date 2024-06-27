package Dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Dto.Branches;
import Dto.TestYantra;

public class insertoperation {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	public void insertyantra(TestYantra t)
	{
		Branches branches1=new Branches();
		branches1.setBranchid(1);
		branches1.setBranchname("Rajajinagar");
		
		Branches branches2=new Branches();
		branches2.setBranchid(2);
		branches2.setBranchname("Hebbal");
		

		ArrayList a=new ArrayList();
		a.add(branches1);
		a.add(branches2);
		
		
		entityTransaction.begin();
		entityManager.persist(t);
		entityManager.persist(branches1);
		entityManager.persist(branches2);
		entityTransaction.commit();
	}
	
	
	public void insertbranches()
	{
		
	}

	public void insertjspiders()
	{
		
	}

	public void insertqspiders()
	{
		
	}

	public void insertjemployees()
	{
		
	}

	public void insertjstudents()
	{
		
	}

	public void insertjtrainers()
	{
		
	}

	public void insertqemployees()
	{
		
	}

	public void insertqstudents()
	{
		
	}
	public void insertqtariners()
	{
		
	}
}
