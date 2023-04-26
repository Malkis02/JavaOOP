package HW5.service;

import HW5.model.User;
import HW5.repository.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public void saveUser(User user) {
        if (user == null) {
            System.out.println("User is null!");
        }

        UserRepository.saveUser(user);

    }

    @Override
    public void removeUser(User user) {
        if (user != null) {
            UserRepository.removeUser(user);
        } else {
            System.out.println("User is null!");
        }
    }

    @Override
    public void updateUser(int index, User user) {
        if (user != null) {
            UserRepository.updateUser(index, user);
        } else {
            System.out.println("User is null!");
        }
    }

    @Override
    public List<User> getUserList() {
        return UserRepository.getUserList();
    }
}
