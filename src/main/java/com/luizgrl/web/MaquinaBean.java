package com.luizgrl.web;


import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import com.luizgrl.model.Maquina;
import com.luizgrl.service.MaquinaService;
import javax.inject.Inject;

@Named("maquinaBean")
@ViewScoped
public class MaquinaBean implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    private MaquinaService maquinaService;
    
    private Maquina maquina;

    @PostConstruct
    public void init() {
        maquina = new Maquina();
    }

    // Getters e setters
    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public void createMaquina() {
        if (maquinaService != null) {
            maquinaService.criarMaquina(maquina);
            maquina = new Maquina();
        } else {
            System.out.println("maquinaService is null");
        }
    }
   
}
