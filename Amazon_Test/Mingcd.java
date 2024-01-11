package Amazon_Test;
/*
 *Problem Number : 4
 *Problem Statement : minimum number of operations to make GCD
 * Date : 18-05-2023
 */
public class Mingcd {
    public static int minOperation(int[] a, int n, int k) {
        int result = 0;
        
        for (int i = 0; i < n; ++i) {
            if (a[i] != 1 && a[i] > k) {
                result = result + Math.min(a[i] % k, k - a[i] % k);
            } else {
                result = result + k - a[i];
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 16};
        int n = arr.length;
        int k = 5;
        
        int result = minOperation(arr, n, k);
        System.out.println(result);
    }
}

