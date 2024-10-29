class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int P = 0;
        int Y = 0;

        char[] charArray = s.toUpperCase().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'P') {
                P++;
            } else if (charArray[i] == 'Y') {
                Y++;
            }
        }
        if (P != Y) answer = false;

        return answer;
    }
}