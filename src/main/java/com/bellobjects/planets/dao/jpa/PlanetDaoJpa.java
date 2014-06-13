package com.bellobjects.planets.dao.jpa;

import static org.junit.Assert.assertNotNull;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bellobjects.planets.dao.PlanetDao;
import com.bellobjects.planets.model.Planet;

@Repository
@Transactional(readOnly=true)
public class PlanetDaoJpa implements PlanetDao {

    @PersistenceContext
    private EntityManager em;

    /* (non-Javadoc)
     * @see com.bellobjects.planets.dao.jpa.PlanetDao#getPlanets()
     */
    @Override
    public Collection<Planet> getPlanets() {
        assertNotNull(em);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Planet> criteriaQuery = cb.createQuery(Planet.class);
        Root<Planet> root = criteriaQuery.from(Planet.class);
        criteriaQuery.select(root);
        
        TypedQuery<Planet> typedQuery = em.createQuery(criteriaQuery);
        List<Planet> planets = typedQuery.getResultList();

        return planets;
    }

    public Collection<Planet> getPlanets2() {
        CriteriaQuery<Planet> criteriaQuery = em.getCriteriaBuilder().createQuery(Planet.class);
        return em.createQuery(criteriaQuery.select(criteriaQuery.from(Planet.class))).getResultList();
    }
    
    
    
}
