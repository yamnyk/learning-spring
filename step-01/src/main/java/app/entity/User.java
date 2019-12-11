package app.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private final String name;

  public User(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
