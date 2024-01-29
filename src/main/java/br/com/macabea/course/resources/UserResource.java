package br.com.macabea.course.resources;

import br.com.macabea.course.entites.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {
    @GetMapping("/all")
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "John", "Doe", "jdoe@bol.com.br", "123456");
        return ResponseEntity.ok().body(u);
    }
}
