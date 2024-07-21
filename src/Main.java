import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("cowsignal.in"));
        PrintWriter pw = new PrintWriter("cowsignal.out");

        int M = sc.nextInt();
        int N = sc.nextInt();
        int K = sc.nextInt();
        String[][] sign = new String[M*K][N*K];

        String[][] prev = new String[M][N];
        for (int i = 0; i < M; i++) {
            String str = sc.next();
            for(int row = 0; row < K; row++) {
                for (int j = 0; j < N; j++) {
                    for(int print = 0; print < K; print++) {
                        pw.print(str.charAt(j));
                    }
                }
                pw.println();
            }
        }
        pw.close();
    }
}