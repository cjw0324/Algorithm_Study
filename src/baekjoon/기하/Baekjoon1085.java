package baekjoon.기하;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Baekjoon1085 {
    public static void main(String[] args) throws IOException{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = buffer.readLine().split(" ");

        int[] dis = {
                Integer.parseInt(temp[0]),  //6
                Integer.parseInt(temp[1]),  //2
                Integer.parseInt(temp[2]) - Integer.parseInt(temp[0]),  //4
                Integer.parseInt(temp[3]) - Integer.parseInt(temp[1])   //1
        };
        System.out.println(Arrays.stream(dis).min().getAsInt());
    }
}
