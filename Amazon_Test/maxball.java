package Amazon_Test;
/*
 *Problem Number : 3
 *Problem Statement : max ball
 * Date : 18-05-2023
 */
import java.util.ArrayList;
import java.util.List;

public class maxball {
    public static int maxBall(List<Integer> nums, int B) {
        int n = nums.size();
        int sum;
        int ans = 0;
        
        for (int i = 0; i < n; i++) {
            for (int k = i; k < n; k++) {
                sum = 0;
                
                for (int j = i; j <= k; j++) {
                    sum += nums.get(j);
                }
                
                if (sum % B == 0) {
                    ans = Math.max(ans, sum / B);
                }
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        
        int bowlers = 3;
        int result = maxBall(nums, bowlers);
        
        System.out.println(result);
    }
}

