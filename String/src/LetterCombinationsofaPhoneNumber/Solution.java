package LetterCombinationsofaPhoneNumber;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new LinkedList<>();
        if(digits.length() == 0) return res;
        String[] letters = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        LinkedList<String> list = new LinkedList<>();
        list.add("");
        for (int i = 0; i < digits.length(); i++) {
            int num = digits.charAt(i) - '2';
            int size = list.size();
            for (int k = 0; k < size; k++) {
                String tmp = list.pop();
                for (int j = 0; j < letters[num].length(); j++)
                {
                    list.add(tmp + letters[num].charAt(j));
                    }
            }
        }
        List<String> rec = new LinkedList<>();
        rec.addAll(list);
        return rec;
    }
}
