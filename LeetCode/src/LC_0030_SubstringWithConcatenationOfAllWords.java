import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 给定一个字符串 s 和一些长度相同的单词 words。找出 s 中恰好可以由 words 中所有单词串联形成的子串的起始位置。
 *
 * 注意子串要与 words 中的单词完全匹配，中间不能有其他字符，但不需要考虑 words 中单词串联的顺序。
 */
public class LC_0030_SubstringWithConcatenationOfAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
            if (s == null || s.length() == 0 || words == null || words.length == 0) {
                return res;
            }
            HashMap<String, Integer> map = new HashMap<>();
            int oneWord = words[0].length();
            int wordNum = words.length;
            int allLen = oneWord * wordNum;
            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
            for (int i = 0; i < s.length() - allLen + 1; i++) {
                String tmp = s.substring(i, i + allLen);
                HashMap<String, Integer> tmpMap = new HashMap<>();
                for (int j = 0; j < allLen; j += oneWord) {
                    String w = tmp.substring(j, j + oneWord);
                    tmpMap.put(w, tmpMap.getOrDefault(w, 0) + 1);
                }
            if (map.equals(tmpMap)) {
                res.add(i);
            }
        }
        return res;
    }
}
