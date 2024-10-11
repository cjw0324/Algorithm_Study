package baekjoon.집합과맵;
import java.io.*;
import java.nio.Buffer;
import java.util.*;
public class Baekjoon1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = buffer.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);
        HashMap<String, Integer> doogam = new HashMap<String, Integer>();
        ArrayList<String> name = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String monster = buffer.readLine();
            doogam.put(monster, i);
            name.add(monster);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < m; i++) {
            String inputLine = buffer.readLine();
            if (doogam.get(inputLine) != null) {   //이름으로 찾기
                bw.write(doogam.get(inputLine)+1+"\n");
            } else {  //번호로 찾기
                bw.write(name.get(Integer.parseInt(inputLine)-1)+"\n");
            }
        }
        buffer.close();
        bw.flush();
        bw.close();

    }
}
/*
26 5
Bulbasaur   //도감 시작
Ivysaur
Venusaur
Charmander
Charmeleon
Charizard
Squirtle
Wartortle
Blastoise
Caterpie
Metapod
Butterfree
Weedle
Kakuna
Beedrill
Pidgey
Pidgeotto
Pidgeot
Rattata
Raticate
Spearow
Fearow
Ekans
Arbok
Pikachu
Raichu  //도감 끝
25
Raichu
3
Pidgey
Kakuna
 */