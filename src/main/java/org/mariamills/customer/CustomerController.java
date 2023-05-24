package org.mariamills.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // This annotation tells Spring that this class is a controller and that it should be treated as such.
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/api/v1/customers")
    public List<Customer> selectAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/api/v1/customers/{customerId}")
    public Customer selectCustomerById(@PathVariable("customerId") Integer customerId) {
        return customerService.getCustomerById(customerId);
    }
}
