import java.util.HashSet;

class Solution {
public int solution(int[] nums) {
        int answer = 0;

        int capacity = nums.length / 2;

        HashSet<Integer> hs = new HashSet<>();
        for (Integer num : nums) {
            hs.add(num);
        }

        if (hs.size() >= capacity) {
            answer = capacity;
        } else {
            answer = hs.size();
        }
        return answer;
    }
}