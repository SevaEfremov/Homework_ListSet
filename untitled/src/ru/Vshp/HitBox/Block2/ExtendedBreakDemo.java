package ru.Vshp.HitBox.Block2;

public class ExtendedBreakDemo {
    public static void main (String[] args) {

        for (int i = 1; i<4; i++) {

            блок1: {
            блок2: {
                блок3: {

                    System.out.println("\ni равно"+ i);
                    if (i==1) break блок1;
                    if (i==2) break блок2;
                    if (i==3) break блок3;

                    System.out.println("эта строка никогда не будет напечатана");

                } //конец блока блок3
                System.out.println("завершен блок3");

            } // конец блока блок2
                System.out.println("завершен блок2");

            } // конец блока блок1
            System.out.println("завершен блок1");

        }// for
        System.out.println("конец цыкла for");
    } // main (String[])

} // ExtendedBreakDemo class
