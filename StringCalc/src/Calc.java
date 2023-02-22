public class Calc extends Main{
    private static String result;

    public static String calc(String input) throws Exception
    {

        String[] words = input.split("\"");
        String num1 = words[1];

        if (num1.length() > 10)
        {
            throw new Exception();
        }

////////////////////////////////////////

        if (input.contains("+") || (input.contains("-")))
        {
            String num2 = words[3];
            if (input.contains("+"))
            {
                result = num1 + num2;
            } else if (input.contains("-"))
            {
                result = num1.replace(num2, "");
            }
        }

////////////////////////////////////////

        if (input.contains("*"))
        {
            String[] right = input.split(" \\*");
            String num2 = right[1];
            num2 = num2.replace(" ", "");

            if (Integer.parseInt(num2) <= 10)
            {
                result = num1.repeat(Integer.parseInt(num2));
            } else {
                throw new Exception();
            }
        }

////////////////////////////////////////

        if (input.contains("/"))
        {

            String[] right = input.split("/");
            String num2 = right[1];
            num2 = num2.replace(" ", "");
            int del = num1.length() / Integer.parseInt(num2);

            if (Integer.parseInt(num2) <= 10)
            {
                result = num1.substring(0, del);
            } else {
                throw new Exception();
            }
        }
        if (result.length() <= 40) {
            System.out.println(result);
        } else {
            System.out.println(result.substring(0, 40) + "...");
        }
        return result;
    }
}
