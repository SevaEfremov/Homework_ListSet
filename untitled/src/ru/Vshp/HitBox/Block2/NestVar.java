package ru.Vshp.HitBox.Block2;

public class NestVar {
    public static void main (String[] args) {
        int count=1;
        System.out.println("count = " + count);

        {
            count = 2;
            System.out.println("Первый независимый блок: count = " + count);
            int n=3;
            System.out.println("первый независимый блок: n= " + n);

        }
        {
            int n=5;
            System.out.println("второй независимый блок: n = " + n);

        }
    } // main(String[]) method

} // NestVar class
