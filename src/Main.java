import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random randomNumber = new Random();

        String[] list = {"Apple", "Orange", "Melon", "Pear"};


        for (int i = 0; i < list.length; i++) {
            int random = randomNumber.nextInt(1, 100);

            System.out.println("Name: " + list[i] + "\nPrice: " + random);
        }

        System.out.print("\nChoose item: ");

        if(scanner.hasNextLine()){

            String name = scanner.nextLine();

            for (int i = 0; i < list.length; i++) {
                if(name.equalsIgnoreCase(list[i])){
                    System.out.println("You choosed: " + list[i]);
                }
            }

        } else {
            System.out.println("Error!");
        }

    }
}