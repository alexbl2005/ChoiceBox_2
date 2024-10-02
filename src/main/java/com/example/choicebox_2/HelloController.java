package com.example.choicebox_2;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private ChoiceBox<String> cb;
    @FXML
    private Label Hola;

    public void initialize(){
        cb.getItems().addAll("Español", "English", "Français", "Deutsch");
        cb.setOnAction(this::traducir);
    }

    public void traducir(ActionEvent event){
        String traduccion = cb.getValue();

        switch (traduccion)
        {
            case "Español": Hola.setText("Hola");
                break;
            case "English":Hola.setText("Hello");
                break;
            case "Français":Hola.setText("Bonjour");
                break;
            case "Deutsch":Hola.setText("Hallo");
                break;
        }
    }
}