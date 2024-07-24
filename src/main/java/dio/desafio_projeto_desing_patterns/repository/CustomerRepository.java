package dio.desafio_projeto_desing_patterns.repository;

import dio.desafio_projeto_desing_patterns.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}