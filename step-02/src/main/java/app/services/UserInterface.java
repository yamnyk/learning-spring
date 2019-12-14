package app.services;

import app.entities.Person;

import java.util.List;

public interface UserInterface {
  List<Person> get();
  void add(String name);
}
