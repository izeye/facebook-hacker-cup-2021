package hackercup.year2020.qr.problem1;

import java.util.Scanner;

/**
 * Solution for Problem A: Travel Restrictions - Qualification Round - Facebook Hacker Cup 2020.
 *
 * @author Johnny Lim
 */
public class Solution {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int cases = in.nextInt();
            for (int t = 1; t <= cases; t++) {
                int n = in.nextInt();
                String incoming = in.next();
                String outgoing = in.next();

                System.out.printf("Case #%d:%n", t);
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        boolean allowed = isAllowed(incoming, outgoing, i, j);
                        System.out.print(allowed ? 'Y' : 'N');
                    }
                    System.out.println();
                }
            }
        }
    }

    private static boolean isAllowed(String incoming, String outgoing, int i, int j) {
        if (i == j) {
            return true;
        }
        if (i < j) {
            for (int k = i; k < j; k++) {
                if (!isAdjacentAllowed(incoming, outgoing, k, k + 1)) {
                    return false;
                }
            }
            return true;
        }
        for (int k = i; k > j; k--) {
            if (!isAdjacentAllowed(incoming, outgoing, k, k - 1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isAdjacentAllowed(String incoming, String outgoing, int i, int j) {
        return outgoing.charAt(i) == 'Y' && incoming.charAt(j) == 'Y';
    }

}
