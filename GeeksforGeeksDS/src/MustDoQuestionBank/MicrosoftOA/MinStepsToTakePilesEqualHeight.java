package MustDoQuestionBank.MicrosoftOA;


import java.util.Arrays;

public class MinStepsToTakePilesEqualHeight {
        public int minSteps(int[] piles){
            int len = piles.length;
            if(len <= 1) return 0;
            Arrays.sort(piles);
            int res = 0, distinctNums = 0;
            for(int i = 1; i < len; ++i){
                if(piles[i] == piles[i - 1]){
                    res += distinctNums;
                }
                else{
                    ++distinctNums;
                    res += distinctNums;
                }
            }
            return res;
        }
        public static void main(String[] args) {
            int[][] testcases = {{5, 2, 1},  {4,5,5,4,2}};
            for(int[] testcase: testcases)
                System.out.println(new MinStepsToTakePilesEqualHeight().minSteps(testcase));
        }
    }

