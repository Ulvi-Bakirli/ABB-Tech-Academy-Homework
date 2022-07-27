import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        String[][] shootingArea = new String[5][5];
        Random random = new Random();
        int targetRow = random.nextInt(5);
        int targetColumn = random.nextInt(5);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                shootingArea[i][j] = "- ";
            }
        }

        System.out.println("All set. Get ready to rumble!");

        while (true) {
            System.out.print("Enter a line to fire: ");
            int line = scanner.nextInt();
            if (line > 5 || line < 0) {
                System.out.println("Please, fire a line between 1-5");
                continue;
            }

            System.out.print("Enter shooting bar: ");
            int bar = scanner.nextInt();
            if (bar > 5 || bar < 0) {
                System.out.println("Please, shoot a bar between 1-5");
                continue;
            }

            shootingArea[line - 1][bar - 1] = "* ";

            if (line - 1 == targetRow && bar - 1 == targetColumn) {
                System.out.println("You have won!");
                shootingArea[targetRow][targetColumn] = "X ";

                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print(shootingArea[i][j]);
                    }
                    System.out.print("\n");
                }
                break;
            }

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(shootingArea[i][j]);
                }
                System.out.print("\n");
            }
        }
    }
}
