import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner dialog = new Scanner(System.in);
        System.out.println("Напишите, что Вы хотите проверить на палиндром");
        String checkForPalindorome = dialog.nextLine();

        checkForPalindorome = checkForPalindorome.replace(",", "");
        checkForPalindorome = checkForPalindorome.replace(" ", "");
        checkForPalindorome = checkForPalindorome.replace(".", "");
        checkForPalindorome = checkForPalindorome.replace("-", "");
        checkForPalindorome = checkForPalindorome.replace("=", "");
        checkForPalindorome = checkForPalindorome.replace("+", "");
        checkForPalindorome = checkForPalindorome.replace("_", "");

        System.out.println("проверка строчки: "+checkForPalindorome);
        System.out.println();
        for (int i = 0; i < checkForPalindorome.length()/2; i++) {
            System.out.print(checkForPalindorome.charAt(i) + "-" + checkForPalindorome.charAt(checkForPalindorome.length() - i - 1));

            if (checkForPalindorome.charAt(i) == checkForPalindorome.charAt(checkForPalindorome.length() - i - 1)) {
                System.out.println(" -эта пара палиндром");

            } else if (checkForPalindorome.charAt(i) != checkForPalindorome.charAt(checkForPalindorome.length() - i - 1)) {

                System.out.println(" -эта пара не палиндром");
            }
            }
            }
        }





