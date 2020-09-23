package data;

public class GameLibrary {
    private Game[] games; //array for games
    private int nextPosition;
    public GameLibrary(){
        this.games=new Game [10];

    }
    public void addGame(Game game){
        if (nextPosition< this.games.length) {
            games[nextPosition] = game;
            nextPosition++;
        }else {
            Game[] biggerGame = new Game[games.length + 1];
            for (int i = 0; i < games.length; i++) {
                biggerGame[i] = games[i];
            }
            this.games = biggerGame;
            biggerGame[nextPosition] = game;
            nextPosition++;
        }


    }
    public void removeAGame(int id){
       for (int i = 0; i< games.length;i++){
           if (games [i] !=null && games[i].getId()==id){
               games[i]=null;
               System.out.println("Game is removed!");
               return;
           }
           }
        System.out.println("Game with id #" +id+ " not found");
       }

    }

//<ID> : <Title> (<genre>). <daily rent>. Status: <rent status>
//    public void addGame(Game game){
//        for (int i = 0; i < games.length; i++) {//searching for the first empty cell
//            if (games[i] == null) {
//                games[i] = game;//put new game into empty cell
//                System.out.println("Game N " + (i+1) + " was added to DART");
//                return;//stop search
//            }
//        }
//        Game[] moreGames = new Game[games.length + 1];
//        System.arraycopy(games, 0, moreGames, 0, games.length);
//        moreGames[games.length] = game;
//        games = moreGames;
//        System.out.println("Game N " + games.length + " was added to DART");
//    }

