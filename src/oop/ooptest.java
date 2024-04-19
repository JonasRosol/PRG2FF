package oop;

public class ooptest {
    int balance;
    int debt = 0;
    public ooptest(int balance) {
        this.balance = balance;
    }
    void bet() {
        if (this.balance < 150) {
            System.out.println("Nelze");
        } else {
            balance -= 150;
            int cislo1 = (int) (Math.random() * 7 + 1);
            int cislo2 = (int) (Math.random() * 7 + 1);
            int cislo3 = (int) (Math.random() * 7 + 1);

            if (cislo1 == cislo2 && cislo2 == cislo3) {
                balance += 1500;
            }
        }
    }
    void loan() {
        if (balance<150) {
            balance += 150;
            debt += 150;
        }
    }
}