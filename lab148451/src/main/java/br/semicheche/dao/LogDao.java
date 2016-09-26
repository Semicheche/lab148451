package br.semicheche.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import br.semicheche.entities.Log;

/**
 * DAO for Log
 */
@Stateless
public class LogDao {
	@PersistenceContext(unitName = "lab148451-persistence-unit")
	private EntityManager em;

	public void create(Log entity) {
		em.persist(entity);
	}

	public void deleteById(Long id) {
		Log entity = em.find(Log.class, id);
		if (entity != null) {
			em.remove(entity);
		}
	}

	public Log findById(Long id) {
		return em.find(Log.class, id);
	}

	public Log update(Log entity) {
		return em.merge(entity);
	}

	public List<Log> listAll(Integer startPosition, Integer maxResult) {
		TypedQuery<Log> findAllQuery = em.createQuery(
				"SELECT DISTINCT l FROM Log l ORDER BY l.id", Log.class);
		if (startPosition != null) {
			findAllQuery.setFirstResult(startPosition);
		}
		if (maxResult != null) {
			findAllQuery.setMaxResults(maxResult);
		}
		return findAllQuery.getResultList();
	}
}
