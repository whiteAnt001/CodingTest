package org.example;

import java.util.Scanner;

public class BOJ22966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        String minStr = "";
        int minNum = Integer.MAX_VALUE;

        for(int i = 0; i < a; i++){
            String str = sc.next();
            int num = sc.nextInt();


            if(minNum > num) {
                minNum = num;
                minStr = str;
            }
        }

        System.out.println(minStr);
    }
}
