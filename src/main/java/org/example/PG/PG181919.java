package org.example.PG;

import org.example.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PG181919 {
    public static void main(String[] args) {
        PG181919 sol = new PG181919();
        int[] result = sol.solution(10);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while(n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }

            list.add(n);
        }
        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
