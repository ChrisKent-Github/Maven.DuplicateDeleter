package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        Integer arrayit = 0;
        Integer count = 0;
        for (String str : this.array) {
            if(!map.containsKey(str)){
                map.put(str, 1);
            }
            else{
                count = map.get(str) + 1;
                map.put(str, count);
            }
        }
        for (Map.Entry<String, Integer> entry:map.entrySet()) {
            if(entry.getValue() < maxNumberOfDuplications){
                arrayit = entry.getValue();}
            else{arrayit = 0;}
            while(arrayit > 0){
                list.add(entry.getKey());
                arrayit--;
            }

        }


        return list.toArray(new String[0]);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
            ArrayList<String> list = new ArrayList<>();
            HashMap<String, Integer> map = new HashMap<>();
            Integer arrayit = 0;
            Integer count = 0;
            for (String str : this.array) {
                if(!map.containsKey(str)){
                    map.put(str, 1);
                }
                else{
                    count = map.get(str) + 1;
                    map.put(str, count);
                }
            }
            for (Map.Entry<String, Integer> entry:map.entrySet()) {
                if(entry.getValue() != exactNumberOfDuplications){
                    arrayit = entry.getValue();}
                else{arrayit = 0;}
                while(arrayit > 0){
                    list.add(entry.getKey());
                    arrayit--;
                }

            }


            return list.toArray(new String[0]);
        }
}
