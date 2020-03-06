import java.util.ArrayList;
import java.util.List;

/**
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 */

public class LC_0022_GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        if (n == 0) {
           return new ArrayList<>();
        }
        List<List<String>> ans = new ArrayList<>();
        List<String> list0 = new ArrayList<>();
        list0.add("");
        ans.add(list0);
        List<String> list1 = new ArrayList<>();
        list1.add("()");
        ans.add(list1);
        for (int i = 2; i <= n; i++) {
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                List<String> str1 = ans.get(j);
                List<String> str2 = ans.get(i - 1 - j);
                for (String s1 : str1) {
                    for (String s2 : str2) {
                        String el = "(" + s1 + ")" + s2;
                        temp.add(el);
                    }
                }
            }
            ans.add(temp);
        }
        return ans.get(n);
    }
//    // 回溯
//    public List<String> generateParenthesis(int n) {
//        List<String> ans = new ArrayList<>();
//        backtrack(ans, "", 0, 0, n);
//        return ans;
//    }
//
//    public void backtrack(List<String> ans, String cur, int open, int close, int max) {
//        if (cur.length() == max * 2) {
//            ans.add(cur);
//            return;
//        }
//        if (open < max) {
//            backtrack(ans, cur + "(", open + 1, close, max);
//        }
//        if (open > max) {
//            backtrack(ans, cur + ")", open, close + 1, max);
//        }
//    }
}
