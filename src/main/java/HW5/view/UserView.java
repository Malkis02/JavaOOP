package HW5.view;

import HW5.controller.UserBalanceController;
import HW5.controller.UserController;
import HW5.model.User;

import java.util.List;

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.saveUser("Ivan", 30);
        userController.saveUser("Alexey", 20);
        userController.saveUser("Irina", 40);
        userController.saveUser("Michael", 80);
        userController.saveUser("Vladislav", 14);
        printUsers(userController.getUserList());

        UserBalanceController userBalanceController = new UserBalanceController();
        userBalanceController.payment(0, 20000);
        userBalanceController.payment(1, 2000);
        userBalanceController.payment(2, 40000);
        userBalanceController.payment(3, 90000);
        userBalanceController.payment(4, 500000000);
        userBalanceController.payment(1, 9999);
        printUsers(userController.getUserList());

        userBalanceController.withdrawal(1, 999000);
        printUsers(userController.getUserList());

    }

    public static void printUsers(List<User> userList) {
        int i = 0;
        for (User user : userList) {
            System.out.printf("index: %d %s \n", i, user);
            i++;
        }
    }
}
