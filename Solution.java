import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String feeOrUpfront(int n, int k, int x, int d, int[] p) {
        // max(k, x% pi)
		int charge = 0;

		k *= 100;

		for(int i = 0; i < n; i++)
			charge += Math.max(k, x * p[i]);

		return charge <= d ? "fee" : "upfront";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int q = in.nextInt();

        for(int a0 = 0; a0 < q; a0++){

            int n = in.nextInt();
            int k = in.nextInt();
            int x = in.nextInt();
            int d = in.nextInt(); // fixed
            int[] p = new int[n];

            for(int p_i = 0; p_i < n; p_i++){
                p[p_i] = in.nextInt();
            }

            String result = feeOrUpfront(n, k, x, d, p);

            System.out.println(result);
        }
        in.close();
    }
}

