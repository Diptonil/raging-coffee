package problemsolving;

// https://leetcode.com/problems/isomorphic-strings/
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        char es, tee;
        
        for (int i = 0; i < s.length(); i ++) {
            es = s.charAt(i);
            tee = t.charAt(i);
            if (!map1.containsKey(es)) map1.put(es, tee);
            if (!map2.containsKey(tee)) map2.put(tee, es);
            if (map1.get(es) != tee || map2.get(tee) != es) {
                return false;
            }
        }
        
        return true;
    }
}
