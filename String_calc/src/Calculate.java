public class Calculate {
    public static String calc(String input) throws Exception {
        String a;
        String b;
        String result;
        String[] actions = {"+", "-", "/", "*"};
        String[] regexActions = {"\\+", "-", "/", "\\*"};
        int actionIndex = -1;

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
        switch (actions[actionIndex]) {
            case "+":
                result = a.concat(b);
                break;
            case "-":
                result = a.replace(b, "");
                break;
            case "*":
                int multiplier = Integer.parseInt(b);
                result = "";
                for (int i = 0; i < multiplier; i++) {
                    result += a;
                }
                break;
            case "/":
                int del = a.length() / Integer.parseInt(b);
                result = a.substring(0, del);
                break;
            default:
                throw new Exception("Не найден оператор");
        }
        return (result);
    }
}
