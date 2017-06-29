package com.goit;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        //findMaxNum();
        System.out.println("Enter flat number: ");
        flatNumber(s.nextInt());
    }
    public static void findMaxNum(){
        System.out.println("Enter 4 numbers:");
        int[] numbers = new int[4];
        numbers[0] = s.nextInt();
        int maxNum = numbers[0];
        for (int i = 1; i < 4; i++){
            numbers[i] = s.nextInt();
            if (numbers[i]> maxNum){
                maxNum = numbers[i];
            }
        }
        System.out.println("Maximum: " + maxNum);
    }

    public static void flatNumber(int number){
        int floor, porch, total = 4*9*4;
        if (number>total || number<=0){
            System.out.println("There is no flat with this number.");
        } else {
            if (number%36 == 0){
                floor = 9;
                porch = number/36;
            } else {
                porch = number / 36 + 1;
                double n = (double) (number - (porch - 1) * 36) / 4;
                floor = (int) Math.ceil(n);
            }
            System.out.println("Porch: " + porch + "\nFloor: " + floor);
        }
    }
}
