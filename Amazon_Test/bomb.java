package Amazon_Test;

import java.util.ArrayList;
import java.util.List;

public class bomb {
    public static List<Integer> decrypt(List<Integer> code, int k) {
        int n = code.size();
        List<Integer> decrypted = new ArrayList<>(n);

        if (k > 0) {
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {
                    sum += code.get((i + j) % n);
                }
                decrypted.add(sum);
            }
        } else if (k < 0) {
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = -1; j >= k; j--) {
                    sum += code.get((i + j + n) % n);
                }
                decrypted.add(sum);
            }
        }

        return decrypted;
    }

    public static void main(String[] args) {
        List<Integer> code = List.of(5, 7, 1, 4);
        int k = 3;
        List<Integer> result = decrypt(code, k);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

