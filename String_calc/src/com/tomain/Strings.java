package com.tomain;
public class Strings extends Calculate {
    public static String plus(String in) throws Exception {

        Calculate calculate = new Calculate();
        calculate.calc(in);

        switch (actions[actionIndex]) {
            case "+":
                result = a.concat(b);
                break;
            case "-":
                result = a.replace(b, "");
                break;
            case "*":
                int multiplier = Integer.parseInt(b);
                    for (int i = 1; i <= multiplier; i++) {
                        result += a;
                    }
                    break;
            case "/":
                int del = a.length() / Integer.parseInt(b);
                result = a.substring(0, del);
                break;
            default: throw new Exception("nope");
        }
        return (result);
    }
}
// if (Integer.parseInt(a) > 10){
//            throw new Exception("nonono");
//        }