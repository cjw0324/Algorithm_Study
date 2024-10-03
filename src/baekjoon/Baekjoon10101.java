package baekjoon;
import java.io.*;
import java.util.*;

public class Baekjoon10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(buffer.readLine());
        int y = Integer.parseInt(buffer.readLine());
        int z = Integer.parseInt(buffer.readLine());

        if (x + y + z != 180) {
            System.out.println("Error");
            return;
        }
        else
        {
            if (x == y && y == z && x == 60) {
                System.out.println("Equilateral");
            } else if (x != y && y != z && x != z) {

                System.out.println("Scalene");
            } else {
                System.out.println("Isosceles");
            }

        }
    }
}


