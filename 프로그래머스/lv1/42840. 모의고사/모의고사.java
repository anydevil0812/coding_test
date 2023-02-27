import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        List<Integer> d = new ArrayList<>();
        List<Integer> e = new ArrayList<>();
        List<Integer> f = new ArrayList<>();
        for (int i = 0; i < answers.length; i++) {
            if (a[i % a.length] == answers[i]) {
                d.add(i);
            }
            if (b[i % b.length] == answers[i]) {
                e.add(i);
            }
            if (c[i % c.length] == answers[i]) {
                f.add(i);
            }
        }
        
        int g = Math.max(Math.max(d.size(), e.size()), f.size());
        ArrayList<Integer> li = new ArrayList<>();
        if (d.size() == g) {
            li.add(1);
        }
        if (e.size() == g) {
            li.add(2);
        }
        if (f.size() == g) {
            li.add(3);
        }
        
        return li.stream().mapToInt(i -> i).toArray();
    }
}
