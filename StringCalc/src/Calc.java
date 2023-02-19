public class Calc {
    static char action;
    static String[] data;
    static String result;
    public static String calc(String input) throws Exception {

        if (input.contains(" + ")) {
            data = input.split(" \\+ ");
            action = '+';
        } else if (input.contains(" - ")) {
            data = input.split(" - ");
            action = '-';
        } else if (input.contains(" * ")) {
            data = input.split(" \\* ");
            action = '*';
        } else if (input.contains(" / ")) {
            data = input.split(" / ");
            action = '/';
        }else{
            throw new Exception("Некорректный знак действия");
        }

        if (action == '*' || action == '/') {
            if (data[1].contains("\"")) throw new Exception("Строчку можно делить или умножать только на число");
        }

        for (int i = 0; i < data.length; i++) {
            data[i] = data[i].replace("\"", "");
        }

        String a = data[0];
        String b = data[1];

        if (data.length != 2) {
            throw new Exception("Не больше двух операторов");
        }

        if (a.length() > 10 || b.length() > 10){
            throw new Exception("не более 10 значений");
        }

        switch (action) {
            case '+':
                result = a.concat(b);
                break;
            case '-':
                result = a.replace(b, "");
                break;
            case '*':
                int multiplier = Integer.parseInt(b);
                if (Integer.parseInt(b) <= 10) {
                    for (int i = 0; i < multiplier; i++) {
                        result += a;
                    }
                }else{
                    throw new Exception("Введите число до 10");
                }
                break;

            case '/':
                int del = a.length() / Integer.parseInt(b);
                if (Integer.parseInt(b) <= 10) {
                    result = a.substring(0, del);
                } else{
                    throw new Exception("Введите число до 10");
                }
                break;
            default: throw new Exception("nope");
        }
        return (result);
    }
}
