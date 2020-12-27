/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. Merry X-mass and happy new year
 */
package holidaywishes;

import java.util.ArrayList;

/**
 *
 * @author Moses
 */
public class Holiday {

    public void newMethod() {
        ArrayList<String> set1 = new ArrayList<>();
        set1.add("c");
        set1.add("m");
        set1.add("r");
        set1.add("a");
        set1.add("e");
        set1.add("h");
        set1.add("y");
        set1.add("i");
        set1.add("s");
        set1.add("t");
        set1.add("p");
        set1.add("n");
        set1.add("w");
        set1.add("l");
        set1.add("&");
        set1.add("v");
        set1.add("0");

        System.out.println(set1);
        System.out.print(set1.get(1).toUpperCase());
        for (int i = 0; i < 35; i++) {
            if (i == 1 || i == 21 || i == 24 || i == 27 || i == 29 || i == 34) {
                if (i == 27) {
                    System.out.print(" " + set1.get(4).toUpperCase());
                } else {
                    System.out.print(set1.get(4));
                }
            }

            if (i == 2 || i == 3 || i == 7 || i == 26 || i == 30) {
                System.out.print(set1.get(2));
            }

            if (i == 4 || i == 19 || i == 23 || i == 31) {
                if (i == 23) {
                    System.out.print(" " + set1.get(6).toUpperCase());
                } else {
                    System.out.print(set1.get(6));
                }
            }

            if (i == 5) {
                System.out.print(" " + set1.get(0).toUpperCase());
            }

            if (i == 6 || i == 15) {
                if (i == 15) {
                    System.out.print(" " + set1.get(5).toUpperCase());
                } else {
                    System.out.print(set1.get(5));
                }
            }

            if (i == 8) {
                System.out.print(set1.get(7));
            }

            if (i == 9 || i == 13) {
                System.out.print(set1.get(8));
            }

            if (i == 10) {
                System.out.print(set1.get(9));
            }

            if (i == 11) {
                System.out.print(set1.get(1));
            }

            if (i == 12 || i == 16 || i == 25) {
                System.out.print(set1.get(3));
            }

            if (i == 14) {
                System.out.print(" " + set1.get(14));
            }

            if (i == 17 || i == 18) {
                System.out.print(set1.get(10));
            }

            if (i == 20 || i == 33) {
                if(i==20){
                System.out.print(" " + set1.get(11).toUpperCase());
                } else {
                    System.out.print(set1.get(11));
                }
            }

            if (i == 22) {
                System.out.print(set1.get(12));
            }

           
            if (i == 28) {
                System.out.print(set1.get(15));
            }
            
            if(i==32){
                System.out.print(" " + set1.get(16).toUpperCase());
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereSet
        Holiday driver = new Holiday();
        driver.newMethod();
        System.out.print("! \n\n");

    }

}
