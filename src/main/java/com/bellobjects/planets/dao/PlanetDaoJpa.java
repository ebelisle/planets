package com.bellobjects.planets.dao;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.bellobjects.planets.model.Planet;

@Repository
public class PlanetDaoJpa {

    @PersistenceUnit
    private EntityManager em;

    public Collection<Planet> getPlanets() {

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
