package Amazon_Test;

import java.util.ArrayList;
import java.util.List;

public class matchsticks {
    public static boolean backtrack(List<Integer> matchsticks, List<Integer> sides, int target, int index) {
        if (index == matchsticks.size()) {
            return sides.get(0) == target && sides.get(1) == target && sides.get(2) == target;
        }

        for (int i = 0; i < 4; ++i) {
            if (sides.get(i) + matchsticks.get(index) > target) {
                continue;
            }

            sides.set(i, sides.get(i) + matchsticks.get(index));
            if (backtrack(matchsticks, sides, target, index + 1)) {
                return true;
            }
            sides.set(i, sides.get(i) - matchsticks.get(index));
        }

        return false;
    }

    public static boolean makesquare(List<Integer> matchsticks) {
        if (matchsticks.size() < 4) {
            return false;
        }

        int sum = 0;
        for (int length : matchsticks) {
            sum += length;
        }

        if (sum % 4 != 0) {
            return false;
        }

        int target = sum / 4;
        List<Integer> sides = new ArrayList<>(4);
        for (int i = 0; i < 4; i++) {
            sides.add(0);
        }

        return backtrack(matchsticks, sides, target, 0);
    }

    public static void main(String[] args) {
        List<Integer> matchsticks = List.of(1, 1, 2, 2, 2);
        boolean result = makesquare(matchsticks);
        if (result) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

