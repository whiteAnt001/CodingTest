package org.example;

import java.util.Scanner;

public class BOJ25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 20;

        String subjects;
        double points;
        String rating;

        double totalScore = 0;
        double totalPoints = 0;

        for (int i = 0; i < n; i++) {
            subjects = sc.next();
            points = sc.nextDouble();
            rating = sc.next();

            double score = 0;

            switch (rating) {
                case "A+": score = 4.5;
                    break;
                case "A0": score = 4.0;
                    break;
                case "B+": score = 3.5;
                    break;
                case "B0": score = 3.0;
                    break;
                case "C+": score = 2.5;
                    break;
                case "C0": score = 2.0;
                    break;
                case "D+": score = 1.5;
                    break;
                case "D0": score = 1.0;
                    break;
                case "F": score = 0.0;
                    break;
                case "P": continue;
            }

            totalScore += (points * score);
            totalPoints += points;
        }

        double result = totalScore / totalPoints;

        System.out.println(result);

    }
}
