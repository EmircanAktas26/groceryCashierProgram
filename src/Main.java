/*
* @Author Emircan Aktaş - 16.Dec.2022
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pearPrice = 2.14,applePrice = 3.67,tomatoPrice = 1.11,bananaPrice = 0.95,eggplantPrice = 5.0;
        double pear,apple,tomato,banana,eggplant,total;
        Scanner inp = new Scanner(System.in);
        System.out.println("*************************");
        System.out.println("Price List :\n" +
                "Pear :2.14$\n" +
                "Apple :3.67$\n" +
                "Tomato :1.11$\n" +
                "Banana :0.95$\n" +
                "Eggplant :5.0$");
        System.out.println("*************************");

        System.out.print("How many kg of pears :");
        pear = inp.nextDouble();
        System.out.print("How many kg of apples :");
        apple = inp.nextDouble();
        System.out.print("How many kg of tomatos :");
        tomato = inp.nextDouble();
        System.out.print("How many kg of bananas :");
        banana = inp.nextDouble();
        System.out.print("How many kg of eggplant :");
        eggplant = inp.nextDouble();

        total = (pearPrice * pear) + (applePrice * apple) + (tomatoPrice * tomato) + (bananaPrice * banana) + (eggplantPrice * eggplant);

        System.out.println("Total Price :" + total + "$");
    }
}