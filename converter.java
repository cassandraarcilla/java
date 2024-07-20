import java.util.Scanner;

public class converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(
                "This Java Application will convert minutes to equivalent days,hours, and remaining minutes.\nPlease enter the number of minutes: ");
        int totalMinutes = scanner.nextInt();

        int days = totalMinutes / (24 * 60);
        int remainingHours = (totalMinutes % (24 * 60)) / 60;
        int remainingMinutes = totalMinutes % 60;

        System.out.println("For " + totalMinutes + " minutes equals " + days + " days, " + remainingHours
                + " hours, and " + remainingMinutes + " remaining minutes.");

        scanner.close();
    }
}