package hackercup.year2020.qr.problem2;

import java.util.Scanner;

/**
 * Solution for Problem B: Alchemy - Qualification Round - Facebook Hacker Cup 2020.
 *
 * @author Johnny Lim
 */
public class Solution {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int cases = in.nextInt();
            for (int t = 1; t <= cases; t++) {
                in.nextInt();
                String colors = in.next();

                boolean possible = isPossible(colors);
                System.out.printf("Case #%d: %c%n", t, possible ? 'Y' : 'N');
            }
        }
    }

    private static boolean isPossible(String colors) {
        String target = colors;
        while (target.length() != 1) {
            String fused = fuse(target);
            if (fused == target) {
                return false;
            }
            target = fused;
        }
        return true;
    }

    private static String fuse(String colors) {
        Integer index = null;
        Character color = null;
        for (int i = 0; i < colors.length() - 2; i++) {
            char first = colors.charAt(i);
            char second = colors.charAt(i + 1);
            char third = colors.charAt(i + 2);
            if (first != second) {
                index = i;
                color = third;
            }
            else if (first != third) {
                index = i;
                color = second;
            }
            else if (second != third) {
                index = i;
                color = first;
            }
        }
        if (index == null) {
            return colors;
        }
        return colors.substring(0, index) + color + colors.substring(index + 3);
    }

}
