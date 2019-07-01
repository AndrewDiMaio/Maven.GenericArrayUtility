package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<O> {
    O[] inputArray;
    public ArrayUtility(O[] inputArray) {
        this.inputArray = inputArray;
    }

    public Integer countDuplicatesInMerge(O[] arrayToMerge, O valueToEvaluate) {

        Integer count = 0;
        for (int i = 0; i<arrayToMerge.length; i++){
            if (arrayToMerge[i].equals(valueToEvaluate)){
                count++;
            }
        }
        for(int i = 0; i<inputArray.length; i++){
            if (inputArray[i].equals(valueToEvaluate)){
                count++;
            }
        }return count;
    }

    public O getMostCommonFromMerge(O[] arrayToMerge) {
        Integer count = 1;
        O mostCommon = arrayToMerge[0];
        int i = 0;
        while (i<arrayToMerge.length) {
            for (O o : arrayToMerge) {
                if (arrayToMerge[i].equals(o)) {
                    Integer tempCount = count + 1;
                    if (tempCount > count) {
                        mostCommon = arrayToMerge[i];
                    }
                }
            }
            i++;
        }
        System.out.println(mostCommon);
        return mostCommon;
    }

    public Integer getNumberOfOccurrences(O valueToEvaluate) {
        Integer count = 0;
        for (int i = 0; i<inputArray.length; i++) {
            if (inputArray[i].equals(valueToEvaluate)) {
                count++;
            }
        }return count;
    }

    public O[] removeValue(O valueToRemove) {
        int val = inputArray.length;
        List<O> list = new ArrayList<>();
        for (int i = 0; i<val; i++) {
            if (!inputArray[i].equals(valueToRemove)) {
                list.add(inputArray[i]);
            }
        }
        O[] copy = Arrays.copyOf(inputArray, inputArray.length-getNumberOfOccurrences(valueToRemove));
        return list.toArray(copy);
    }
}
