package test;

import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {


        String[] jmeno = {"Pepa", "Matěj", "Honza", "Tomáš", "Samuel"};
        String[] prijmeni = {"Novák", "Černý", "Nový", "Simandl", "Modrý"};

        int nahodnejmeno = (int)(Math.random() * jmeno.length);
        int nahodneprijmeni = (int)(Math.random() * prijmeni.length);

        String slozenejmeno = jmeno[nahodnejmeno] + " " + prijmeni[nahodneprijmeni];
        System.out.println(slozenejmeno);

    }
}
