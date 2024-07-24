package dio.desafio_projeto_desing_patterns.controller;

import dio.desafio_projeto_desing_patterns.facade.CustomerFacade;
import dio.desafio_projeto_desing_patterns.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerFacade customerFacade;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerFacade.addCustomer(customer.getName(), customer.getEmail());
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerFacade.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerFacade.getCustomerById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerFacade.deleteCustomer(id);
    }
}