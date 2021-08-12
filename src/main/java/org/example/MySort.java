package org.example;

import java.util.Arrays;

public class MySort {
    static int [] myExMas = new int[]{64,42,73,41,31,53,16,24,57,74,55,36};

    public static void main(String[] args) {
//        MySort.bubbleSort(myExMas);
//        MySort.chooseSort(myExMas);
    }

    public static int[] bubbleSort(int[] mas){
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (mas[i] < mas[j]){
                    int temp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = temp;
                }
            }
        }
        return mas;
    }

    public static int minIndexElementInMas(int[] mas, int i){
        int minIndex = i;
        int minValue = mas[i];
        for (int j = minIndex + 1; j < mas.length; j++) {
            if (minValue > mas[j]){
                minValue = mas[j];
                minIndex = j;
            }
        }
        return minIndex;
    }

    public static int[] chooseSort(int[] mas){
        for (int i = 0; i <mas.length ; i++) {
            int index = minIndexElementInMas(mas, i);

            int temp = mas[i];
            mas[i] = mas[index];
            mas[index] = temp;
        }
        return mas;
    }

    public static int[] insertionSort(int[] mas){
        for (int i = 1; i < mas.length ; i++) {
            int current = mas[i];
            int count = i;
            while(count > 0 && mas[count - 1] > current){
                mas[count] = mas[count - 1];
                count--;
            }
            mas[count] = current;
        }
        return mas;
    }




}
