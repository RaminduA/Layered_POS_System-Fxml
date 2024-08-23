package businessObject.custom.impl;

import businessObject.custom.CustomerBO;
import dataAccessObject.DAOFactory;
import dataAccessObject.custom.CustomerDAO;
import dataTransferObject.CustomerDTO;
import entity.Customer;

import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBOImpl implements CustomerBO {
    private final CustomerDAO customerDAO=(CustomerDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOType.CUSTOMER);

    @Override
    public boolean addCustomer(CustomerDTO dto) {
        try {
            return customerDAO.add(new Customer(dto.getCustomerId(),dto.getName(),dto.getAddress(),dto.getContact(),dto.getNic()));
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateCustomer(CustomerDTO dto) {
        try {
            return customerDAO.update(new Customer(dto.getCustomerId(),dto.getName(),dto.getAddress(),dto.getContact(),dto.getNic()));
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteCustomer(String id) {
        try {
            return customerDAO.delete(id);
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() {
        ArrayList<CustomerDTO> customers=new ArrayList<>();
        try {
            ArrayList<Customer> customerList=customerDAO.getAll();
            for(Customer customer : customerList) {
                customers.add(
                    new CustomerDTO(customer.getCustomerId(),customer.getName(),customer.getAddress(),customer.getContact(),customer.getNic())
                );
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return customers;
    }

    @Override
    public String getCustomerId() {
        try {
            return customerDAO.getId();
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return "";
    }

}
