import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("INPUT:");
        int i;
        i = keyboard.nextInt();
        System.out.println("RESULT:");
        if (i % 2 == 0) {
            System.out.println("Чётное");
        }
        else
            System.out.println("Нечётное");
    }
}