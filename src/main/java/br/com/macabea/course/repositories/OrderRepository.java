package br.com.macabea.course.repositories;

import br.com.macabea.course.entites.Order;
import br.com.macabea.course.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
