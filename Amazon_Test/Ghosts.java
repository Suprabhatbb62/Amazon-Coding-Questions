package Amazon_Test;
/*
*Problem Number : 7
*Problem Statement : PAC-MAN game

* Date : 18-05-2023
*/
public class Ghosts {
    public static boolean escapeGhosts(int[][] ghosts, int[] target) {
        int playerDistance = Math.abs(target[0]) + Math.abs(target[1]);

        for (int[] ghost : ghosts) {
            int ghostDistance = Math.abs(ghost[0] - target[0]) + Math.abs(ghost[1] - target[1]);

            if (ghostDistance <= playerDistance) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] ghosts = {{1, 0}, {0, 3}};
        int[] target1 = {0, 1};
        boolean result1 = escapeGhosts(ghosts, target1);
        System.out.println(result1);
    }
}


