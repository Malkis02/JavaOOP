package HW5.service;

import HW5.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    void removeUser(User user);

    void updateUser(int index, User user);

    List<User> getUserList();
}
