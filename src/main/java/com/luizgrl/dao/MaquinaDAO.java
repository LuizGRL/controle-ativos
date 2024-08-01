package com.luizgrl.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import com.luizgrl.model.Maquina;

import java.util.List;

import javax.ejb.LocalBean;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
@LocalBean
public class MaquinaDAO {
	
    @PersistenceContext(unitName = "mysqldb")
    private EntityManager em;
    
    public void create(Maquina maquina) {
        em.persist(maquina);
    }
    
    public Maquina findById(long id) {
        return em.find(Maquina.class, id);
    }
    
    public List<Maquina> findAllMaquinas(){
    	Query query = em.createQuery("SELECT m FROM Maquina m");
    	return (List<Maquina>) query.getResultList();
    	
    }
}	
