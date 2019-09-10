import java.util.Scanner;

public class DaysOfTheMonth {
    public static void main(String[] args) {
        System.out.println("Number of days in the month:");
        Scanner scanner = new Scanner(System.in);
        int month = -1;
        while (month < 1 || month > 12) {
            System.out.println("Enter the Month? ");
            month = scanner.nextInt();
            switch (month) {
                case 2:
                    System.out.printf("The Month %d has 28 or 29 days!", month);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.printf("The Month %d has 30 days!", month);
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.printf("The Month %d has 31 days!", month);
                    break;
                default:
                    System.out.println("Enter wrong!");
            }
        }
    }
}
