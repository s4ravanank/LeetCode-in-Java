package g0101_0200.s0131_palindrome_partitioning;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #String #Dynamic_Programming
// #Backtracking #2022_02_22_Time_19_ms_(53.74%)_Space_194.8_MB_(9.14%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("java:S5413")
public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtracking(res, new ArrayList<>(), s, 0);
        return res;
    }

    private void backtracking(List<List<String>> res, List<String> currArr, String s, int start) {
        if (start == s.length()) {
            res.add(new ArrayList<>(currArr));
        }
        for (int end = start; end < s.length(); end++) {
            if (!isPanlindrome(s, start, end)) {
                continue;
            }
            currArr.add(s.substring(start, end + 1));
            backtracking(res, currArr, s, end + 1);
            currArr.remove(currArr.size() - 1);
        }
    }

    private boolean isPanlindrome(String s, int start, int end) {
        while (start < end && s.charAt(start) == s.charAt(end)) {
            start++;
            end--;
        }
        return start >= end;
    }
}