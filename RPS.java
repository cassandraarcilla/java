import java.util.Scanner;

public class RPS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This is a Rock Paper Scissors game!");
        System.out.println("Weapons: [R] Rock [P] Paper [S] Scissors");

        System.out.print("Player 1: Enter your weapon: ");
        String player1Choice = scanner.next().toUpperCase();

        System.out.print("Player 2: Enter your weapon: ");
        String player2Choice = scanner.next().toUpperCase();

        if (isValidChoice(player1Choice) && isValidChoice(player2Choice)) {
            determineWinner(player1Choice, player2Choice);
        } else {
            System.out.println("Invalid weapon/s");
        }

        scanner.close();
    }

    private static boolean isValidChoice(String choice) {
        return choice.equals("R") || choice.equals("P") || choice.equals("S");
    }

    private static void determineWinner(String player1Choice, String player2Choice) {
        String player1Weapon = getWeaponName(player1Choice);
        String player2Weapon = getWeaponName(player2Choice);

        if (player1Choice.equals(player2Choice)) {
            System.out.println("It's a tie!");
        } else if (
                (player1Choice.equals("R") && player2Choice.equals("S")) ||
                (player1Choice.equals("S") && player2Choice.equals("P")) ||
                (player1Choice.equals("P") && player2Choice.equals("R"))
        ) {
            System.out.println("Result: Player 1 wins! " + player1Weapon + " beats " + player2Weapon + "!");
        } else {
            System.out.println("Result: Player 2 wins! " + player2Weapon + " beats " + player1Weapon + "!");
        }
    }

    private static String getWeaponName(String choice) {
        switch (choice) {
            case "R":
                return "Rock";
            case "P":
                return "Paper";
            case "S":
                return "Scissors";
            default:
                return "Unknown";
        }
    }
}