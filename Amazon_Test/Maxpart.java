package Amazon_Test;
/*
 Problem No: 5

 */
import java.util.Arrays;

public class Maxpart {
    public static int maximumNumberOfParts(int[] sweets) {
        Arrays.sort(sweets);
        int maxParts = 1;
        
        for (int i = 1; i < sweets.length; i++) {
            if (sweets[i] != sweets[i - 1] + 1) {
                maxParts++;
            }
        }
        
        return maxParts;
    }

    public static void main(String[] args) {
        int[] sweets = {2, 1, 5, 6, 4};
        int maxParts = maximumNumberOfParts(sweets);
        System.out.println(maxParts);
    }
}

