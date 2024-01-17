package multipletable.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import multipletable.mapping.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    
}
