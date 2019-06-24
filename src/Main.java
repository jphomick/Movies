import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        String input = "";

        while (!input.toLowerCase().equals("q")) {
            System.out.println("Enter a movie or type 'q' to exit:");
            input = read.nextLine();
            if (!input.toLowerCase().equals("q")) {
                movies.add(input);
            }
        }

        for (String name : movies) {
            System.out.println(name);
        }
    }
}
