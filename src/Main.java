public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[][] score = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
        int[][] score = {{0, 0}, {1, 0}};
        for (int a : solution.solution(score)) {
            System.out.println(a);
        }
    }
}

class Solution {
    public int[] solution(int[][] score) {
        double[] evrList = new double[score.length];
        int[] result = new int[score.length];
        int rank = 1;
        double lastEvr = 0;

        for (int i = 0; i < score.length; i++) { // evrList에 각 평균 저장
            evrList[i] = (score[i][0] + score[i][1]) / 2.0;
        }

        for (int i = 0; i < evrList.length; i++) {
            int correctPeople = 0;
            for (int j = 0; j < evrList.length; j++) {
                if (result[j] == 0) {
                    if (evrList[j] > lastEvr) {
                        lastEvr = evrList[j];
                    }
                }
            }
            for (int j = 0; j < evrList.length; j++) {
                if(result[j]==0){
                    if (lastEvr == evrList[j]) {
                        result[j] = rank;
                        correctPeople++;
                    }
                }
            }
            rank += correctPeople;
        }
        return result;
    }
}