package project;

import java.util.Map;
import java.util.HashMap;
public class FlowControlDemo {
    public static void main(String[] args) {
        Map<Integer, Integer> countMap = new HashMap<>();
        Integer key = 5;
        Integer value = key;
        countMap.put(key++, value);
        countMap.put(300, 300);
        int count = 0;
        for (Integer i : countMap.keySet()) { 
            for (Integer j : countMap.values()) {
                count++;
                if (i == countMap.get(i)) {
                    break;
                } else
                    continue;
            }
        }
        System.out.println("Count: " + count);
    }
}