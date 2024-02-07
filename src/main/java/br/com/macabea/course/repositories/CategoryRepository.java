package br.com.macabea.course.repositories;

import br.com.macabea.course.entites.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
