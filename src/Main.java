import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        A_week aWeek = A_week.valueOf(scanner.nextLine());

        switch (aWeek) {
            case MONDAY -> A_week.MONDAY.method();
            case TUESDAY -> A_week.TUESDAY.method();
        }

    }
}