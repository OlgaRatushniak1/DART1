package data;

import java.util.Scanner;

public class Game {
    private long id;
    private String title;
    private String genre;
    private double dailyRent;
    private String rentStatus = "available";

    public Game(int id) {
        this.id = id;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter title of a game:");
        title = scanner.next();
        System.out.println("Please enter genre of a game:");
        genre = scanner.next();
        System.out.println("Please enter daily rent of a game:");
        dailyRent = scanner.nextDouble();
        System.out.println("Rent status: "+rentStatus);
        System.out.println();
        System.out.println("You created a new game N: "+id+"!");
        //this.id=id;
//        this.title=title;
//        this.genre=genre;
//        this.dailyRent=dailyRent;
//        this.rentStatus=rentStatus;

    }
    public long getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getGenre(){
        return genre;
    }
    public double getDailyRent(){
        return dailyRent;
    }
    public String getRentStatus(){
        return rentStatus;
    }
}
