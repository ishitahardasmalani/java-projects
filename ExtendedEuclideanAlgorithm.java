import java.io.*;
import java.util.*;

public class ExtendedEuclideanAlgorithm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int r = a % b, q = a / b, r1 = a, r2 = b, s1 = 1, s2 = 0, t1 = 0, t2 = 1;

        int t = t1 - q * t2;
        int s = s1 - q * s2;
        System.out.println("q\tr1\tr2\tr\ts1\ts2\ts\tt1\tt2\tt\t");
        while (r != 0) {
            System.out.println(q + "\t" + r1 + "\t" + r2 + "\t" + r + "\t" + s1 + "\t" + s2 + "\t" + s + "\t" + t1 + "\t"
                    + t2 + "\t" + t);
            r1 = r2;
            r2 = r;
            r = r1 % r2;
            q = r1 / r2;
            s1 = s2;
            s2 = s;
            t1 = t2;
            t2 = t;
            t = t1 - q * t2;
            s = s1 - q * s2;
        }
        System.out.println(q + "\t" + r1 + "\t" + r2 + "\t" + r + "\t" + s1 + "\t" + s2 + "\t" + s + "\t" + t1 + "\t"
                + t2 + "\t" + t);
        System.out.println("GCD: " + r2);
        System.out.println("Value of s: " + s2 + " Value of t: " + t2);
        int ans = a * s2 + b * t2;
        System.out.println("ax + by: " + a + "*" + s2 + "+" + b + "*" + t2 + "=" + ans);
    }
}
