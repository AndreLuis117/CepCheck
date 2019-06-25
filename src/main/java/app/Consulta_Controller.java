package app;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Consulta_Controller {
    @FXML
    public TableView cepView;
    @FXML
    public Button consulta;
    @FXML
    public TextField cepField;

    private final ObservableList<Cep> data =
            FXCollections.observableArrayList(

            );


    public void consulta(ActionEvent actionEvent) {
        Cep cep = new Cep();
        Methods met = new Methods();
        data.clear();
        data.addAll(cep.getAll(met.getCep(cepField.getText())));
        cepView.setItems(data);
    }
}
