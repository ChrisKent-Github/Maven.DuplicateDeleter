package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer arrayit = 0;
        Integer count = 0;
        for (Integer integer : this.array) {
            if(!map.containsKey(integer)){
                map.put(integer, 1);
            }
            else{
                count = map.get(integer) + 1;
                map.put(integer, count);
            }
        }
        for (Map.Entry<Integer, Integer> entry:map.entrySet()) {
            if(entry.getValue() < maxNumberOfDuplications){
            arrayit = entry.getValue();}
            else{arrayit = 0;}
            while(arrayit > 0){
                list.add(entry.getKey());
                arrayit--;
            }

        }


        return list.toArray(new Integer[0]);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer arrayit = 0;
        Integer count = 0;
        for (Integer integer : this.array) {
            if(!map.containsKey(integer)){
                map.put(integer, 1);
            }
            else{
                count = map.get(integer) + 1;
                map.put(integer, count);
            }
        }
        for (Map.Entry<Integer, Integer> entry:map.entrySet()) {
            if(entry.getValue() != exactNumberOfDuplications){
                arrayit = entry.getValue();}
            else{arrayit = 0;}
            while(arrayit > 0){
                list.add(entry.getKey());
                arrayit--;
            }

        }


        return list.toArray(new Integer[0]);
    }
}
