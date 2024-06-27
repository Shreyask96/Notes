package servlets_basics.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import servlets_basics.dto.Employee;

public class EmployeeDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	

	public void insert(Employee e) {
		entityTransaction.begin();
		entityManager.persist(e);
		entityTransaction.commit();
	}
	
	

	public void delete(int id) {
		// System.out.println(id);

		Employee e1 = entityManager.find(Employee.class, id);
		entityTransaction.begin();
		entityManager.remove(e1);
		entityTransaction.commit();

	}
	
	

	public Object fetch(int id) {

		Employee e1 = entityManager.find(Employee.class, id);

		if (e1 != null) {
			System.out.println(e1.getId());
			System.out.println(e1.getName());
			System.out.println(e1.getPassword());
			System.out.println(e1.getGender());
			System.out.println(e1.getMail());
			System.out.println(e1.getDob());

		} else {
			return "Data not found";
		}
		return e1;
	}

	
	
	public List<Employee> fetchall() {
		Query q = entityManager.createQuery("Select a from Employee a");
		List<Employee> w = q.getResultList();

		return w;
	}
	
	

	public Object deleteall() {
		Query q = entityManager.createQuery("select a from Employee a");
		List<Employee> w = q.getResultList();

		if (w.isEmpty()) {

			return "data not found";

		} else {
			for (Employee e : w) {
				entityTransaction.begin();
				entityManager.remove(e);
				entityTransaction.commit();
			}
			return "Data deleted";
		}
	}

	public void updateAll(Employee e1) {
//		Employee e=entityManager.find(Employee.class, e1.getId());
//		e.setName(e1.getName());
//		e.setPassword(e1.getPassword());
//		e.setMail(e1.getMail());
//		e.setDob(e1.getDob());

//		entityTransaction.begin();
//		entityManager.merge(e1);
//		entityTransaction.commit();
	}
}
