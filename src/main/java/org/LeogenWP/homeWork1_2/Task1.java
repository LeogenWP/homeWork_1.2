package org.LeogenWP.homeWork1_2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

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
        int[] arrayWithIndex;
        List<Integer> termDigits = new LinkedList();
        int tmpDigit = digit;
        int digitPosition = 0;

        Arrays.sort(array);
        for(digitPosition = 0; digitPosition < array.length; digitPosition++){
            if(digit < array[digitPosition]){
                break;
            }
        }
        while(digitPosition  > 0){
          for(int i = digitPosition - 1; i > 0; i--){
              if(tmpDigit >= array[i]){
                  tmpDigit -= array[i];
                  termDigits.add(array[i]);
              }
              if (tmpDigit == 0){
                  arrayWithIndex = new int[termDigits.size()];
                  int pointer = arrayWithIndex.length;
                  for (Integer k : termDigits){
                      arrayWithIndex[pointer -1] = (int) k;
                      pointer--;
                  }
                  return arrayWithIndex;
              }
          }
            termDigits.clear();
            tmpDigit = digit;
            digitPosition--;
        }
        arrayWithIndex = new int[0];
        return arrayWithIndex;
    }
}
