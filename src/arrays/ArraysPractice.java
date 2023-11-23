package arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        int[] arr = {1, 5, 789, 1534, 46};
        int[] array = new int[15];

//        napln array random cislama

        for (int i = 0; i <array.length; i++) {
            array[i] = (int)(Math.random()* 100-49);
        }

//        vypis

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();

//        vypis pole pozpatku

        for (int i = array.length; i >= 0; i--) {
            System.out.println(array[i] + " ");
        }
        System.out.println();

//        vypis vsechna zaporna cisla v poli

        System.out.println("negative");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                System.out.println(array[i] + " ");
            }
        }
        System.out.println();

//        vypis pole zig-zag

        for (int i = 0; i < array.length; i++) {

        }
    }
}
