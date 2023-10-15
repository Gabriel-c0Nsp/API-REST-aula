package dio.web.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import dio.web.api.repository.UserRepository;
import dio.web.api.model.User;

import java.util.List;

@RestController
public class UserController {

  @Autowired
  private UserRepository repository;

  @GetMapping("/users")
  public List<User> getUsers() {
    return repository.listAll();
  }

  @GetMapping("/user/{id}")
  public User getOne(@PathVariable("id") Integer id) {
    return repository.finById(id);
  }

  @DeleteMapping("/users/{id}")
  public void delete(@PathVariable("id") Integer id) {
    repository.remove(id);
  }

  @PostMapping("/users")
  public void postUser(@RequestBody User user) {
    repository.save(user);
  }
}
