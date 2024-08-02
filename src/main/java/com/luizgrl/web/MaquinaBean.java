package com.luizgrl.web;


import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;

import com.luizgrl.model.Maquina;
import com.luizgrl.service.MaquinaService;
import com.luizgrl.utils.FacesMessages;

import javax.inject.Inject;

@Named("maquinaBean")
@SessionScoped
public class MaquinaBean implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    private MaquinaService maquinaService;
    
    @Inject
    private FacesMessages facesMessage;
    
    private Maquina maquina;
    private List<Maquina> maquinas;
    private int idMaquina;

    @PostConstruct
    public void init() {
        maquina = new Maquina();
        loadMaquinas();
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }
    
    public List<Maquina> getMaquinas(){
    	return maquinas;
    }
    
    public void setIdMaquina(int id) {
    	this.idMaquina = id;
  
    }
    public int getIdMaquina() {
    	return idMaquina;
  
    }
    
    public void findById() {
    	System.out.println(idMaquina);
    	if(idMaquina < 1 ){
    		loadMaquinas();
    	}
    	else {
			maquinas.clear();
    		maquina = maquinaService.findMaquinaById(idMaquina);
    		if(maquina != null){
    			System.out.println("teste3");
            	maquinas.add(maquinaService.findMaquinaById(idMaquina));
    		}else {
    			System.out.println("teste");
    			facesMessage.info("Consulta não retornou dados");
    		}
    	}
        }

    public String createMaquina() {
        if (maquinaService != null) {
            maquinaService.criarMaquina(maquina);
            maquina = new Maquina();
            loadMaquinas();
            return "NewFile?faces-redirect=true"; 
        } else {
            System.out.println("maquinaService is null");
            return null;
        }
        
    }
    
    private void loadMaquinas() {
        if (maquinaService != null) {
            try {
                maquinas = maquinaService.findAllMaquinas();
                System.out.println("Máquinas carregadas: " + maquinas.size());
            } catch (Exception e) {
                System.out.println("Erro ao carregar máquinas: " + e.getMessage());
                e.printStackTrace(); 
            }
        } else {
            System.out.println("Nenhuma máquina encontrada no banco");
        }
    }
}
