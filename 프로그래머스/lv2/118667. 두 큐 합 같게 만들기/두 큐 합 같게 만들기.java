import java.util.*;

public class Solution {
public int solution(int[] queue1, int[] queue2) {
int answer = 0;
ArrayDeque<Integer> q1 = new ArrayDeque<>();
ArrayDeque<Integer> q2 = new ArrayDeque<>();
for (int n : queue1) q1.add(n);
for (int n : queue2) q2.add(n);

long sum1 = 0, sum2 = 0;
for (int n : q1) sum1 += n;
for (int n : q2) sum2 += n;

for (int i = 0; i < queue1.length * 3; i++) {
        if (sum1 > sum2) {
            sum1 -= q1.peek();
            sum2 += q1.peek();
            q2.add(q1.poll());
            answer++;
        } else if (sum1 < sum2) {
            sum1 += q2.peek();
            sum2 -= q2.peek();
            q1.add(q2.poll());
            answer++;
        } else {
            return answer;
        }
    }

    return -1;
  }
}