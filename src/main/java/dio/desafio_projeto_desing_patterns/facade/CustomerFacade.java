package dio.desafio_projeto_desing_patterns.facade;

import dio.desafio_projeto_desing_patterns.model.Customer;
import dio.desafio_projeto_desing_patterns.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerFacade {

    @Autowired
    private CustomerService customerService;

    public Customer addCustomer(String name, String email) {
        Customer customer = new Customer();
        customer.setName(name);
        customer.setEmail(email);
        return customerService.saveCustomer(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    public Customer getCustomerById(Long id) {
        return customerService.getCustomerById(id);
    }

    public void deleteCustomer(Long id) {
        customerService.deleteCustomer(id);
    }
}
