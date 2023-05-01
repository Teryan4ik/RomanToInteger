package org.example;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int romanToInteger(String romanNumbers) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        romanNumbers = romanNumbers.replace("IV", "IIII");
        romanNumbers = romanNumbers.replace("IX", "VIIII");
        romanNumbers = romanNumbers.replace("XL", "XXXX");
        romanNumbers = romanNumbers.replace("XC", "LXXXX");
        romanNumbers = romanNumbers.replace("CD", "CCCC");
        romanNumbers = romanNumbers.replace("CM", "DCCCC");

        int result = 0;
        for (int i = 0; i < romanNumbers.length(); i++) {
            result = result + (map.get(romanNumbers.charAt(i)));
        }
        return result;
    }
}
