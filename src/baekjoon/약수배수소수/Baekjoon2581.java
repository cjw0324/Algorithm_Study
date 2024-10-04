package baekjoon.약수배수소수;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
public class Baekjoon2581 {
    public static void main(String[] args) throws IOException{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(buffer.readLine());
        int N = Integer.parseInt(buffer.readLine());

        ArrayList<Integer> sosuList = new ArrayList<Integer>();
        for (int i = M; i <= N; i++) {
            int sosu = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sosu++;
                }
            }
            if (sosu == 2) {
                sosuList.add(i);
            }
        }
        if (sosuList.size() == 0) {
            System.out.println("-1");
        } else {
            int sum = 0;
            for (int i = 0; i < sosuList.size(); i++) {
                sum += sosuList.get(i);
            }
            System.out.println(sum);
            System.out.println(sosuList.get(0));
        }
    }
}
