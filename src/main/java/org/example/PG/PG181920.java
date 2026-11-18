package org.example.PG;

import org.example.Solution;

import java.util.Arrays;

public class PG181920 {
    public static void main(String[] args) {
        PG181920 sol = new PG181920();
        int[] result = sol.solution(3, 10);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int start_num, int end_num) {

        int[] answer = new int[end_num - start_num + 1];
        for (int i = start_num; i <= end_num; i++) {
            answer[i - start_num] = i;
        }
        return answer;
    }
}
