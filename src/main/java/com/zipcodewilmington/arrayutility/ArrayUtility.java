package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<O> {
    Object[] inputArray;
    public ArrayUtility(Object[] inputArray) {
        this.inputArray = inputArray;
    }

    public Integer countDuplicatesInMerge(Object[] arrayToMerge, Object valueToEvaluate) {

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
        }
        return count;
    }

    public O getMostCommonFromMerge(Object[] arrayToMerge) {
        Integer count = 1;
        Object mostCommon = arrayToMerge[0];
        for (int i = 0; i<arrayToMerge.length; i++){
            for (int j=1; j<arrayToMerge.length-1;j++){
                if (arrayToMerge[i].equals(arrayToMerge[j])){
                    Integer tempCount = count+1;
                    if (tempCount >count){
                        mostCommon = arrayToMerge[i];
                    }
                }
            }
        }return (O) mostCommon;
    }

    public Integer getNumberOfOccurrences(Object valueToEvaluate) {
        Integer count = 0;
        for (int i = 0; i<inputArray.length; i++) {
            if (inputArray[i].equals(valueToEvaluate)) {
                count++;
            }
        }return count;
    }

    public O[] removeValue(Object valueToRemove) {
        int val = Arrays.asList(inputArray).size();
        ArrayList test = new ArrayList();
        for (int i = 0; i<val; i++) {
            if (!inputArray[i].equals(valueToRemove)) {
                test.add(inputArray[i]);
            }
        }return (O[]) test.toArray();
    }
}
