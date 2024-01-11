package Amazon_Test;
/*
 *Problem Number : 8
 *Problem Statement : boat problem
 * Date : 18-05-2023
 */
import java.util.Arrays;
import java.util.List;

public class boats {
    public static int numBoats(List<Integer> people, int weightCapacity) {
        people.sort(null);
        int left = 0;
        int right = people.size() - 1;
        int boats = 0;

        while (left <= right) {
            if (people.get(left) + people.get(right) <= weightCapacity) {
                left++;
                right--;
            } else {
                right--;
            }
            boats++;
        }

        return boats;
    }

    public static void main(String[] args) {
        List<Integer> people = Arrays.asList(3, 5, 3, 4);
        int weightCapacity = 5;

        int minBoats = numBoats(people, weightCapacity);

        System.out.println(minBoats);
    }
}

