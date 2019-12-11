package app.controller;

import app.entity.User;
import app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class UserController {
  private final UserService userService;

  public UserController( @Autowired UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/users")
  private Collection<User> getAll () {
    return userService.getAll();
  }

  @GetMapping("/users/{id}")
  private User get(@PathVariable int id) {
    return userService.getOne(id);
  }

  @PostMapping("/users/add")
  private User addOne (@RequestParam String name) {
    User one = userService.createOne(name);
    System.out.println(one);
    return one;
  }
}
