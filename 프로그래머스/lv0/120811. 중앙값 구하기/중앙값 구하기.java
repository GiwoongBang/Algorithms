        class Solution {
            public int solution(int[] array) {

                int temp;
                int middleValue = array.length / 2;

                for (int i = 0; i < array.length - 1; i++) {
                    for (int j = i + 1; j < array.length; j++) {
                        if (i < j) {
                            if (array[i] > array[j]) {
                                temp = array[i];
                                array[i] = array[j];
                                array[j] = temp;
                            }
                        }
                    }
                }

                int answer = array[middleValue];
                return answer;
            }
        }