package controllers;

import java.util.List;

import models.Socio;

public class SocioController {
    private SocioController(){}
    SocioController instance;

    public SocioController getInstance() {
        if (instance == null) {
            instance = new SocioController();
        }
        return instance;
    }

    List<Socio> socios;
    
}
