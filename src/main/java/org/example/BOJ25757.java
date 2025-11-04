package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BOJ25757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int player = sc.nextInt();
        char game = sc.next().charAt(0);
        sc.nextLine();

        Set<String> uniqueNames = new HashSet<>();
        for (int i = 0; i < player; i++) {
            uniqueNames.add(sc.nextLine());
        }

        int groupSize = 0;

        if(game == 'Y') groupSize = 2;
        if(game == 'F') groupSize = 3;
        if(game == 'O') groupSize = 4;

        int gameCount = uniqueNames.size() / (groupSize - 1);

        System.out.println(gameCount);
    }
}
