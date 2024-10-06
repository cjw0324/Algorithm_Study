package baekjoon.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Baekjoon10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(buffer.readLine());
        String[][] arr = new String[N][3];
        for (int i = 0; i < N; i++) {
            String[] temp = buffer.readLine().split(" ");
            arr[i][0] = temp[0]; //age
            arr[i][1] = temp[1]; //name
            arr[i][2] = Integer.toString(i);  //sequence
        }


        Arrays.sort(arr, new Comparator<String[]>() {

            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0])!=Integer.parseInt(o2[0])
                        ?  Integer.parseInt(o1[0]) - Integer.parseInt(o2[0])// 나이가 다를 때 -> 나이로 비교
                        :  Integer.parseInt(o1[2]) - Integer.parseInt(o2[2])// 나이가 같을 때 -> 가입한 sequence 순서로. o[2] 비교
                ;
            }
        });

        for (String[] strings : arr) {
            System.out.println(strings[0]+" "+strings[1]);
        }
    }
}
