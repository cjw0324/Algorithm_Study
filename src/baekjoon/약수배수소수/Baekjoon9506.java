package baekjoon.약수배수소수;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
public class Baekjoon9506 {
    public static void main(String[] args) throws IOException{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(buffer.readLine());
        while (num != -1) {
            ArrayList<Integer> yacksu = new ArrayList<Integer>();
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    yacksu.add(i);
                }
            }
            int sum = 0;
            for (int i = 0; i < yacksu.size(); i++) {
                sum += yacksu.get(i);
            }
            if (sum == num) {
                System.out.print(num + " = ");
                for (int i = 0; i < yacksu.size(); i++) {
                    System.out.print(yacksu.get(i));
                    if (i + 1 != yacksu.size()) {
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            } else {
                System.out.println(num +" is NOT perfect.");
            }
            num = Integer.parseInt(buffer.readLine());
        }
    }
}
