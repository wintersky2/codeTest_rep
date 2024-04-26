import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ;

        Solution s = new Solution();
        System.out.println(s.solution(new int[][] {{0,0,0},{1,0,0},{0,0,0}}));
    }
}

class Solution {
    public int solution(int[][] board) {
        int[][] checkBoard = new int[board.length][board.length];
        int answer = 0;

        // n=1 일때.
        if (board.length == 1) {
            if (board[0][0] == 1) {
                return 0;
            }
            return 1;
        }

        // n!=1 일때.
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    if (i == 0) {
                        if (j == 0) {
                            checkBoard[i][j] = 1;
                            checkBoard[i][j + 1] = 1;
                            checkBoard[i + 1][j] = 1;
                            checkBoard[i + 1][j + 1] = 1;
                        } else if (j == board.length - 1) {
                            checkBoard[i][j] = 1;
                            checkBoard[i][j - 1] = 1;
                            checkBoard[i + 1][j - 1] = 1;
                            checkBoard[i + 1][j] = 1;
                        }
                    } else if (i == board.length - 1) {
                        if (j == 0) {
                            checkBoard[i][j] = 1;
                            checkBoard[i][j + 1] = 1;
                            checkBoard[i - 1][j] = 1;
                            checkBoard[i - 1][j + 1] = 1;
                        } else if (j == board.length - 1) {
                            checkBoard[i][j] = 1;
                            checkBoard[i][j - 1] = 1;
                            checkBoard[i - 1][j] = 1;
                            checkBoard[i - 1][j - 1] = 1;
                        }
                    } else {
                        if (j == 0) {
                            checkBoard[i - 1][j] = 1;
                            checkBoard[i - 1][j + 1] = 1;
                            checkBoard[i][j] = 1;
                            checkBoard[i][j + 1] = 1;
                            checkBoard[i + 1][j] = 1;
                            checkBoard[i + 1][j + 1] = 1;
                        } else if (j == board.length - 1) {
                            checkBoard[i - 1][j - 1] = 1;
                            checkBoard[i - 1][j] = 1;
                            checkBoard[i][j - 1] = 1;
                            checkBoard[i][j] = 1;
                            checkBoard[i + 1][j - 1] = 1;
                            checkBoard[i + 1][j] = 1;
                        } else {
                            checkBoard[i - 1][j - 1] = 1;
                            checkBoard[i - 1][j] = 1;
                            checkBoard[i - 1][j + 1] = 1;
                            checkBoard[i][j - 1] = 1;
                            checkBoard[i][j] = 1;
                            checkBoard[i][j + 1] = 1;
                            checkBoard[i + 1][j - 1] = 1;
                            checkBoard[i + 1][j] = 1;
                            checkBoard[i + 1][j + 1] = 1;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < checkBoard.length; i++) {
            for (int j = 0; j < checkBoard.length; j++) {
                if (checkBoard[i][j] == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }
}

// 1. board 와 같은 구성의 배열생성 ->checkBoard
// 2. 총 4가지를 검증해야함. 맨 윗줄, 맨 왼쪽, 맨 오른쪽, 맨 아랫줄.
// 2-1. 맨 윗줄의 경우 0번 인덱스, 마지막 인덱스, 이외 인덱스.
// 2-2. 맨 아래줄의 경우 0번 인덱스, 마지막 인덱스, 이외 인덱스.
// 2-3. 이외 사이 줄들의 0번 인덱스, 마지막 인덱스, 이외 인덱스.

// 3. 주변 지역에 값을 1로 바꾸는 식으로 위험지대를 규정한다.


//        for(int i=0;i<board.length;i++){
//        for(int j=0;j<board[i].length;j++){
//        if(i==0){
//        // 2-1. 맨 윗줄의 경우 0번 인덱스, 마지막 인덱스, 이외 인덱스.
//        if(j==0){
//        // 0-0 인덱스
//        }else if(j==board[i].length){
//        // 0-마지막 인덱스
//        }else{
//        // 0-이외 인덱스
//        }
//        }else if(i==board.length-1){
//        // 2-2. 맨 아래줄의 경우 0번 인덱스, 마지막 인덱스, 이외 인덱스.
//        if(j==0){
//        // 마지막-0 인덱스
//        }else if(j==board[i].length){
//        // 마지막-마지막 인덱스
//        }else{
//        // 마지막-이외 인덱스
//        }
//        }else{
//        // 사잇줄
//        if(j==0){
//        // 마지막-0 인덱스
//        }else if(j==board[i].length){
//        // 마지막-마지막 인덱스
//        }else{
//        // 마지막-이외 인덱스
//        }
//        }
//        }
//        }