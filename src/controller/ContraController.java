package controller;

import model.ContraModel;
import view.ContraView;

public class ContraController {
    private ContraModel model;
    private ContraView view;
    
    public ContraController(ContraModel model, ContraView view) {
        this.model = model;
        this.view = view;
    }
    
}
