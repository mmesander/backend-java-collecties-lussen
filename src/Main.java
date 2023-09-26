import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] alpabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};

        Translator translator = new Translator(numeric, alpabetic);

        boolean play = true;
        String ongeldig = "Invoer is ongeldig, voer een waarde in van 0 t/m 9";

        Scanner scanner = new Scanner(System.in);

        while (play) {
            System.out.println("Type 'STOP' om te stoppen\nType 'VERTAAL' om te vertalen");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                play = false;
                break;
            } else if (input.equalsIgnoreCase("vertaal")) {
                System.out.println("Typ een cijfer in van 0 t/m 9");
                int number = scanner.nextInt();
                scanner.nextLine();
                if (number < 10 && number >= 0) {

                }
            }

        }








    }
}
