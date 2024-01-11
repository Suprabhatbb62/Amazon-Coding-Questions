package Amazon_Test;
/*
 *Problem Number : 1
 *Problem Statement : maximum possible sum
 * Date : 18-05-2023
 */

import java.util.ArrayList;
import java.util.List;

public class Maxpossum {
    public static int maximumSum(List<Integer> A, int B) {
        int N = A.size();
        int sum = 0;
        int maxSum = 0;
        int count = 0;
        int k = N - B;
        
        while (k != N) {
            count = 0;
            sum = 0;
            
            for (int i = k; i < N; i++) {
                sum += A.get(i);
                count++;
            }
            
            if (count < B) {
                for (int i = 0; i < B - count; i++) {
                    sum += A.get(i);
                }
            }
            
            maxSum = Math.max(maxSum, sum);
            k++;
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(-2);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        
        int B = 3;
        int maxSum = maximumSum(arr, B);
        
        System.out.println(maxSum);
    }
}

