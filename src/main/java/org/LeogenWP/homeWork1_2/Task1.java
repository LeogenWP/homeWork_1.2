package org.LeogenWP.homeWork1_2;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
       Task1 task1 = new Task1();
       int[] array = {3,8, 15, 17};
       int[] result;
       result = task1.arrayWithTermIndex(array,23);
        for(int i : result){
            System.out.println(i);
        }

    }

    private int[] arrayWithTermIndex (int[] array, int digit){
        int[] arrayWithIndex = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            map.put(array[i],digit - array[i]);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(map.containsKey(entry.getValue())){
                arrayWithIndex[0] = getArrayIndex(entry.getValue(), array);
                arrayWithIndex[1] = getArrayIndex(entry.getKey(),array);
                return arrayWithIndex;
            }
        }
        return arrayWithIndex;
    }

    private int getArrayIndex (Integer integer, int[] array){
        int index = 0;
        for(int i = 0; i < array.length; i++) {
            if(integer == array[i]){
                index = i;
                return index;
            }
        }
        return index;
    }
}
