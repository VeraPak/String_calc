import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String input = scan.nextLine();
        System.out.print(" = " + Calculate.calc(input));
    }
}