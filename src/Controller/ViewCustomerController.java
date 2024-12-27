package Controller;

import DBConnection.Connection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Customer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static sun.net.www.MimeTable.loadTable;

public class ViewCustomerController {
    public TableView tblCustomer;
    public TableColumn cloName;
    public TableColumn colAddress;
    public TableColumn colAge;
    public TableColumn colSalary;

    public void btnLoadCustomerOnAction(ActionEvent actionEvent) {

        loadTable();
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
