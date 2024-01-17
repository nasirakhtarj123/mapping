package multipletable.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import multipletable.mapping.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}
