package Amazon_Test;

/*
 *Problem Number : 2
 *Problem Statement : missing int
 * Date : 18-05-2023
 */
import java.util.ArrayList;
import java.util.List;

public class missingpos {
    public static int findFirstMissingPositive(List<Integer> nums) {
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            while (nums.get(i) > 0 && nums.get(i) <= n && nums.get(i) != nums.get(nums.get(i) - 1)) {
                int temp = nums.get(i);
                nums.set(i, nums.get(temp - 1));
                nums.set(temp - 1, temp);
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (nums.get(i) != i + 1) {
                return i + 1;
            }
        }
        
        return n + 1;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(4);
        nums.add(-1);
        nums.add(1);
        
        int result = findFirstMissingPositive(nums);
        System.out.println(result);
    }
}

