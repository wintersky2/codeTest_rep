import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};

        HashMap<String,Integer> firstQuestion = new HashMap<>();
        for(int i = 0; i < friends.length; i++){
            for(int j = i; j<friends.length-1;j++){
                firstQuestion.put(friends[i]+" "+friends[j+1],0);
            }
        }
        System.out.println(firstQuestion.toString());
    }
}