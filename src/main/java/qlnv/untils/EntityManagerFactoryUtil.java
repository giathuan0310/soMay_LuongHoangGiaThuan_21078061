package qlnv.untils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerFactoryUtil {
	private EntityManagerFactory emf;
	private EntityManager em;
	public EntityManagerFactoryUtil() {
		emf = Persistence.createEntityManagerFactory("quanlynhanvien");
		em = emf.createEntityManager();
	}

	public EntityManager getEm() {
		return em;
	}
	public void close() {
		// TODO Auto-generated method stub
		em.close();
		emf.close();
	}
}

