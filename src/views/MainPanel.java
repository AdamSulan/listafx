package views;

import javafx.scene.layout.VBox;

public class MainPanel extends VBox{
    ComboPanel comboPanel=new ComboPanel();
    ListPanel listPanel=new ListPanel();
    public MainPanel() {
        this.comboPanel=new ComboPanel();
        this.listPanel=new ListPanel();

        this.getChildren().add(this.comboPanel);
        this.getChildren().add(this.listPanel);
    }
    public ComboPanel getComboPanel() {
        return comboPanel;
    }
    public ListPanel getListPanel() {
        return listPanel;
    }
}
