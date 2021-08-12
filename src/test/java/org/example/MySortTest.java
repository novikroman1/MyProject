package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MySortTest {
    int[] expected = new int[]{16, 24, 31, 36, 41, 42, 53, 55, 57, 64, 73, 74};
    int[] notExpected = new int[]{16, 24, 31, 36, 41, 42, 53, 50, 57, 64, 73, 74};

    @Test
    public void bubbleSort()    {
        int[] actual = MySort.bubbleSort(MySort.myExMas);
        Assert.assertArrayEquals(expected,actual);
    }
    @Test
    public void chooseSort(){
        int[] actual = MySort.chooseSort(MySort.myExMas);
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void insertionSort(){
        int[] actual = MySort.chooseSort(MySort.myExMas);
        Assert.assertArrayEquals(expected,actual);
    }
}