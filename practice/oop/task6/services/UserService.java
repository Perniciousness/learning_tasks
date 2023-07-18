package practice.oop.task6.services;

import practice.oop.task6.models.User;

public interface UserService {
    
    void addUser(User user);

    void deleteUser(User user);

    User findUser(String name);
}
