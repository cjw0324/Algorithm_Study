package baekjoon.집합과맵;
import java.io.*;
import java.util.*;

public class Baekjoon7785 {
    public static void main(String[] args) throws IOException{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buffer.readLine());
        HashSet<String> userEnter = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String[] log = buffer.readLine().split(" ");
            if (log[1].equals("enter")) {
                userEnter.add(log[0]);
            }
            if (log[1].equals("leave") && !userEnter.add(log[0])) {
                userEnter.remove(log[0]);
            }
        }
        ArrayList<String> result = new ArrayList<>(userEnter);
        Collections.sort(result);
        for (int i = result.size()-1; i >= 0; i--) {
            System.out.println(result.get(i));
        }
    }
}
