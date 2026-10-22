import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int money = 5;

        while (money > 0) {
            money = money - 1;

            int number1 = random.nextInt(10) + 1;
            int number2 = random.nextInt(10) + 1;
            int number3 = random.nextInt(10) + 1;

            System.out.println(number1);
            System.out.println(number2);
            System.out.println(number3);

            int sevens = 0;

            if (number1 == 7) {
                sevens++;
            }
            if (number2 == 7) {
                sevens++;
            }
            if (number3 == 7) {
                sevens++;
            }

            if (sevens == 1) {
                money = money + 3;
            } else if (sevens == 2) {
                money = money + 5;
            } else if (sevens == 3) {
                money = money + 7;
            }

            if (sevens > 0) {
                System.out.println("You won!");
            } else {
                System.out.println("You lost!");
            }

            System.out.println("Money: " + money + " euros");
        }
    }
}