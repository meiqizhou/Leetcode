package FactorCombinations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> getFactors(int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(n <= 1) return res;
        helper(n, 2, new ArrayList<Integer>(), res);
        return res;
    }
    private void helper(int n, int start, List<Integer> list, List<List<Integer>> res) {
        if(n <= 1) {
            if(list.size() > 1) res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i = start; i <= n; i++) {
            if(n % i == 0) {
                list.add(i);
                helper(n / i, i, list, res);
                list.remove(list.size() - 1);
            }
        }
    }
}
