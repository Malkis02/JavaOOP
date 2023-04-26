package HW5.model;

import lombok.*;

@Getter
@Setter
@ToString
public class User {
    private String name;
    private int age;
    private int balance;

    public User(String name,int age){
        this.name = name;
        this.age = age;
        this.balance = 0;
    }

    public void payment(int amount) {
        this.balance += amount;
    }

    public int withdrawal(int amount) {
        amount = Math.min(amount, this.balance);
        this.balance -= amount;
        return amount;
    }
}
