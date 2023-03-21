package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import models.MainModel;
import views.MainPanel;

public class MainController {
    MainPanel mainPanel;
    MainModel mainModel;
    public MainController() {
        this.mainPanel=new MainPanel();
        this.mainModel=new MainModel();
        this.handleEvent();
    }
    public MainPanel getMainPanel() {
        return this.mainPanel;
    }
    public MainModel getMainModel() {
        return this.mainModel;
    }
    private void handleEvent(){
        ComboBox<String> combo=this.mainPanel.getComboPanel();
        combo.setOnAction(e -> this.selectCategory());
    }
    private void selectCategory(){
        int selected=this.mainPanel.getComboPanel().getSelectionModel().getSelectedIndex()+1;
        ObservableList<String> newFruitList = FXCollections.observableArrayList();

        this.mainModel.getFruits().forEach(fruit -> {
            if (selected==fruit.getCategory()){
                newFruitList.add(fruit.getName());
            }
        });
        this.mainPanel.getListPanel().setFruits(newFruitList);
    }
}
