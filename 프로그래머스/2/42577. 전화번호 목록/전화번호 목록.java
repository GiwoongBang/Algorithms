import java.util.HashMap;
import java.util.Map;

class Solution {
public boolean solution(String[] phone_book) {
        Map<String, Integer> phoneBookMap = new HashMap<>();

        for (String phone : phone_book) {
            phoneBookMap.put(phone, 1);
        }

        for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++) {
                if (phoneBookMap.containsKey(phone.substring(0, i))) {
                    return false;
                }
            }
        }

        return true;
    }
}