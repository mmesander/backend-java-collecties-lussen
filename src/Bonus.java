import java.util.*;

public class Bonus {

    public static void main(String[] args) {
        HashSet<Integer> secretnumber = randomnumbergenerator();
        boolean play = true;

        while (play) {
                String stringnumber = setToStringConverter(secretnumber);
                System.out.println(stringnumber);
                feedback(stringnumber);
        }
    }

    public static HashSet<Integer> randomnumbergenerator(){
        Random randomNumber = new Random();
        HashSet<Integer> secretNumbers = new HashSet<>();
        while (secretNumbers.size() < 4) {
            int secretNumber = randomNumber.nextInt(9) + 1;
            secretNumbers.add(secretNumber);
            System.out.println(secretNumbers);
        }
        return secretNumbers;

    }

    public static String setToStringConverter(HashSet<Integer> secretnumbers) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < secretnumbers.size(); i++) {
            string.append(secretnumbers);
        }
        return string.toString();
    }



    public static void feedback(String stringnumber) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder feedback = new StringBuilder();
        System.out.println("+ = juiste nummer op de juiste plek, O = juiste nummer verkeerde plek, X = verkeerde nummer");
        System.out.println("Doe een gok, Let op vul 4 getallen in.");
        String guess = scanner.nextLine();
        if (Objects.equals(guess, stringnumber)) {
            System.out.println("gefeliciteerd je hebt het goed");
        } else {
            for (int i = 0; i < 4; i++) {
                if (guess.substring(i, i + 1).equals(stringnumber.substring(i, i + 1))) {
                    feedback.append("+");
                } else if (stringnumber.contains(guess.substring(i, i + 1))) {
                    feedback.append("0");
                } else {
                    feedback.append("X");
                }
            }
        }
        System.out.println(feedback.toString());
    }
}
