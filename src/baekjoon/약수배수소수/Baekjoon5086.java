package baekjoon.약수배수소수;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
public class Baekjoon5086 {
    public static void main(String[] args) throws IOException{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[2];
        String[] temp = buffer.readLine().split(" ");
        nums[0] = Integer.parseInt(temp[0]);
        nums[1] = Integer.parseInt(temp[1]);

        while (nums[0] != 0 && nums[1] != 0) {
            if (nums[1] >= nums[0]) {
                if (nums[1] % nums[0] == 0) {
                    System.out.println("factor");
                } else {
                    System.out.println("neither");
                }
            } else {
                if (nums[0] % nums[1] == 0) {
                    System.out.println("multiple");
                } else {
                    System.out.println("neither");
                }

            }
            temp = buffer.readLine().split(" ");
            nums[0] = Integer.parseInt(temp[0]);
            nums[1] = Integer.parseInt(temp[1]);
        }
    }
}
