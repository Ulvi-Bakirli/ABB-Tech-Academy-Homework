import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        String[][] schedule = new String[7][2];
        schedule[0][0] = "Monday";
        schedule[0][1] = "Go to courses; watch a film";
        schedule[1][0] = "Tuesday";
        schedule[1][1] = "Go to gym; write a blog post";
        schedule[2][0] = "Wednesday";
        schedule[2][1] = "Go to instrument course";
        schedule[3][0] = "Thursday";
        schedule[3][1] = "Go to programming course";
        schedule[4][0] = "Friday";
        schedule[4][1] = "Meet with friends after work";
        schedule[5][0] = "Saturday";
        schedule[5][1] = "Go to camping";
        schedule[6][0] = "Sunday";
        schedule[6][1] = "Home cleaning; go to programming course";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please, input the day of the week: ");
            String inputDay = scanner.nextLine();
            String input = inputDay.toLowerCase().trim();

            if (input.equals("exit")) {
                System.out.println("See you soon!");
                break;
            }

            if (input.contains("change")) {
                String dayLowerCase = input.substring(6).toLowerCase().trim();
                String dayFirstLetter = dayLowerCase.substring(0,1).toUpperCase();
                String day = dayFirstLetter + dayLowerCase.substring(1);

                System.out.print("Please, input new tasks for " + day + ": ");
                String newTask = scanner.nextLine();

                for (int i = 0; i < 7; i++) {
                    if (schedule[i][0].equals(day)) {
                        schedule[i][1] = newTask;
                        System.out.println("New task added to " + day);
                        break;
                    }
                }
                continue;
            }

            switch (input) {
                case "monday":
                    System.out.printf("Your tasks for %s: %s\n", schedule[0][0], schedule[0][1]);
                    break;
                case "tuesday":
                    System.out.printf("Your tasks for %s: %s\n", schedule[1][0], schedule[1][1]);
                    break;
                case "wednesday":
                    System.out.printf("Your tasks for %s: %s\n", schedule[2][0], schedule[2][1]);
                    break;
                case "thursday":
                    System.out.printf("Your tasks for %s: %s\n", schedule[3][0], schedule[3][1]);
                    break;
                case "friday":
                    System.out.printf("Your tasks for %s: %s\n", schedule[4][0], schedule[4][1]);
                    break;
                case "saturday":
                    System.out.printf("Your tasks for %s: %s\n", schedule[5][0], schedule[5][1]);
                    break;
                case "sunday":
                    System.out.printf("Your tasks for %s: %s\n", schedule[6][0], schedule[6][1]);
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
                    break;
            }
        }
    }
}
