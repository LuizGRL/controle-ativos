package com.luizgrl.service;

import com.luizgrl.dao.MaquinaDAO;
import com.luizgrl.model.Maquina;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class MaquinaService {

    @Inject
    private MaquinaDAO maquinaDAO;

    public void criarMaquina(Maquina maquina) {
        maquinaDAO.create(maquina);
    }

    public Maquina findMaquinaById(long id) {
        return maquinaDAO.findById(id);
    }
}
