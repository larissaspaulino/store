package br.com.macabea.course.repositories;

import br.com.macabea.course.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
