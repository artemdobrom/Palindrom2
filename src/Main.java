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

        if  (checkForPalindorome.length() <= 1) {

            System.out.println ("Слишком короктое слово для проверки на палиндром");
        }
        for (int i = 0; i < checkForPalindorome.length()/2; i++) {

            if (checkForPalindorome.charAt(i) != checkForPalindorome.charAt(checkForPalindorome.length() - i - 1)) {
                System.out.println("Это не палиндром");
                break;
            } else if (i+1 == (checkForPalindorome.length() / 2)) {
                 System.out.println("Это палиндром");
            }
            }
        }
    }






