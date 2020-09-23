package view;

import data.Customer;
import data.CustomerLibrary;
import data.Game;
import data.GameLibrary;

import java.util.Scanner;

public class Dart {
    Scanner scanner = new Scanner(System.in);
    private int gameLastNumber = 1;
    private int customerLastNumber=1;
    //private Game[] games = new Game[1];//array for games
    private GameLibrary gameLibrary = new GameLibrary();//creating new library for games
    private CustomerLibrary customerLibrary=new CustomerLibrary();

    Dart() {
        System.out.println("Main Menu:\n" +
                "Welcome to DART, your good old game rental system. The competition has no steam to keep up!\n" +
                "Please specify your role by entering one of the options given:\n");
        menu();
    }

    private void menu() {
        System.out.println(
                "1. Enter “M” for Manager \n" +
                        "2. Enter “E” for Employee \n" +
                        "3. Enter “C” for Customer\n" +
                        "4. Enter “X” to exit system");
        System.out.print("Enter you choice: ");
        String choice = scanner.next();
        if (!choice.equals("M") && !choice.equals("E") && !choice.equals("C") && !choice.equals("X")) {
            System.out.println("Invalid input, please try again!");
            menu();
        }

        if (choice.equals("M")) {
            System.out.println("Enter a password:");
            String password = scanner.next();
            if (!password.equals("admin1234")) {
                System.out.println("Invalid password!\n" +
                        "Please try again.");

                menu();//allows go back to menu
            }
            menuManager();
        }
        if (choice.equals("E")) {
            System.out.println("Enter a password:");
            String password = scanner.next();
            if (!password.equals("password123")) {
                System.out.println("Invalid password!\n" +
                        "Please try again.");
                menu();//allows go back to menu
            }
            menuEmployee();
        }
        if (choice.equals("C")) {
            System.out.println("Type one of the options below:\n" +
                    "1. Rent a game\n" +
                    "2. Return a game\n" +
                    "3. Return to Main Menu");
            menuCustomer();


        } else if (choice.equals("X")) {
            System.out.println("Good bye!");
            System.exit(0);
        }
    }


    private void menuManager() {
        System.out.println("Type one of the options below:\n" +
                "1. Add an employee\n" +
                "2. View all employees\n" +
                "3. Return to Main Menu");
        System.out.print("Enter you choice: ");
        String choice = scanner.next();
        switch (choice) {
            //  case "1"->menuAddAnEmployee;
            // case "2"->menuViewAllEmpployees;
            // case "3"->menu();
        }
        menuManager();

    }

    private void menuEmployee() {
        System.out.println("Type one of the options below:\n" +
                "1. Register a game\n" +
                "2. Remove a game\n" +
                "3. Register a customer\n" +
                "4. Remove a customer\n" +
                "5. Show total rent profit\n" +
                "6. View all games\n" +
                "7. Return to Main Menu");
        System.out.print("Enter you choice: ");
        String choice = scanner.next();
        switch (choice) {
            case "1" -> menuRegisterAGame();
            case "2" -> menuRemoveAGame();
            case "3" -> menuRegisterACustomer();
            case "4" -> menuRemoveACustomer();
//                case "5" -> menuShowTotalRentProfit();
//                case "6" -> menuViewAllGames();
            case "7" -> menu();

        }
        menuEmployee();
    }

    private void menuCustomer() {
        System.out.print("Enter you choice: ");
        String choice = scanner.next();
        switch (choice) {
//                case "1"->menuRentAGame;
//                case "2"->menuReturnAGame;
            case "3" -> menu();
        }
        menuCustomer();
    }

    private void menuRegisterAGame() {
        Game game = new Game(gameLastNumber++);//creating new game, next id +1
        gameLibrary.addGame(game);//add new game to library
        System.out.println(gameLastNumber - 1 + " : " + game.getTitle() + " (" + game.getGenre() + "). " + game.getDailyRent() + "$. Status: " + game.getRentStatus());

//        for (int i = 0; i < games.length; i++) {//searching for the first empty cell
//            if (games[i] == null) {
//                games[i] = game;//put new game into empty cell
//                System.out.println("Game N " + i + " was added to DART");
//                return;//stop search
//            }
//        }
//        Game[] moreGames = new Game[games.length + 1];
//        System.arraycopy(games, 0, moreGames, 0, games.length);
//        moreGames[games.length] = game;
//        games = moreGames;
//        System.out.println("Game N" + games.length + "was added to DART");
    }

    private void menuRemoveAGame() {
        System.out.println("Please enter a number of the game you want to remove: ");
        int id = scanner.nextInt();
        gameLibrary.removeAGame(id);
    }

    private void menuRegisterACustomer() {
        System.out.println("Please register customer profile:");
        Customer customer =new Customer(customerLastNumber++);
        customerLibrary.addCustomer(customer);
        System.out.println(customerLastNumber-1+" : "+customer.getName());


    }
    private void menuRemoveACustomer(){
        System.out.println("Please remove a customer specifying ID: ");
        int id = scanner.nextInt();
        customerLibrary.removeACustomer(id);
    }


}
