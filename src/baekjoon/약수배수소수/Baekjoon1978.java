package baekjoon.약수배수소수;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
public class Baekjoon1978 {
    public static void main(String[] args) throws IOException{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(buffer.readLine());
        String[] temp = buffer.readLine().split(" ");
        int sosuNumbers = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(temp[i]);
            int sosu = 0;
            int count = 1;
            while (count <= num) {
                if (num % count == 0) {
                    sosu++;
                }
                count++;
            }
            if (sosu == 2) {
                sosuNumbers++;
            }
        }
        System.out.println(sosuNumbers);
    }

}
