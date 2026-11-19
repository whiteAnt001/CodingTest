package org.example.PG;

import org.example.Solution;

import java.util.HashMap;
import java.util.Map;

public class PG120812 {
    public static void main(String[] args) {
        PG120812 sol = new PG120812();
        int result = sol.solution(new int[]{1, 2, 3, 3, 3, 4});
        System.out.println(result);

        result = sol.solution(new int[]{1, 1, 2, 2});
        System.out.println(result);

        result = sol.solution(new int[]{1});
        System.out.println(result);
    }

    public int solution(int[] array) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            System.out.println(map);
        }

        int max = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int num = e.getKey();
            int cnt = e.getValue();

            System.out.println("cnt값 : " + cnt);
            if (cnt > max) {
                max = cnt;
                System.out.println("max값 : " + max);
                answer = num;
            } else if (cnt == max) {
                answer = -1;
            }

        }
        return answer;
    }
}
