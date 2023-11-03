package test;

public class test1 {
    public static void main(String[] args) {

        int enemy = 1500;
        int counter = 1;

        while (enemy > 0) {
            int dmg = (int) (Math.random() * 151);
            enemy -= dmg;
            System.out.println(dmg);
            counter++;
        }
        System.out.println("pocet" + counter);
    }
}