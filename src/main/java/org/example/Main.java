package org.example;

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
public class Main {


    public static long _sum(ArrayList<Long> a) {
        long s = 0;
        for(int i = 0; i < a.size(); i++){
            s = s + a.get(i);
        }
        return s;
    }

    public static long _mult(ArrayList<Long> a) {
        long p = 1;
        for(int i = 0; i < a.size(); i++){
            p = p * a.get(i);
        }
        return p;
    }

    public static long _min(ArrayList<Long> a) {
        long smallest = a.get(0);
        for(int i = 0; i < a.size(); i++){
            if (a.get(i)<smallest){
                smallest = a.get(i);
            }
        }
        return smallest;
    }

    public static long _max(ArrayList<Long> a) {
        long largest = 0;
        for(int i = 0; i < a.size(); i++){
            if (a.get(i)>largest){
                largest = a.get(i);
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        try {
            File numbers = new File("file.txt");
            Scanner scanner = new Scanner(numbers);

            ArrayList<Long> a = new ArrayList<Long>();

            while (scanner.hasNext()) {
                long k = scanner.nextInt();
                a.add(k);
            }
            String minim = Long.toString(_min(a));
            String maxim = Long.toString(_max(a));
            String summa = Long.toString(_sum(a));
            String proizveden = Long.toString(_mult(a));
            System.out.println("минимальное: " + minim);
            System.out.println("максимальное: " + maxim);
            System.out.println("сумма: " + summa);
            System.out.println("произведение: " + proizveden);
        }
        catch(Exception e){}

    }
}