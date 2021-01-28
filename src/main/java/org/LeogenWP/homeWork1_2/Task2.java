package org.LeogenWP.homeWork1_2;

import java.util.HashSet;

public class Task2 {

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        int[] array = {3,8,15, 15, 17};
        boolean result;
        result = task2.containsDoubles(array);
        System.out.println(result);


    }

    private boolean containsDoubles(int[] array){
        HashSet hs = new HashSet();
        for (int i : array){
            hs.add(i);
        }
        return (hs.size() == array.length);
    }
}
