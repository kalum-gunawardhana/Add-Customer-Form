package Controller;

import DBConnection.Connection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Customer;

import java.io.IOException;
import java.util.ArrayList;

public class AddCustomerContollerForm {
    public TextField lblCustomerName;
    public TextField lblCustomerAddress;
    public TextField lblCustomerAge;
    public TextField lblCustomerSalary;
    public TableView tblCustomer;
    public TableColumn cloName;
    public TableColumn colAddress;
    public TableColumn colAge;
    public TableColumn colSalary;


    public void btnAddCustomerOnAction(ActionEvent actionEvent) {
        String name=lblCustomerName.getText();
        String address=lblCustomerAddress.getText();
        String age=lblCustomerAge.getText();
        Double salary= Double.valueOf(lblCustomerSalary.getText());

        Customer customer= new Customer(name,address,age,salary);
        Connection.getInstance().getCustomerList().add(customer);

        lblCustomerName.setText("");
        lblCustomerAddress.setText("");
        lblCustomerAge.setText("");
        lblCustomerSalary.setText("");
    }

    public void btnLoadCustomerOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/view_customer_form.fxml"))));
        stage.show();
    }

    private void loadTable(){
        ObservableList<Customer> customerObservableList= FXCollections.observableArrayList();
        cloName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colAge.setCellValueFactory(new PropertyValueFactory<>("age"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));

        Connection.getInstance().getCustomerList().forEach(obj->{
            customerObservableList.add(obj);

        });

        tblCustomer.setItems(customerObservableList);
    }
}
