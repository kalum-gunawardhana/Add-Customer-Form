package DBConnection;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class Connection {
    private static Connection con;
    private List<Customer> cusList;
    private Connection(){
        cusList=new ArrayList<>();
    }

    public static Connection getInstance(){
        if(con==null){
            return con=new Connection();
        }
        return con;
    }

    public List<Customer> getCustomerList(){
        return cusList;
    }
}
