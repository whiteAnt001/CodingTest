package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] numToName = new String[n + 1];
        HashMap<String, Integer> nameToNum = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            numToName[i] = name;
            nameToNum.put(name, i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String q = br.readLine();
            if (Character.isDigit(q.charAt(0))) {
                sb.append(numToName[Integer.parseInt(q)]).append("\n");
            } else {
                sb.append(nameToNum.get(q)).append("\n");
            }
        }
        System.out.print(sb);
    }
}
