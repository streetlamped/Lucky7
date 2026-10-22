import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();

        int number1 = random.nextInt(10) + 1;
        int number2 = random.nextInt(10) + 1;
        int number3 = random.nextInt(10) + 1;

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        if (number1 == 7 || number2 == 7 || number3 == 7) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
    }
}