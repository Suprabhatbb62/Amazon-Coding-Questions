package Amazon_Test;
/*
*Problem Number : 6
*Problem Statement : A frog is crossing a river. The river is divided into some number of units,
and at each unit, there may or may not exist a stone. The frog can jump on a
stone, but it must not jump into the water.
Given a list of stones' positions (in units) in sorted ascending order,
determine if the frog can cross the river by landing on the last stone.
Initially, the frog is on the first stone and assumes the first jump must be
1 unit.
If the frog's last jump was k units, its next jump must be either k - 1, k,
or k + 1 units. The frog can only jump in the forward direction.
Example 1:
Input: stones = [0,1,3,5,6,8,12,17]
Output: true
* Date : 18-05-2023
*/

import java.util.HashSet;

class Sol {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        
        HashSet<Integer> stoneSet = new HashSet<>();
        for (int stone : stones) {
            stoneSet.add(stone);
        }
        boolean[][] dp = new boolean[n][n+1];
        dp[0][1] = true; 
        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                int distance = stones[i] - stones[j];
                
                if (distance > j + 1) {
                    break;
                }
                if (dp[j][distance]) {
                    dp[i][distance] = true;
                    if (distance - 1 >= 0) {
                        dp[i][distance - 1] = true;
                    }
                    dp[i][distance + 1] = true;
                    if (i == n - 1) {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
}

public class Solution {
    public static void main(String[] args) {
        int[] stones1 = {0, 1, 3, 5, 6, 8, 12, 17};
        Sol solution = new Sol();
        boolean canCross1 = solution.canCross(stones1);
        System.out.println(canCross1);
    }
}
