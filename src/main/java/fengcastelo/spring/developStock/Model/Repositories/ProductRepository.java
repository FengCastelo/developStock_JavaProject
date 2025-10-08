package fengcastelo.spring.developStock.Model.Repositories;

import fengcastelo.spring.developStock.Model.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
