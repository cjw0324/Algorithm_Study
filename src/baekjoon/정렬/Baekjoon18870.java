package baekjoon.정렬;

import java.io.*;
import java.util.*;

public class Baekjoon18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(buffer.readLine());
        String[] temp = buffer.readLine().split(" ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }
        //arr = 2 4 -10 4 -9
        buffer.close();

        int[] copyArr = arr.clone();
        Arrays.sort(copyArr);
        //copyArr = -10 -9 2 4 4

        copyArr = Arrays.stream(copyArr).distinct().toArray(); // 중복 제거
        //copyArr = -10 -9 2 4

        HashMap<Integer, Integer> hashArr = new HashMap<>(); //hashArr : <-10,0> , <-9,1>, <2,2>, <4,3>
        for (int i = 0; i < copyArr.length; i++) {
            hashArr.put(copyArr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            bw.write(Integer.toString(hashArr.get(arr[i])) + " ");
        }

        bw.flush();
        bw.close();

    }
}


//          arr = 1000 999 1000 999 1000 999
// afterSortArr = 999 999 999 1000 1000
//       result = 0   0    0   1    1
//
/**
 * ArrayList<Integer> arr = new ArrayList<>();
 *         for (int i = 0; i < N; i++) {
 *             arr.add(Integer.parseInt(temp[i]));
 *         }
 *         ArrayList<Integer> afterSortArr = new ArrayList<>();
 *         for (Integer i : arr) {
 *             afterSortArr.add(i);
 *         }
 *         // arr[] = 2 4 -10 4 -9 -> 2개, 3개, 0개, 3개, 1개
 *         Collections.sort(afterSortArr); // -10 -9 2 4 4 -> 0,1,2,3,4 afterSortArr의 index 들이 결과값.
 *
 *         ArrayList<Integer> result = new ArrayList<>();
 *         int indexCheck = 0;
 *         for (int i = 0; i < N; i++) {
 *             if (i == 0) {
 *                 result.add(indexCheck);
 *             } else if (afterSortArr.get(i).equals(afterSortArr.get(i-1))) {
 *                 result.add(indexCheck);
 * //                System.out.println("i == i-1");
 *             } else {
 *                 indexCheck++;
 *                 result.add(indexCheck);
 *             }
 *         }
 *
 *         StringBuilder stringBuilder = new StringBuilder();
 *         for (int i = 0; i < N; i++) {
 * //            arr.get(i) -> 2
 * //            afterSortArr.indexOf(arr.get(i)) //-> 2의 afterSortArr에서의 index를 구함.
 *             stringBuilder.append(result.get(afterSortArr.indexOf(arr.get(i)))).append(" ");
 *         }
 *         System.out.println(stringBuilder);
 */
// indexOf 의 시간복잡도는 O(n), for 문 의 시간복잡도는 O(n)
// for 문 안에 indexOf 가 있으면 O(N^2) 시간 복잡도를 가져 시간초과가 발생할 수 있다.