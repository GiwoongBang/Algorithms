class Solution {
    boolean solution(String s) {

        boolean answer = true;

        int count = 0;
        String lowerCase = s.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            if (lowerCase.charAt(i) == 'p') {
                count ++;
            } else if (lowerCase.charAt(i) == 'y') {
                count --;
            }
        }

        if (count != 0) {
            answer = false;
        }

        return answer;
    }
}