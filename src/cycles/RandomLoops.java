package cycles;

public class RandomLoops {

    public static void main(String[] args) {
        int num1 = (int)(Math.random()*21);
        int num2 = (int)(Math.random()*21);
        System.out.println(num2 + ", " + num1);
        while (num2 != num1){
            num1 = (int)(Math.random()*21);
            num2 = (int)(Math.random()*21);
            System.out.println(num2 + ", " + num1);
            tries++;
        }
        System.out.println("trvalo to " + tries + "pokusu");


    }
}
