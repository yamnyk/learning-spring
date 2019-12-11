package app.service;

import app.entity.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
  private final Map<Integer, User> data = new HashMap<>();

  public UserService() {
    this.data.put(1, new User("Gogi"));
    this.data.put(2, new User("Sosisa"));
    this.data.put(3, new User("Lololo"));
  }

  public Collection<User> getAll() {
    return this.data.values();
  }

  public User getOne(int id) {
    return this.data.get(id);
  }

  public User createOne(String name) {
    return this.data.put(this.data.size()+1, new User(name));
  }
}
