package app.services;

import app.entities.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class UserServiceV2 implements UserInterface {
  private final List<Person> content = new LinkedList<>();

  @Bean
  public UserInterface UserService_V2() { return new UserServiceV2(); }

  public UserServiceV2() {
    content.add(new Person("Tinky-winky"));
    content.add(new Person("Dipsy"));
    content.add(new Person("Lala"));
    content.add(new Person("Po"));
  }

  @Override
  public List<Person> get() {
    return content;
  }

  @Override
  public void add(String name) {
    content.add(new Person(name));
  }
}
