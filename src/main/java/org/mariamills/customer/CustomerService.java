package org.mariamills.customer;

import org.mariamills.exception.ResourceNotFound;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // This annotation tells Spring that this class is a service and that it should be treated as such.
public class CustomerService {
    private final CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public List<Customer> getAllCustomers() {
        return customerDao.selectAllCustomers();
    }

    public Customer getCustomerById(Integer id) {
        return customerDao.selectCustomerById(id)
                .orElseThrow(() -> new ResourceNotFound("Customer " + id + " does not exist"));
    }
}
