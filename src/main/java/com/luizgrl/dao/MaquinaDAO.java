package com.luizgrl.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import com.luizgrl.model.Maquina;
import javax.ejb.LocalBean;
import javax.persistence.PersistenceContext;

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
}
