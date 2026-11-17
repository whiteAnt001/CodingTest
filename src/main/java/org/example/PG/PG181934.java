package org.example.PG;

import org.example.Solution;

public class PG181934 {
    public static void main(String[] args) {
        PG181934 sol = new PG181934();
        int result = sol.solution("<", "=", 20, 50);
        System.out.println(result); // 1

        result = sol.solution(">", "!", 41, 78);
        System.out.println(result); // 0
    }

    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;


        switch (ineq + eq) {
            case ">=":
                return n>=m ? 1 : 0;
            case "<=":
                return n<=m ? 1 : 0;
            case ">!":
                return n>m ? 1 : 0;
            case "<!":
                return n<m ? 1 : 0;
            default:
                answer = 0;
        }
        return 0;
    }
}
