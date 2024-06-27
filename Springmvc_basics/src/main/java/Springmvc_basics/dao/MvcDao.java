package Springmvc_basics.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import Springmvc_basics.dto.MvcDto;

@Component
public class MvcDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public String insert(MvcDto dto) {
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
		
		return "Data inserted";
	}
	
	

	public String deletebyid(int id) {
		MvcDto e = entityManager.find(MvcDto.class, id);
		if (e != null) {
			entityTransaction.begin();
			entityManager.remove(e);
			entityTransaction.commit();

			return "data deleted";
		} else {
			return "data not deleted";
		}

	}
	
	
	public String fetchbyid(int id)
	{
		MvcDto e= entityManager.find(MvcDto.class, id);
		if(e !=null)
		{
			System.out.println(e.getId());
			System.out.println(e.getName());
			
			return "data found";
		}else
		{
			return "data not found";
		}
	}
	
	
	public String deleteAll()
	{
		Query q=entityManager.createQuery("select a from MvcDto a");
		List<MvcDto> l=q.getResultList();
		
		if(l.isEmpty())
		{
			return "data not found";
		}else
		{
			for( MvcDto d:l) {
				entityTransaction.begin();
				entityManager.remove(d);
				entityTransaction.commit();
			}
			return "data deleted";
		}	
	}
	
	
	public List<MvcDto> fetchall()
	{
		Query q=entityManager.createQuery("select a from MvcDto a");
		List<MvcDto> list=q.getResultList();
			
		return list;	
		
	}
	
	
	
	
	
	
//	public void update(MvcDto d)
//	{
//		MvcDto dto=entityManager.find(MvcDto.class, d.getId());
//
//		entityTransaction.begin();
//		entityManager.merge(dto);
//		entityTransaction.commit();
//	}
}







