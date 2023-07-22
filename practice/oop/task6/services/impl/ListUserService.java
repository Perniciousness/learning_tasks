package practice.oop.task6.services.impl;

import java.util.List;

import practice.oop.task6.models.User;
import practice.oop.task6.services.UserService;

public class ListUserService implements UserService {

    private List<User> userDirectory;
    
    public ListUserService(List<User> userDirectory) {
        this.userDirectory = userDirectory;
    }

    @Override
    public void addUser(User user) {        
        userDirectory.add(user);
    }

    @Override
    public void deleteUser(User user) {
        userDirectory.remove(user);
    }

    @Override
    public User findUser(String name) {
        
        for (User user : userDirectory){
            if (user.getName().equalsIgnoreCase(name)){
                int i = userDirectory.indexOf(user);
                return userDirectory.get(i);
            }
        }
        return null;
    }
}
