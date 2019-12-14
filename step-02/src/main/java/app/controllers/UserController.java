package app.controllers;

import app.entities.Person;
import app.services.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
  private final UserInterface userService;

  public UserController(
    @Autowired
//    @Qualifier("UserService_V2")
      UserInterface userService) {
    this.userService = userService;
  }

  @GetMapping
  public List<Person> getAllPersons() {
    return userService.get();
  }

  @GetMapping(path = "/add/{name}")
  public List<Person> addOneByName(@PathVariable String name) {
    userService.add(name);
    return userService.get();
  }

  @RequestMapping(method = RequestMethod.POST, path = "/add")
  public List<Person>addOneByName_post (@RequestParam String name) {
    userService.add(name);
    return userService.get();
  }
}
