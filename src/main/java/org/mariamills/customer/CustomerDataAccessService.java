package org.mariamills.customer;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository // This annotation tells Spring that this class is a repository and that it should be treated as such.
public class CustomerDataAccessService implements CustomerDao {
    //Mock db
    private static List<Customer> customers;

    static {
        customers = new ArrayList<Customer>();
        customers.add(new Customer(1, "Maria", "maria@email.com", 27));
        customers.add(new Customer(2, "John", "john@email.com", 30));
        customers.add(new Customer(3, "Alex", "alex@email.com", 21));

    }

    @Override
    public List<Customer> selectAllCustomers() {
        return customers;
    }

    @Override
    public Optional<Customer> selectCustomerById(Integer id) {
        return customers.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();
    }
}
