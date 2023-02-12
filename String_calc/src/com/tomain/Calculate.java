package com.tomain;

public class Calculate {
    static String a;
    static String b;
    static String result;
    static String[] actions = {"+", "-", "/", "*"};
    static String[] regexActions = {"\\+", "-", "/", "\\*"};
    static int actionIndex = -1;
    public static void calc(String input) throws Exception {
        for (int i = 0; i < actions.length; i++) {
            if (input.contains(actions[i])) {
                actionIndex = i;
                break;
            }
        }
        if (actionIndex == -1) {
            throw new Exception("");
        }

        String[] data = input.split(regexActions[actionIndex]);

        a = data[0];
        b = data[1];

        if (data.length != 2) {
            throw new Exception("Не больше двух операторов");
        }

        if (a.length() > 10 || b.length() > 10){
            throw new Exception("nope");
        }
    }
}
