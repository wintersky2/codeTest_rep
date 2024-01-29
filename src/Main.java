import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        String[][] newGifts = new String[gifts.length][2];
        Map<String[], Integer> firstQuestion = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            for (int j = i; j < friends.length - 1; j++) {
                String[] put = {friends[i], friends[j + 1]};
                firstQuestion.put(put, 0);
            }
        }
        for (int i = 0; i < gifts.length; i++) {
            newGifts[i] = gifts[i].split(" ");
        }

        System.out.println(newGifts.toString());
    }
}