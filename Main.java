public class Main{

    // public List<Song> Songs;
    public static void main(String[] args){

        Main main = new Main();
        
        main.menu();
        
    }

    public void menu(){

        handler songHandler = new handler();

        boolean Continue = true;
        //starts with main menu
        do {
            System.out.println("""
                    Main Menu

                    1. Add song
                    2. Remove song
                    3. View all songs
                    4. View songs with chosen number of plays
                    5. Sort by song title
                    6. Sort by artist name
                    7. Sort by number of plays
                    8. Exit
                    """);
            
            String choice = System.console().readLine("Enter number of option: ");
            //calls function in handler class before returning back to the main menu
            switch (choice) {
                case "1":
                    //add song
                    songHandler.addSong();
                    break;
                case "2":
                    //delete song
                    songHandler.deleteSong();
                    break;
                case "3":
                    //view all
                    songHandler.viewSongs(songHandler.songs);
                    break;
                case "4":
                    //filter view by plays
                    songHandler.viewByPlays();
                    break;
                case "5":
                    //sort by song title
                    songHandler.viewSongs(songHandler.sortByTitle());
                    break;

                case "6":
                    //sort by song artist
                    songHandler.viewSongs(songHandler.sortByArtist());
                    break;
                case "7":
                    //sort by number of plays
                    songHandler.viewSongs(songHandler.sortByPlays());
                    break;
                case "8":
                    //Exit
                    Continue = false;
                    break;

                default:
                    //handles any exceptions
                    System.out.println("Not valid. Please enter a choice (1 to 8)");
                    break;
            }
        } while (Continue);
    }
}