package org.example.PG;


public class PG181943 {
    public static void main(String[] args) {
        PG181943 sol = new PG181943();
        String result = sol.solution("He11oWor1d", "lloWorl", 2);
        System.out.println(result); // HelloWorld

        result = sol.solution("Program29b8UYP", "merS123", 7);
        System.out.println(result); // ProgrammerS123
    }

    public String solution(String my_string, String overwrite_string, int s) {
        return my_string.substring(0, s)
                + overwrite_string
                + my_string.substring(s + overwrite_string.length());
    }
}
